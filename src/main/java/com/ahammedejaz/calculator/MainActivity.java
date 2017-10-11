package com.ahammedejaz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    EditText et1;
    EditText et2;
    TextView tv;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv=(TextView)findViewById(R.id.tvr);
        b1=(Button) findViewById(R.id.bsum);
        b2=(Button) findViewById(R.id.bsub);
        b3=(Button) findViewById(R.id.bmul);
        b4=(Button) findViewById(R.id.bdiv);

        //For Addition
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1=0,a2=0;
                a1=Integer.parseInt(et1.getText().toString());
                a2=Integer.parseInt(et2.getText().toString());
                int sum=a1+a2;
                tv.setText(String.valueOf(sum));

            }
        });

        //For Substraction
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1=0,s2=0;
                s1=Integer.parseInt(et1.getText().toString());
                s2=Integer.parseInt(et2.getText().toString());
                int sub=s1-s2;
                tv.setText(String.valueOf(sub));
            }
        });

        //For Multiplication
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m1=0,m2=0;
                m1=Integer.parseInt(et1.getText().toString());
                m2=Integer.parseInt(et2.getText().toString());
                int mul=m1*m2;
                tv.setText(String.valueOf(mul));
            }
        });

        //For Division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d1=0,d2=0;
                d1=Integer.parseInt(et1.getText().toString());
                d2=Integer.parseInt(et2.getText().toString());
                float div=d1/d2;
                tv.setText(String.valueOf(div));
            }
        });
    }



    }








