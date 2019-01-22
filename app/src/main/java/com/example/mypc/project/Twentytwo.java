package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twentytwo extends AppCompatActivity {
    Button b55;
    WebView w5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentytwo);
        b55=(Button)findViewById(R.id.button55);
        w5=(WebView)findViewById(R.id.webView5);

        String s1="http://netcamp.in";
        w5.loadUrl(s1);

        b55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twentytwo.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
