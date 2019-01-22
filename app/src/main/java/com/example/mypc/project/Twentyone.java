package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twentyone extends AppCompatActivity {
    Button b54;
    WebView w4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);
        b54=(Button)findViewById(R.id.button54);
        w4=(WebView)findViewById(R.id.webView4);

        String s1="http://www.wikepedia.org";
        w4.loadUrl(s1);

        b54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twentyone.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
