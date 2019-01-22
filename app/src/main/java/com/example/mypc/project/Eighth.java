package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Eighth extends AppCompatActivity {
    Button b33;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        b33=(Button)findViewById(R.id.button33);
        w1=(WebView)findViewById(R.id.webView);

        String s1="http://www.google.com";
        w1.loadUrl(s1);

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Eighth.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
