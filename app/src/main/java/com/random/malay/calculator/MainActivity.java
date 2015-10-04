package com.random.malay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bC, bPercent, bPosNeg, bDivide,bMultiply,bSub, bAdd, bEqual, bDot, bDelete,b0 ,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    EditText etMain, etSub;
    String optr;
    double reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bC = (Button) findViewById(R.id.bC);
        bPercent = (Button) findViewById(R.id.bPercent);
        bPosNeg = (Button) findViewById(R.id.bPosNeg);
        bDivide = (Button) findViewById(R.id.bDivide);
        bMultiply = (Button) findViewById(R.id.bMultiply);
        bSub = (Button) findViewById(R.id.bSub);
        bAdd = (Button) findViewById(R.id.bAdd);
        bEqual = (Button) findViewById(R.id.bEqual);
        bDot = (Button) findViewById(R.id.bDot);
        bDelete = (Button) findViewById(R.id.bDelete);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        etMain = (EditText) findViewById(R.id.tvMainText);
        etSub = (EditText) findViewById(R.id.tvSubText);
        etMain.setText("");
        etSub.setText("");

        try{

            bC.setOnClickListener(this);
            bPercent.setOnClickListener(this);
            bPosNeg.setOnClickListener(this);
            bDivide.setOnClickListener(this);
            bMultiply.setOnClickListener(this);
            bSub.setOnClickListener(this);
            bAdd.setOnClickListener(this);
            bDot.setOnClickListener(this);
            bDelete.setOnClickListener(this);
            bEqual.setOnClickListener(this);

            b0.setOnClickListener(this);
            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
            b5.setOnClickListener(this);
            b6.setOnClickListener(this);
            b7.setOnClickListener(this);
            b8.setOnClickListener(this);
            b9.setOnClickListener(this);

        }catch (Exception e){

        }

    }
    double mem=0,mem2=0;
    @Override
    public void onClick(View args){

        double ran;
        double result;
        String input;

        switch(args.getId()){
            case R.id.bC:
                if(!(etMain.getText().toString().equals(""))) {
                    etMain.setText("");
                    optr = "none";
                    mem = 0;
                    mem2 = 0;
                }
                break;
            case R.id.bPercent:
                if(reminder!=0){
                     ran = mem * (Double.parseDouble(etMain.getText().toString()))/100;
                     etMain.setText(convertDoubleToString(ran));
                }else{
                    etMain.setText("0");
                }
                break;
            case R.id.bPosNeg:
                if(!(etMain.getText().toString().equals(""))) {
                    ran = (-1 * Double.valueOf(etMain.getText().toString()));
                    etMain.setText(convertDoubleToString(ran));
                }
                break;
            case R.id.bDivide:
                optr = "/";
                if(mem ==0) {
                    mem = Double.valueOf(etMain.getText().toString());
                    etMain.setText("");
                }else{
                    mem2 = Double.valueOf(etMain.getText().toString());
                    mem = mem / mem2;
                    etMain.setText("");
                }
                break;
            case R.id.bMultiply:
                optr = "*";
                if(mem ==0) {
                    mem = Double.valueOf(etMain.getText().toString());
                    etMain.setText("");
                }else{
                    mem2 = Double.valueOf(etMain.getText().toString());
                    mem = mem * mem2;
                    etMain.setText("");
                }
                break;
            case R.id.bSub:
                optr = "-";
                if(mem ==0) {
                    mem = Double.valueOf(etMain.getText().toString());
                    etMain.setText("");
                }else{
                    mem2 = Double.valueOf(etMain.getText().toString());
                    mem = mem - mem2;
                    etMain.setText("");
                }
                break;
            case R.id.bAdd:
                optr = "+";
                if(mem ==0) {
                    mem = Double.valueOf(etMain.getText().toString());
                    etMain.setText("");
                }else{
                    mem2 = Double.valueOf(etMain.getText().toString());
                    mem = mem + mem2;
                    etMain.setText("");
                }
                break;
            case R.id.bDot:
                input = etMain.getText().toString();
                etMain.setText(input + ".");
                break;
            case R.id.bDelete:
                break;
            case R.id.bEqual:
                switch (optr){
                    case "none":
                        break;
                    case "/":
                        mem2 = Double.valueOf(etMain.getText().toString());
                        mem = mem/mem2;
                        etMain.setText(convertDoubleToString(mem));
                        break;
                    case "*":
                        mem2 = Double.valueOf(etMain.getText().toString());
                        mem = mem*mem2;
                        etMain.setText(convertDoubleToString(mem));
                        break;
                    case "-":
                        mem2 = Double.valueOf(etMain.getText().toString());
                        mem = mem-mem2;
                        etMain.setText(convertDoubleToString(mem));
                        break;
                    case "+":
                        mem2 = Double.valueOf(etMain.getText().toString());
                        mem = mem+mem2;
                        etMain.setText(convertDoubleToString(mem));
                        break;
                    default:
                        break;
                }

                break;
            case R.id.b0:
                input = etMain.getText().toString();
                etMain.setText(input + "0");
                break;
            case R.id.b1:
                input = etMain.getText().toString();
                etMain.setText(input + "1");
                break;
            case R.id.b2:
                input = etMain.getText().toString();
                etMain.setText(input + "2");
                break;
            case R.id.b3:
                input = etMain.getText().toString();
                etMain.setText(input + "3");
                break;
            case R.id.b4:
                input = etMain.getText().toString();
                etMain.setText(input + "4");
                break;
            case R.id.b5:
                input = etMain.getText().toString();
                etMain.setText(input + "5");
                break;
            case R.id.b6:
                input = etMain.getText().toString();
                etMain.setText(input + "6");
                break;
            case R.id.b7:
                input = etMain.getText().toString();
                etMain.setText(input + "7");
                break;
            case R.id.b8:
                input = etMain.getText().toString();
                etMain.setText(input + "8");
                break;
            case R.id.b9:
                input = etMain.getText().toString();
                etMain.setText(input + "9");
                break;


        }
    }

    public String convertDoubleToString(double input){
        String str;
        str = String.valueOf(input);
        return str;
    }
}
