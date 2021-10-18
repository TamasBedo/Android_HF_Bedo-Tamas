package com.example.hf32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> produktum=new ArrayList<>();
    EditText produktumkod=findViewById(R.id.mezo1);
    EditText produktumnev=findViewById(R.id.mezo2);
    EditText produktumar=findViewById(R.id.mezo3);
    Button addProduct;
    Button cancel;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Product produktumok=new Product(produktumkod.getText().toString(),produktumnev.getText().toString(),produktumnev.getText().toString());
                produktumok.add(produktum);
                Log.d("stat","cod"+produktumkod.getText().toString());
                produktumkod.setText("");
                produktumnev.setText("");
                produktumar.setText("");
            }

        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lista=(TextView) findViewById(R.id.show);
                lista.setText("");

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produktumkod.setText("");
                produktumnev.setText("");
                produktumar.setText("");
            }
        });

    }


}