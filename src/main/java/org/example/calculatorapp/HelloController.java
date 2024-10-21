package org.example.calculatorapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();
    @FXML
    private TextField display;

    @FXML
    private void but1() {
        String val = display.getText();
        val = val + "1";
        display.setText(val);

    }

    @FXML
    private void but2() {
        String val = display.getText();
        val = val + "2";
        display.setText(val);

    }

    @FXML
    private void but3() {
        String val = display.getText();
        val = val + "3";
        display.setText(val);

    }

    @FXML
    private void but4() {
        String val = display.getText();
        val = val + "4";
        display.setText(val);

    }

    @FXML
    private void but5() {
        String val = display.getText();
        val = val + "5";
        display.setText(val);

    }

    @FXML
    private void but6() {
        String val = display.getText();
        val = val + "6";
        display.setText(val);

    }

    @FXML
    private void but7() {
        String val = display.getText();
        val = val + "7";
        display.setText(val);

    }

    @FXML
    private void but8() {
        String val = display.getText();
        val = val + "8";
        display.setText(val);

    }

    @FXML
    private void but9() {
        String val =display.getText();
        val = val + "9";
        display.setText(val);

    }

    @FXML
    private void but0() {
        String val = display.getText();
        val = val + "0";
        display.setText(val);

    }

    @FXML
    private void onSub() {
        String op1 = display.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('-');               // Set operator
        display.clear();
    }
    @FXML
    private void onMultiply() {
        String op1 = display.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('*');               // Set operator
        display.clear();
    }
    @FXML
    private void onAddition() {
        String op1 = display.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('+');               // Set operator
        display.clear();
    }
    @FXML
    private void onDivision() {
        String op1 = display.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('/');               // Set operator
        display.clear();
    }
    @FXML
    private void onCalculate() {
        String op2 =display.getText();
        calc.setOp2(Integer.parseInt(op2));
        calc.calculate();
        display.setText("" + calc.getResult());
    }
    @FXML
    private void OnClear() {
        display.clear();
    }
}