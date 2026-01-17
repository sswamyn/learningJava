#!/bin/bash
# Run all examples in the Java Learning Workspace

echo "========================================"
echo "Running all Java Learning Examples"
echo "========================================"
echo ""

examples=(
    "HelloWorld"
    "DataTypes"
    "ControlFlow"
    "OOPConcepts"
    "CollectionsDemo"
    "ExceptionHandling"
    "ModernJavaFeatures"
    "Calculator"
    "SimpleTestDemo"
)

for example in "${examples[@]}"; do
    echo "----------------------------------------"
    echo "Running: $example"
    echo "----------------------------------------"
    java -cp bin com.learning.$example
    echo ""
done

echo "========================================"
echo "All examples completed!"
echo "========================================"
