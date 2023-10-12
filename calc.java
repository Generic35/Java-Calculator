/*
Challenge: Simple Command Line Calculator

Goal: Design a command-line calculator application in Java, which can perform basic arithmetic operations: addition, subtraction, multiplication, and division.

Details
	1.	Create a Calculator class with four methods: add, subtract, multiply, and divide.
	2.	Each method should take two double parameters and return a double. 
      The divide method should handle the case where the second number is zero.
	3.	Test the calculator methods from the main method of a Main class.
*/


class Main {

    // Nested Calculator class
    public static class Calculator {

        // Add method
        public double add(double a, double b) {
            return a + b;
        }

        // Subtract method
        public double subtract(double a, double b) {
            return a - b;
        }

        // Multiply method
        public double multiply(double a, double b) {
            return a * b;
        }

        // Divide method
        public double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed!");
                return 0; // You could also return Double.NaN or throw an exception.
            }
            return a / b;
        }
    }

    // Main method to test the Calculator
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10.5, 5.5)); // Outputs 16.0
        System.out.println("Subtraction: " + calculator.subtract(10.5, 5.5)); // Outputs 5.0
        System.out.println("Multiplication: " + calculator.multiply(10.5, 5.5)); // Outputs 57.75
        System.out.println("Division (valid): " + calculator.divide(10.5, 5.5)); // Outputs 1.9090909090909092
        System.out.println("Division by zero: " + calculator.divide(10.5, 0)); // Outputs an error message and 0 (or NaN if you choose that route)
    }
}

