package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seventh extends AppCompatActivity {
    Button b24,b25,b26,b27,b28,b29,b30,b31,b32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        b24=(Button)findViewById(R.id.button24);
        b25=(Button)findViewById(R.id.button25);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        b29=(Button)findViewById(R.id.button29);
        b30=(Button)findViewById(R.id.button30);
        b31=(Button)findViewById(R.id.button31);
        b32=(Button)findViewById(R.id.button32);

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Seventh.this,Third.class);
                startActivity(j);
                finish();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Seventh.this,Eighth.class);
                startActivity(k);
                finish();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k1=new Intent(Seventh.this,Twenty.class);
                startActivity(k1);
                finish();
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k3=new Intent(Seventh.this,Twentyone.class);
                startActivity(k3);
                finish();
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k4=new Intent(Seventh.this,Twentytwo.class);
                startActivity(k4);
                finish();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k5=new Intent(Seventh.this,Twentythree.class);
                startActivity(k5);
                finish();
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k6=new Intent(Seventh.this,Twentyfour.class);
                startActivity(k6);
                finish();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k7=new Intent(Seventh.this,Twentyfive.class);
                startActivity(k7);
                finish();
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k8=new Intent(Seventh.this,ninth.class);
                startActivity(k8);
                finish();
            }
        });


    }
}
