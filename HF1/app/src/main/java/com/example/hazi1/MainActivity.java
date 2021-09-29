package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText szam1 = findViewById(R.id.szam1);
        EditText szam2 = findViewById(R.id.szam2);
        TextView eredmeny = findViewById(R.id.eredmeny);
        Button plusz = findViewById(R.id.plusz);
        Button minusz = findViewById(R.id.minusz);
        Button szor = findViewById(R.id.szor);
        Button oszt = findViewById(R.id.oszt);


        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double egyesszam = Double.parseDouble(szam1.getText().toString());
                    double ketteszam = Double.parseDouble(szam2.getText().toString());
                    double egyenlo = Double.parseDouble(String.valueOf(egyesszam / ketteszam));
                    eredmeny.setText(Double.toString(egyenlo));

            }
        });
        szor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double egyesszam = Double.parseDouble(szam1.getText().toString());
                double ketteszam = Double.parseDouble(szam2.getText().toString());
                double egyenlo = Double.parseDouble(String.valueOf(egyesszam * ketteszam));
                eredmeny.setText(Double.toString(egyenlo));

            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double egyesszam = Double.parseDouble(szam1.getText().toString());
                double ketteszam = Double.parseDouble(szam2.getText().toString());
                double egyenlo = Double.parseDouble(String.valueOf(egyesszam - ketteszam));
                eredmeny.setText(Double.toString(egyenlo));

            }
        });
        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double egyesszam = Double.parseDouble(szam1.getText().toString());
                double ketteszam = Double.parseDouble(szam2.getText().toString());
                double egyenlo = Double.parseDouble(String.valueOf(egyesszam + ketteszam));
                eredmeny.setText(Double.toString(egyenlo));

            }
        });
    }
}