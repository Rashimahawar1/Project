package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twentythree extends AppCompatActivity {
    Button b56;
    WebView w6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentythree);
        b56=(Button)findViewById(R.id.button56);
        w6=(WebView)findViewById(R.id.webView6);

        String s1="http://www.youtube.com";
        w6.loadUrl(s1);

        b56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twentythree.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
