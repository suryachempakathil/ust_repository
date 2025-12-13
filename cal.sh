#!/bin/bash

# Read first number
echo "Enter first number:"
read num1

# Read second number
echo "Enter second number:"
read num2

# Read operator
echo "Enter operator (+, -, *, /):"
read op

# Perform calculation
case $op in
  +)
    result=$((num1 + num2))
    ;;
  -)
    result=$((num1 - num2))
    ;;
  \*)
    result=$((num1 * num2))
    ;;
  /)
    if [ $num2 -eq 0 ]; then
      echo "Error: Division by zero is not allowed"
      exit 1
    fi
    result=$((num1 / num2))
    ;;
  *)
    echo "Invalid operator"
    exit 1
    ;;
esac

# Display result
echo "Result: $result"
