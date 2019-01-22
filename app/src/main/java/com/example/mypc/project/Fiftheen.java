package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fiftheen extends AppCompatActivity {
    TextView t7;
    Button b44,b45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiftheen);
        b45=(Button)findViewById(R.id.button45);
        b44=(Button)findViewById(R.id.button44);
        t7=(TextView)findViewById(R.id.textView7);

        b44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t7.setText("result="+Twelefth.score);
                Toast.makeText(Fiftheen.this, "thanks", Toast.LENGTH_SHORT).show();
            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fiftheen.this,Eleventh.class); startActivity(i);  finish();
            }
        });


    }
}
