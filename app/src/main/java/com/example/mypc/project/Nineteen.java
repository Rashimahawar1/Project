package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Nineteen extends AppCompatActivity {
    Button b50,b49;
    TextView t11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteen);
        b50=(Button)findViewById(R.id.button50);
        b49=(Button)findViewById(R.id.button49);
        t11=(TextView)findViewById(R.id.textView11);


        b49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t11.setText("result="+Sixtheenth.score1);
                Toast.makeText(Nineteen.this, "thanks", Toast.LENGTH_SHORT).show();
            }
        });
        b50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Nineteen.this,Eleventh.class); startActivity(i);  finish();
            }
        });


    }
}
