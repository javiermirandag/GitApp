package com.example.gitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // TODO: Documentacion inicial de onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState ==null) {
           // Solucion de Luis

        }

        setContentView(R.layout.activity_main);
    }
}
