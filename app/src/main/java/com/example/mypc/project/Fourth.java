package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fourth extends AppCompatActivity {
    Button b11,b12,b13,b14,b15,b16,b17,b18,b19;
    EditText e8,e9;
    TextView t1,t12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        e8=(EditText)findViewById(R.id.editText8);
        e9=(EditText)findViewById(R.id.editText9);
        t1=(TextView)findViewById(R.id.textView);
        t12=(TextView)findViewById(R.id.textView12);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result=i1+i2;
                t1.setText(""+result);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result=i1-i2;
                t1.setText(""+result);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result=i1*i2;
                t1.setText(""+result);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result=i1/i2;
                t1.setText(""+result);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                double i1=Double.parseDouble(s1);
                double i2=Double.parseDouble(s2);
                double result1=Math.pow(i1,i2);
                t1.setText(""+result1);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result1=i1*i1;
                int result2=i2*i2;
                t1.setText(""+result1);
                t12.setText("\n"+result2);

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e8.getText().toString();
                String s2=e9.getText().toString();

                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                int result=i1%i2;
                t1.setText(""+result);
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e8.setText("");
                e9.setText("");
                t1.setText("");
                t12.setText("");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i19=new Intent(Fourth.this,Third.class);
                startActivity(i19);
                finish();
            }
        });

    }
}
