package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public Text result;
    @FXML
    public Spinner numberA;
    @FXML
    public Spinner numberB;

    public void plusButtonClick(ActionEvent actionEvent) {
        calculateResult("+",)
    }

    public void minusButtonClick(ActionEvent actionEvent) {
    }

    public void timesButtonClick(ActionEvent actionEvent) {
    }

    public void divideButtonClick(ActionEvent actionEvent) {
    }

    public void moduloButtonClick(ActionEvent actionEvent) {
    }

    private double calculateResult(String operator, double operand1, double operand2){
        double result = 0;

        switch (operator){
            case "+":
                result = operand1+operand2;
                break;
            case "-":
                result = operand1- operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            case "%":
                result = operand1 % operand2;
                break;
        }

        return result;
    }
}