package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public Text result;
    @FXML
    public Spinner numberA;
    @FXML
    public Spinner numberB;

    @FXML
    private void initialize() {
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryA =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 5);
        numberA.setValueFactory(valueFactoryA);
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactoryB =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.MAX_VALUE, 5);
        numberB.setValueFactory(valueFactoryB);
    }

    public void plusButtonClick(ActionEvent actionEvent) {
        if(numberA.getValue()!="" && numberB.getValue()!=""){
            result.setText(String.valueOf(calculateResult("+",(Double) numberA.getValue(),(Double) numberB.getValue())));
        }else{
            showAlert();
        }
    }

    public void minusButtonClick(ActionEvent actionEvent) {
        if(numberA.getValue()!="" && numberB.getValue()!=""){
            result.setText(String.valueOf(calculateResult("-",(Double) numberA.getValue(),(Double) numberB.getValue())));
        }else{
            showAlert();
        }
    }

    public void timesButtonClick(ActionEvent actionEvent) {
        if(numberA.getValue()!="" && numberB.getValue()!=""){
            result.setText(String.valueOf(calculateResult("*",(Double) numberA.getValue(),(Double) numberB.getValue())));
        }else{
            showAlert();
        }
    }

    public void divideButtonClick(ActionEvent actionEvent) {
        if(numberA.getValue()!="" && numberB.getValue()!=""){
            result.setText(String.valueOf(calculateResult("/",(Double) numberA.getValue(),(Double) numberB.getValue())));
        }else{
            showAlert();
        }
    }

    public void moduloButtonClick(ActionEvent actionEvent) {
        if(numberA.getValue()!="" && numberB.getValue()!=""){
            result.setText(String.valueOf(calculateResult("%",(Double) numberA.getValue(),(Double) numberB.getValue())));
        }else{
            showAlert();
        }
    }

    private void showAlert(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("The number fields aren't filled");
        alert.setContentText("Fill the number fields to continue");
        alert.show();
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