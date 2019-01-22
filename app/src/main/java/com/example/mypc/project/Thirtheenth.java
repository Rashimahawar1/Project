package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Thirtheenth extends AppCompatActivity {
    Button b42;
    TextView t5;
    RadioButton r5,r6,r7,r8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirtheenth);

        r5=(RadioButton)findViewById(R.id.radioButton5);
        r6=(RadioButton)findViewById(R.id.radioButton6);
        r7=(RadioButton)findViewById(R.id.radioButton7);
        r8=(RadioButton)findViewById(R.id.radioButton8);
        b42=(Button)findViewById(R.id.button42);
        t5=(TextView)findViewById(R.id.textView5);

        b42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r5.isChecked())
                {
                    ++Twelefth.score;
                }
                else
                {
                    --Twelefth.score;
                }
                Intent i=new Intent(Thirtheenth.this,Fourtheen.class);
                startActivity(i);
                finish();
            }
        });
    }
}
