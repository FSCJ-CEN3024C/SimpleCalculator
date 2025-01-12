// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

// SimpleCalculatorApplicaiton.java
// Seth Herman
// 1/12/2025
// Adding calc methods

package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = subtract(number1, number2);
        System.out.println("Add result is: " + result);
    }

    private static int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    private static int subtract(int number1, int number2) {
        int difference = number1 - number2;
        return difference;
    }

    private static int multiply(int number1, int number2) {
        int product = number1 * number2;
        return product;
    }

    private static int divide(int number1, int number2) {
        int quotient = number1 / number2;
        return quotient;
    }
}
