package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Seventeenth extends AppCompatActivity {
    Button b47;
    TextView t9;
    RadioButton r17,r19,r20,r18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth);
        b47=(Button)findViewById(R.id.button47);
        r17=(RadioButton)findViewById(R.id.radioButton17);
        r18=(RadioButton)findViewById(R.id.radioButton18);
        r19=(RadioButton)findViewById(R.id.radioButton19);
        r20=(RadioButton)findViewById(R.id.radioButton20);
        t9=(TextView)findViewById(R.id.textView9);
        b47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r19.isChecked())
                {
                    ++Sixtheenth.score1;
                }
                else
                {
                    --Sixtheenth.score1;
                }

                Intent i=new Intent(Seventeenth.this,Eighteen.class);
                startActivity(i);
                finish();
            }
        });

    }
}
