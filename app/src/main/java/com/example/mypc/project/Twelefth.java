package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Twelefth extends AppCompatActivity {
    Button b41;
    TextView t4;
    RadioButton r1,r2,r3,r4;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelefth);
        b41=(Button)findViewById(R.id.button41);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        t4=(TextView)findViewById(R.id.textView4);
        b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r2.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }

                Intent i=new Intent(Twelefth.this,Thirtheenth.class);
                startActivity(i);
                finish();
            }
        });

    }
}
