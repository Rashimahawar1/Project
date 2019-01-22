package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class ninth extends AppCompatActivity {
    EditText e10;
    Button b51,b52;
    WebView w2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        e10=(EditText)findViewById(R.id.editText10);
        b51=(Button)findViewById(R.id.button51);
        b52=(Button)findViewById(R.id.button52);
        w2=(WebView)findViewById(R.id.webView2);

        b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=e10.getText().toString();
                w2.loadUrl(temp);
            }
        });
        b52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(ninth.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
