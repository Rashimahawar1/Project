package com.example.mypc.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s6=e1.getText().toString();
                String s7=e2.getText().toString();

                if(s6.equals("")||s7.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill all", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "sds", Toast.LENGTH_LONG).show();
                }
                else
                {
                    SQLiteDatabase db=openOrCreateDatabase("mnnit",MODE_PRIVATE,null);
                    db.execSQL("create table if not exists friends (name varchar,email varchar,password varchar,phone varchar,city varchar)");
                    String query ="select * from friends where name='"+s6+"'and password='"+s7+"' ";
                    Cursor cur=db.rawQuery(query,null);
                    if(cur.getCount()>0)
                    {
                       Intent i=new Intent(MainActivity.this,Third.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Wrong user id or Password", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,Second.class);
                startActivity(j);
                finish();

            }
        });


    }
}
