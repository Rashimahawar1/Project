package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Eleventh extends AppCompatActivity {

    TextView t2,t3;
    Button b38,b39,b40;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        b38=(Button)findViewById(R.id.button38);
        b39=(Button)findViewById(R.id.button39);
        b40=(Button)findViewById(R.id.button40);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);


        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Eleventh.this,Twelefth.class);
                startActivity(i);
                finish();
            }
        });

        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Eleventh.this,Sixtheenth.class);
                startActivity(j);
                finish();
            }
        });



        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Eleventh.this,Third.class);
                startActivity(k);
                finish();
            }
        });
    }
}
