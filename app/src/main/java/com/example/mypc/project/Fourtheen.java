package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Fourtheen extends AppCompatActivity {
    Button b43;
    TextView t6;
    RadioButton r9,r10,r11,r12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourtheen);
        r9=(RadioButton)findViewById(R.id.radioButton9);
        r10=(RadioButton)findViewById(R.id.radioButton10);
        r11=(RadioButton)findViewById(R.id.radioButton11);
        r12=(RadioButton)findViewById(R.id.radioButton12);
        b43=(Button)findViewById(R.id.button43);
        t6=(TextView)findViewById(R.id.textView6);

        b43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r10.isChecked())
                {
                    ++Twelefth.score;
                }
                else
                {
                    --Twelefth.score;
                }
                Intent i=new Intent(Fourtheen.this,Fiftheen.class);
                startActivity(i);
                finish();
            }
        });


    }
}
