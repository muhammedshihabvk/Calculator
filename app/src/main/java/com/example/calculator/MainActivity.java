package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button oneBtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn,zeroBtn,addBtn,
            subBtn,mulBtn,divBtn,eqlBtn,clnBtn;
    EditText editText;
    boolean flag = true;
    String temp = "";
    int sum=0,temp1=0,temp2=0;
    String operator = "";
    boolean eqFlag= true;


    public static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        oneBtn = findViewById(R.id.btn1);
        oneBtn.setOnClickListener(this);

        twoBtn = findViewById(R.id.btn2);
        twoBtn.setOnClickListener(this);

        threeBtn = findViewById(R.id.btn3);
        threeBtn.setOnClickListener(this);

        fourBtn = findViewById(R.id.btn4);
        fourBtn.setOnClickListener(this);

        fiveBtn = findViewById(R.id.btn5);
        fiveBtn.setOnClickListener(this);

        sixBtn = findViewById(R.id.btn6);
        sixBtn.setOnClickListener(this);

        sevenBtn = findViewById(R.id.btn7);
        sevenBtn.setOnClickListener(this);

        eightBtn = findViewById(R.id.btn8);
        eightBtn.setOnClickListener(this);

        nineBtn = findViewById(R.id.btn9);
        nineBtn.setOnClickListener(this);

        zeroBtn = findViewById(R.id.btn0);
        zeroBtn.setOnClickListener(this);

        addBtn = findViewById(R.id.btnadd);
        addBtn.setOnClickListener(this);

        subBtn =findViewById(R.id.btnsub);
        subBtn.setOnClickListener(this);

        divBtn = findViewById(R.id.btndiv);
        divBtn.setOnClickListener(this);

        mulBtn = findViewById(R.id.btnmul);
        mulBtn.setOnClickListener(this);

        eqlBtn = findViewById(R.id.btneq);
        eqlBtn.setOnClickListener(this);

        clnBtn = findViewById(R.id.cleanBtn);
        clnBtn.setOnClickListener(this);

        editText = findViewById(R.id.editTextbox);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1 :
                onOneClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "1");
                break;
            case R.id.btn2 :
                onTwoClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "2");
                break;
            case R.id.btn3 :
                onThreeClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "3");
                break;
            case R.id.btn4 :
                onFourClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "4");
                break;
            case R.id.btn5 :
                onFiveClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "5");
                break;
            case R.id.btn6 :
                onSixClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "6");
                break;
            case R.id.btn7 :
                onSevenClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "7");
                break;
            case R.id.btn8 :
                onEightClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "8");
                break;
            case  R.id.btn9 :
                onNineClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "9");
                break;
            case  R.id.btn0 :
                onZeroClicked();
                editBoxCheck();
                editText.setText(editText.getText() + "0");
                break;
            case  R.id.btnadd :
                onAddClicked();
                try {
                    temp1 = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException e){
                    temp1=0;
                }
                editText.getText().clear();
                editText.setText("+");
                operator="+";
                break;
            case  R.id.btnsub :
                onSubClicked();
                try {
                    temp1 = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException e){
                    temp1=0;
                }
                editText.getText().clear();
                editText.setText("-");
                operator="-";
                break;
            case R.id.btndiv :
                onDivClicked();
                try {
                    temp1 = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException e){
                    temp1=0;
                }
                editText.getText().clear();
                editText.setText("/");
                operator="/";
                break;
            case R.id.btnmul :
                onMulClicked();
                try {
                    temp1 = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException e){
                    temp1=0;
                }
                editText.getText().clear();
                editText.setText("*");
                operator="*";
                break;
            case R.id.btneq :
                onEqClicked();

                if(operator.equals("+")){
                    temp2 = temp1 + Integer.parseInt(editText.getText().toString());
                    editText.setText(String.valueOf(temp2));
                    Log.d(LOG_TAG,String.valueOf(temp1));
                    Log.d(LOG_TAG,String.valueOf(temp2));
                }
                if(operator.equals("-")){
                    temp2 = temp1 - Integer.parseInt(editText.getText().toString());
                    editText.setText(String.valueOf(temp2));
                }
                if(operator.equals("/")){
                    temp2 = temp1 / (Integer.parseInt(editText.getText().toString()));
                    editText.setText(String.valueOf(temp2));
                }
                if(operator.equals("*")){
                    temp2 = temp1 * (Integer.parseInt(editText.getText().toString()));
                    editText.setText(String.valueOf(temp2));
                }
                break;
            case R.id.cleanBtn :
                cleanButton();
                default:
                    Log.d(LOG_TAG,"default");


        }
    }

    public void onOneClicked(){
        Log.d(LOG_TAG,"1");
    }

    public void onTwoClicked(){
        Log.d(LOG_TAG,"2");
    }

    public void onThreeClicked(){
        Log.d(LOG_TAG,"3");
    }

    public void onFourClicked(){
        Log.d(LOG_TAG,"4");
    }

    public void onFiveClicked(){
        Log.d(LOG_TAG,"5");
    }

    public void onSixClicked(){
        Log.d(LOG_TAG,"6");
    }

    public void onSevenClicked(){
        Log.d(LOG_TAG,"7");
    }
    public void onEightClicked(){
        Log.d(LOG_TAG,"8");
    }

    public void onNineClicked(){
        Log.d(LOG_TAG,"9");
    }

    public void onZeroClicked(){
        Log.d(LOG_TAG,"0");
    }

    public void onAddClicked(){
        Log.d(LOG_TAG,"+");
    }

    public  void onSubClicked(){
        Log.d(LOG_TAG,"-");
    }

    public  void onMulClicked(){
        Log.d(LOG_TAG,"*");
    }

    public  void onDivClicked(){
        Log.d(LOG_TAG,"/");
    }

    public  void onEqClicked(){
        Log.d(LOG_TAG,"=");
    }

    public void operation(String operator,int val){

        switch (operator) {
            case "+":
                sum = sum + val;
                break;
            case "-":
                sum = sum - val;
                break;
            case "*":
                sum = sum * val;
                break;
            case "/":
                sum = sum / val;
                break;
            default:
                Log.d(LOG_TAG, "operation default");

        }
    }

    public void editBoxCheck(){
        if(editText.getText().toString().equals("+") | editText.getText().toString().equals("-") |editText.getText().toString().equals("/") | editText.getText().toString().equals("*") ){
            Log.d(LOG_TAG,"======================test =====================");
            editText.getText().clear();
        }

    }

    public void cleanButton(){
        temp2=0;
        temp1=0;
        operator="";
        eqFlag=true;
        editText.getText().clear();
    }
}
