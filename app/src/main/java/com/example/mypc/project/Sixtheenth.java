package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Sixtheenth extends AppCompatActivity {
    Button b46;
    TextView t8;
    RadioButton r13,r14,r15,r16;
    static int score1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixtheenth);
        b46=(Button)findViewById(R.id.button46);
        r13=(RadioButton)findViewById(R.id.radioButton13);
        r14=(RadioButton)findViewById(R.id.radioButton14);
        r15=(RadioButton)findViewById(R.id.radioButton15);
        r16=(RadioButton)findViewById(R.id.radioButton16);
        t8=(TextView)findViewById(R.id.textView4);
        b46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score1=0;
                if(r15.isChecked())
                {
                    ++score1;
                }
                else
                {
                    --score1;
                }

                Intent i=new Intent(Sixtheenth.this,Seventeenth.class);
                startActivity(i);
                finish();
            }
        });

    }
}
