package com.emil.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    char operation='0';
    double answer=0;
    EditText numberText;
    boolean answerCheck;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText=findViewById(R.id.numberText);
    }
    public void sum(View view){
        if(operation=='0'){
            try {
                answer = (Double) (Double.parseDouble(numberText.getText().toString()));
                numberText.setText("");
                operation = '+';
            }catch (Exception e){

            }
        }else {
            try {
                answer = answer + (Double) (Double.parseDouble(numberText.getText().toString()));
                operation = '+';
                numberText.setText("");
            }catch (Exception e){

            }
        }
    }
    public void multiple(View view){
        if(operation=='0'){
            try {
                answer = (Double) (Double.parseDouble(numberText.getText().toString()));
                numberText.setText("");
                operation = '*';
            }catch (Exception e){

            }
        }else {
            try {
                answer = answer * (Double) (Double.parseDouble(numberText.getText().toString()));
                operation = '*';
                numberText.setText("");
            }catch (Exception e){

            }
        }
    }
    public void division(View view){
        if(operation=='0'){
            try {
                answer = (Double) (Double.parseDouble(numberText.getText().toString()));
                numberText.setText("");
                operation = '/';
            }catch (Exception e){

            }
        }else {
            try {
                answer = answer / (Double) (Double.parseDouble(numberText.getText().toString()));
                numberText.setText("Error");
                operation = '/';
                numberText.setText("");
            }catch (Exception e){

            }
        }
    }
    public void difference(View view){
        if(operation=='0'){
            answer = (Double) (Double.parseDouble(numberText.getText().toString()));
            numberText.setText("");
            operation = '-';
        } else {
            answer = answer - (Double) (Double.parseDouble(numberText.getText().toString()));
            operation = '-';
            numberText.setText("");
        }
    }


    public void one(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "1");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "1");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "1");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "1");
            }
        }
    }
    public void two(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "2");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "2");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "2");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "2");
            }
        }
    }
    public void three(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "3");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "3");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "3");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "3");
            }
        }
    }
    public void four(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "4");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "4");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "4");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "4");
            }
        }
    }
    public void five(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "5");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "5");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "5");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "5");
            }
        }
    }
    public void six(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "6");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "6");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "6");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "6");
            }
        }
    }
    public void seven(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "7");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "7");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "7");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "7");
            }
        }
    }
    public void eight(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "8");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "8");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "8");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "8");
            }
        }
    }
    public void nine(View view){
        if(numberText.getText().equals("0")){
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "9");
                answerCheck = false;
            } else {
                numberText.setText("");
                numberText.setText(numberText.getText() + "9");
            }
        }else {
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "9");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "9");
            }
        }
    }
    public void zero(View view){
        if(numberText.getText().equals('0')){

        }else{
            if (answerCheck) {
                numberText.setText("");
                numberText.setText(numberText.getText() + "0");
                answerCheck = false;
            } else {
                numberText.setText(numberText.getText() + "0");
            }
        }
    }
    public void equal(View view){
        switch(operation){
            case '+':
                operation='0';
                answer=answer+(Double)(Double.parseDouble(numberText.getText().toString()));
                break;
            case '-':
                operation='0';
                answer=answer-(Double)(Double.parseDouble(numberText.getText().toString()));
                break;
            case '*':
                operation='0';
                answer=answer*(Double)(Double.parseDouble(numberText.getText().toString()));
                break;
            case '/':
                operation='0';
                answer = answer / (Double) (Double.parseDouble(numberText.getText().toString()));
                break;
            case '0':
                numberText.setText(Double.toString(answer));
                break;
        }
        numberText.setText(Double.toString(answer));
        answerCheck=true;
    }
    public void clear(View view){
        numberText.setText("");
        answer=0;
    }
}