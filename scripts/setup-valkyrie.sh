#!/bin/bash

# Setup script for Valkyrie CLI
# Valkyrie is used to convert SVG files to Compose ImageVector
# https://github.com/ComposeGears/Valkyrie

set -e

VERSION="cli-1.0.0"
TARGET_DIR="valkyrie-cli"
ASSET_NAME="tmp.zip"

echo "====================================="
echo "Valkyrie CLI Setup (${VERSION})"
echo "====================================="
echo ""

# Check if valkyrie is already installed globally
if command -v valkyrie &> /dev/null; then
    INSTALLED_VERSION=$(valkyrie --version 2>/dev/null || echo "unknown")
    echo "Valkyrie CLI is already installed globally: $INSTALLED_VERSION"
    exit 0
fi

# Check if valkyrie is already installed locally
if [ -f "$TARGET_DIR/bin/valkyrie" ]; then
    INSTALLED_VERSION=$("$TARGET_DIR/bin/valkyrie" --version 2>/dev/null || echo "unknown")
    echo "Valkyrie CLI is already installed locally: $INSTALLED_VERSION"
    echo "Location: $TARGET_DIR/bin/valkyrie"
    exit 0
fi

# Get the latest CLI release URL
echo "Fetching release info..."
LATEST_CLI_RELEASE_URL=$(curl --silent "https://api.github.com/repos/ComposeGears/Valkyrie/releases/tags/$VERSION" \
  | jq -r '.assets[] | select(.name | startswith("valkyrie-cli")) | .browser_download_url')

if [ -z "$LATEST_CLI_RELEASE_URL" ] || [ "$LATEST_CLI_RELEASE_URL" = "null" ]; then
    echo "Error: Could not find Valkyrie CLI release"
    exit 1
fi

echo "Downloading from: $LATEST_CLI_RELEASE_URL"
curl -L -o "$ASSET_NAME" "$LATEST_CLI_RELEASE_URL"

echo "Extracting..."
mkdir -p "$TARGET_DIR"
unzip -o "$ASSET_NAME" -d "$TARGET_DIR"

# Cleanup
rm "$ASSET_NAME"

# Verify installation
cd "$TARGET_DIR/bin" || exit
echo ""
echo "Valkyrie CLI installed successfully!"
./valkyrie --version
