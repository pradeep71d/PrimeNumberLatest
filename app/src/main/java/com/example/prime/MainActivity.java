package com.example.prime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x=8;
        int temp=0;
        for (int i=2;i<x-1;i++){
           if (x%2==0){
               temp=temp+1;
           }
        }
        if (temp==0){
            System.out.println(x+"number is prime number");
        }else {
            System.out.println(x+"number is not prime number");
        }
    }
}
