package com.example.hf2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Log.d("Statusz:", "Activity2:onCreate()");

        Button gomb3 = findViewById(R.id.button4);

        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "Stat:",  "Activity3:indul()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "Stat:",  "Activity3:folytatas()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "Stat:",  "Activity3:szunet()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "Stat:",  "Activity3:megall()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "Stat:",  "Activity3:ujraindul()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "Stat:",  "Activity3:megsemmisul()");
    }
}