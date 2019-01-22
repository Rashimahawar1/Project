package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Eighteen extends AppCompatActivity {
    Button b48;
    TextView t10;
    RadioButton r21,r22,r23,r24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen);

        b48=(Button)findViewById(R.id.button48);
        r21=(RadioButton)findViewById(R.id.radioButton21);
        r22=(RadioButton)findViewById(R.id.radioButton22);
        r23=(RadioButton)findViewById(R.id.radioButton23);
        r24=(RadioButton)findViewById(R.id.radioButton24);
        t10=(TextView)findViewById(R.id.textView10);
        b48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r21.isChecked())
                {
                    ++Sixtheenth.score1;
                }
                else
                {
                    --Sixtheenth.score1;
                }

                Intent i=new Intent(Eighteen.this,Nineteen.class);
                startActivity(i);
                finish();
            }
        });

    }
}
