package com.example.mypc.project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tenth extends AppCompatActivity {

    Button b36,b37;
    ImageView i3;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode,data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        i3.setImageBitmap(b);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

    b36=(Button)findViewById(R.id.button36);
        b37=(Button)findViewById(R.id.button37);
        i3=(ImageView)findViewById(R.id.imageView3);


        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(Tenth.this,Third.class);
                startActivity(o);
                finish();
            }
        });

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(l,0);
            }
        });



    }
}
