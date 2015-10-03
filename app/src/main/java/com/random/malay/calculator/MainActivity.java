package com.random.malay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bC, bPerecent, bPosNeg, bDivide,bMultiply,bSub, bAdd, bEqual, bDot, bDelete,b0 ,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    EditText etMain, etSub;
    String optr;
    double reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bC = (Button) findViewById(R.id.bC);
        bPerecent = (Button) findViewById(R.id.bPercent);
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

        try{

            bC.setOnClickListener(this);
            bPerecent.setOnClickListener(this);
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

    @Override
    public void onClick(View args){
        double mem;
        switch(args.getId()){
            case R.id.bC:
                if(!(etMain.getText().toString().equals(""))) {
                    etMain.setText("");
                    optr = "none";
                }
                break;
            case R.id.bPercent:
                if(reminder!=0){
                     mem = reminder * (Double.valueOf(etMain.toString()));

                }
                break;
            case R.id.bPosNeg:
                break;
            case R.id.bDivide:
                break;
            case R.id.bMultiply:
                break;
            case R.id.bSub:
                break;
            case R.id.bAdd:
                break;
            case R.id.bDot:
                break;
            case R.id.bDelete:
                break;
            case R.id.bEqual:
                break;
            case R.id.b0:
                break;

        }
    }
}
