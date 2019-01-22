package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twenty extends AppCompatActivity {
    Button b53;
    WebView w3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty);
        b53=(Button)findViewById(R.id.button53);
        w3=(WebView)findViewById(R.id.webView3);

        String s1="http://www.facebook.com";
        w3.loadUrl(s1);

        b53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twenty.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
