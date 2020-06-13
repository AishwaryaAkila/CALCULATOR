package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input,signbox;
    String sign, value1, value2;
    Double num1, num2, result;
    boolean hasdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=(TextView)findViewById(R.id.input);
        signbox=(TextView)findViewById(R.id.sign);
        hasdot=false;
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText()+"0");
        signbox.setText(signbox.getText().toString()+"0");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText()+"1");
        signbox.setText(signbox.getText().toString()+"1");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText()+"2");
        signbox.setText(signbox.getText().toString()+"2");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText()+"3");
        signbox.setText(signbox.getText().toString()+"3");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText()+"4");
        signbox.setText(signbox.getText().toString()+"4");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText()+"5");
        signbox.setText(signbox.getText().toString()+"5");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText()+"6");
        signbox.setText(signbox.getText().toString()+"6");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText()+"7");
        signbox.setText(signbox.getText().toString()+"7");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText()+"8");
        signbox.setText(signbox.getText().toString()+"8");
    }
    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText()+"9");
        signbox.setText(signbox.getText().toString()+"9");
    }

    public void btnClick_dot(View view) {
        if(!hasdot){
            if(input.getText().equals("")){
                input.setText("0.");
                signbox.setText(signbox.getText().toString()+"0.");
            }
            else{
                input.setText(input.getText()+".");
                signbox.setText(signbox.getText().toString()+".");
            }
            hasdot=true;
        }


    }

    public void btnClick_add(View view){
        sign = "+";
        value1=input.getText().toString();
        signbox.setText(signbox.getText().toString()+"+");
        input.setText(null);
        hasdot=false;
    }
    public void btnClick_subtract(View view){
        sign="-";
        value1=input.getText().toString();
        signbox.setText(signbox.getText().toString()+"-");
        input.setText(null);
        hasdot=false;
    }
    public void btnClick_multiply(View view){
        sign="*";
        value1=input.getText().toString();
        signbox.setText(signbox.getText().toString()+"*");
        input.setText(null);
        hasdot=false;

    }
    public void btnClick_divide(View view){
        sign="/";
        value1=input.getText().toString();
        signbox.setText(signbox.getText().toString()+"/");
        input.setText(null);
        hasdot=false;
    }
    public void btnClick_log(View view) {
        sign="log";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"log");
        hasdot=false;
    }
    public void btnClick_ln(View view) {
        sign="ln";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"ln");
        hasdot=false;
    }
    public void btnClick_power(View view) {
        sign="power";
        value1 = input.getText().toString();
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"xⁿ");
        hasdot=false;
    }
    public void btnClick_fact(View view) {
        sign="factorial";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"!");
        hasdot=false;
    }
    public void btnClick_sin(View view) {
        sign="sin";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"sin");
        hasdot=false;
    }
    public void btnClick_cos(View view) {
        sign="cos";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"cos");
        hasdot=false;
    }
    public void btnClick_tan(View view) {
        sign="tan";
        input.setText(null);
        signbox.setText(signbox.getText().toString()+"tan");
        hasdot=false;
    }
    public void btnClick_sqrt(View view) {
        sign = "root";
        input.setText(null);
        hasdot = false;
        signbox.setText(signbox.getText().toString()+"√");
    }


    public void btnClick_equal(View view) {
        if (sign == null) {
            signbox.setText("Error!");
        } else if (input.getText().equals("")) {
            signbox.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signbox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    //signbox.setText(signbox.getText().toString()+value1);
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value1);
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value2);
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value2);
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value2);
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    signbox.setText(signbox.getText().toString()+value2);
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signbox.setText(null);
                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if(input.getText().equals("")){
            input.setText(null);
        }
        else{
            int len=input.getText().length();
            String s=input.getText().toString();
            if(s.charAt(len-1) == '.'){
                hasdot=false;
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
            }
            else{
                input.setText(input.getText().subSequence(0,input.getText().length()-1));
            }
        }

    }

    public void btnClick_clear(View view) {
        input.setText(null);
        signbox.setText(null);
        value1=null;
        value2=null;
        sign=null;
        hasdot=false;
    }



}