package org.example.calculatorapp;

// Calculator class represents the model in the MVC pattern
public class Calculator {
    private double operand1; // Stores the first operand
    private double operand2; // Stores the second operand
    private char operator;    // Stores the arithmetic operator
    private double result;    // Stores the result of the operation
    private boolean isError;  // Tracks if an error occurred (e.g., division by zero)

    // Sets the first operand
    public void setOperand1(double operand) {
        this.operand1 = operand;
    }

    // Sets the second operand
    public void setOperand2(double operand) {
        this.operand2 = operand;
    }

    // Sets the arithmetic operator
    public void setOperator(char operator) {
        this.operator = operator;
    }

    // Performs the calculation based on the operator
    public void calculate() {
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) { // Check for division by zero
                    isError = true;
                    result = 0;
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                isError = true; // Invalid operator
                break;
        }
    }

    // Returns the result of the operation
    public double getResult() {
        return result;
    }

    // Returns true if an error occurred (e.g., division by zero)
    public boolean isError() {
        return isError;
    }

    // Resets all fields for a new calculation
    public void reset() {
        operand1 = 0;
        operand2 = 0;
        operator = '\0';
        result = 0;
        isError = false;
    }
}
