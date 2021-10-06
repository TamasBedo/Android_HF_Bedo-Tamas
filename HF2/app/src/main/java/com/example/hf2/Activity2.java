package com.example.hf2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Log.d("Statusz:", "MainActivity:onCreate()");

        Button gomb = findViewById(R.id.button2);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button gomb2 = findViewById(R.id.button3);

        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Activity2.this, Activity3.class);
                startActivity(intent1);
            }
        });



    }

    public void startActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void startActivity2(View v){
        Intent intent1 = new Intent(this,Activity3.class);
        startActivity(intent1);
    }

}