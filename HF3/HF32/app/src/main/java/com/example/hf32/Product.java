package com.example.hf32;

import android.view.View;

import java.util.ArrayList;

public class Product {

    public String kod;
    public String nev;
    public String ar;

    public Product(String kod,String nev,String ar){
        this.kod=kod;
        this.nev=nev;
        this.ar=ar;
    }

    public String toString(){
        return this.kod+this.nev +this.ar;
    }


}