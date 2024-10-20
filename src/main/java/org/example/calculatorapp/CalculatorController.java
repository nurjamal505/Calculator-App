package org.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField outputField; // Text field to display input and results

    public Calculator calculator = new Calculator(); // Create a new Calculator instance
    private StringBuilder currentInput = new StringBuilder(); // To build the current input string

    // Method to handle digit button presses
    @FXML
    private void btn0() { appendToInput("0"); }
    @FXML
    private void btn1() { appendToInput("1"); }
    @FXML
    private void btn2() {
        appendToInput("2"); }
    @FXML
    private void btn3() { appendToInput("3"); }
    @FXML
    private void btn4() { appendToInput("4"); }
    @FXML
    private void btn5() { appendToInput("5"); }
    @FXML
    private void btn6() { appendToInput("6"); }
    @FXML
    private void btn7() { appendToInput("7"); }
    @FXML
    private void btn8() { appendToInput("8"); }
    @FXML
    private void btn9() { appendToInput("9"); }

    // Method to handle operator button presses
    @FXML
    private void btnPlus() { setOperator('+'); }
    @FXML
    private void btnMinus() { setOperator('-'); }

    @FXML
    private void btnMultiply() { setOperator('*'); }
    @FXML
    private void btnDivide() { setOperator('/'); }

    // Method to handle the equals button press
    @FXML
    private void btnEquals() {
        if (currentInput.length() > 0) {
            calculator.setOperand2(Double.parseDouble(currentInput.toString()));
            calculator.calculate();
            if (calculator.isError()) {
                outputField.setText("Error: Division by Zero");
            } else {
                outputField.setText(String.valueOf(calculator.getResult()));
            }
        }
        resetInput();
    }

    // Method to handle the clear button press
    @FXML
    private void btnClear() {
        calculator.reset();
        outputField.clear();
        resetInput();
    }

    // Helper method to append digit to current input
    private void appendToInput(String digit) {
        currentInput.append(digit);
        outputField.setText(currentInput.toString());
    }

    // Helper method to set operator and process current input
    private void setOperator(char operator) {
        if (currentInput.length() > 0) {
            calculator.setOperand1(Double.parseDouble(currentInput.toString()));
            calculator.setOperator(operator);
            resetInput();
        }
    }

    // Helper method to reset the input
    private void resetInput() {
        currentInput.setLength(0); // Clear the current input
    }
}
