#!/bin/bash
# Build script for Java learning workspace

echo "Building Java Learning Workspace..."

# Create bin directory if it doesn't exist
mkdir -p bin

# Compile all Java files
echo "Compiling Java files..."
javac -d bin src/main/java/com/learning/*.java

if [ $? -eq 0 ]; then
    echo "Build successful! Compiled classes are in the 'bin' directory."
    echo ""
    echo "To run examples:"
    echo "  java -cp bin com.learning.HelloWorld"
    echo "  java -cp bin com.learning.DataTypes"
    echo "  java -cp bin com.learning.ControlFlow"
    echo "  java -cp bin com.learning.OOPConcepts"
    echo "  java -cp bin com.learning.CollectionsDemo"
    echo "  java -cp bin com.learning.ExceptionHandling"
    echo "  java -cp bin com.learning.ModernJavaFeatures"
else
    echo "Build failed!"
    exit 1
fi
