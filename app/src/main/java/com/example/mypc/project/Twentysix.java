package com.example.mypc.project;

import android.content.Intent;
import android.media.Rating;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Locale;

public class Twentysix extends AppCompatActivity {
    Button b60;
    RatingBar r0;
    TextToSpeech text;
    Button b61;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentysix);
        b60=(Button)findViewById(R.id.button60);
        b61=(Button)findViewById(R.id.button61);
        r0=(RatingBar)findViewById(R.id.ratingBar);
        text=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                text.setLanguage(Locale.ENGLISH);
                text.setSpeechRate(2.0f);

            }
        });
        b60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1="You have Rated us " +String.valueOf(r0.getRating() +"Thank you");
                text.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
                Intent a1=new Intent(Twentysix.this,Third.class);
                startActivity(a1);
                finish();

            }
        });

        r0.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                String tmp=String.valueOf(v);
                Toast.makeText(Twentysix.this, tmp, Toast.LENGTH_SHORT).show();
            }
        });
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Twentysix.this,Third.class);
                startActivity(a);
                finish();
            }
        });


    }
}
