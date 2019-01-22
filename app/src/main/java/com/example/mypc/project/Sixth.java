package com.example.mypc.project;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sixth extends AppCompatActivity implements SensorEventListener{
    Button b34,b35;
     Sensor s;
    SensorManager sm;
    MediaPlayer mp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        b35=(Button)findViewById(R.id.button35);
        b34=(Button)findViewById(R.id.button34);
        mp1=MediaPlayer.create(this,R.raw.s);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);

        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Sixth.this,Fifth.class);
                startActivity(k);
                finish();
            }
        });


    }


    @Override
    public void onSensorChanged(final SensorEvent event) {


        if(event.values[0]>5)
        {
            mp1.start();
        }
        else
        {
            mp1.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
