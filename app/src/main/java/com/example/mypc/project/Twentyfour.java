package com.example.mypc.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Twentyfour extends AppCompatActivity {
    Button b57;
    WebView w7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyfour);
        b57=(Button)findViewById(R.id.button57);
        w7=(WebView)findViewById(R.id.webView7);

        String s1="http://www.gmail.com";
        w7.loadUrl(s1);

        b57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Twentyfour.this,Seventh.class);
                startActivity(k);
                finish();
            }
        });
    }
}
