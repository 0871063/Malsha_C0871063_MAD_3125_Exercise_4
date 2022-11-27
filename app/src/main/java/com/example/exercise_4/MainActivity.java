package com.example.exercise_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private double numberOne = 0.0;
    private double numberTwo = 0.0;
    private TextView resultTV;
    private String operator = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.txtResult);
    }
    public void zeroPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=")){
                numberString = "0";
            }else {
                numberString += "0";
            }
        }else{
            numberString = "0";
        }
        resultTV.setText(numberString);
    }

    public void dotPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") ){
                numberString = "0.";
            }else {
                numberString += ".";
            }
        }else{
            numberString = "0.";
        }
        resultTV.setText(numberString);
    }

    public void onePressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "1";
            }else {
                numberString += "1";
            }
        }else{
            numberString = "1";
        }
        resultTV.setText(numberString);
    }

    public void twoPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "2";
            }else {
                numberString += "2";
            }
        }else{
            numberString = "2";
        }
        resultTV.setText(numberString);
    }

    public void threePressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "3";
            }else {
                numberString += "3";
            }
        }else{
            numberString = "3";
        }
        resultTV.setText(numberString);
    }

    public void fourPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "4";
            }else {
                numberString += "4";
            }
        }else{
            numberString = "4";
        }
        resultTV.setText(numberString);
    }

    public void fivePressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "5";
            }else {
                numberString += "5";
            }
        }else{
            numberString = "5";
        }
        resultTV.setText(numberString);
    }

    public void sixPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "6";
            }else {
                numberString += "6";
            }
        }else{
            numberString = "6";
        }
        resultTV.setText(numberString);
    }

    public void sevenPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "7";
            }else {
                numberString += "7";
            }
        }else{
            numberString = "7";
        }
        resultTV.setText(numberString);
    }

    public void eightPressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "8";
            }else {
                numberString += "8";
            }
        }else{
            numberString = "8";
        }
        resultTV.setText(numberString);
    }

    public void ninePressed(View v){
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            if(operator.equalsIgnoreCase("=") && !numberString.equalsIgnoreCase("0.")){
                numberString = "9";
            }else {
                numberString += "9";
            }
        }else{
            numberString = "9";
        }
        resultTV.setText(numberString);
    }

    public void doSum(View v) {
        setNumberOne();
        operator = "+";
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            numberString += " + ";
        }else{
            numberString = " 0 + ";
        }
        resultTV.setText(numberString);
    }
    public void doSubtraction(View v) {
        setNumberOne();
        operator = "-";
        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            numberString += " - ";
        }else{
            numberString = " 0 - ";
        }
        resultTV.setText(numberString);
    }

    public void doMultiplication(View v) {
        setNumberOne();
        operator = "*";

        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            numberString += " * ";
        }else{
            numberString = " 0 * ";
        }
        resultTV.setText(numberString);
    }

    public void doDivision(View v) {
        setNumberOne();
        operator = "/";

        String numberString = resultTV.getText().toString();
        if(!numberString.equalsIgnoreCase("0")) {
            numberString += " / ";
        }else{
            numberString = " 0 / ";
        }
        resultTV.setText(numberString);
    }

    public void doModulus(View v) {
//        double result = 0.0;
        operator = "%";
        setNumberOne();
        double result = calculate();
        resultTV.setText(Double.toString(result));
//        if (numberOne != 0.0) {
//            result = numberOne / 100.0;
//            resultTV.setText(Double.toString(result));
//        }else{
//            resultTV.setText("0");
//        }
    }

    public void doEqual(View v) {
        setNumberTwo();
        double result = calculate();
        resultTV.setText(Double.toString(result));
        operator = "=";

    }

    public void doClear(View v) {
        numberOne = 0.0;
        numberTwo = 0.0;
        operator = "";
        resultTV.setText("0");
    }

    public void doNegativePositive(View v) {
        String numberString = resultTV.getText().toString();
        Double number = Double.parseDouble(numberString);
        if(number>0){
            numberString = "-" + numberString;
        }else if(number<0){
            numberString = numberString.replace("-", "");
        }else{
            numberString = "0";
        }
        resultTV.setText(numberString);
    }

    private void setNumberOne(){
        String numberString = resultTV.getText().toString();
        if(!numberString.isEmpty()){
            Double noOne = Double.parseDouble(numberString);
            numberOne = noOne;
        }
    }

    private void setNumberTwo(){
        String numberString = resultTV.getText().toString();
        String[] splited = numberString.split("\\s+");
        String no2 =  splited[splited.length-1];
        if(!no2.isEmpty()){
            Double noTwo = Double.parseDouble(no2);
            numberTwo = noTwo;
        }else{
            numberTwo = 0.0;
        }
    }

    private double calculate(){
        double result = 0.0;
        switch(operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne / 100.0;
                break;
            case "=":
                break;
            default:
                result = 0.0;
        }

        return result;
    }

}