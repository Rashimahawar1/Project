package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twentyfive extends AppCompatActivity {
    Button b58;
    WebView w8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyfive);
        b58=(Button)findViewById(R.id.button58);
        w8=(WebView)findViewById(R.id.webView8);

        String s1="http://www.edx.org";
        w8.loadUrl(s1);

        b58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twentyfive.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
