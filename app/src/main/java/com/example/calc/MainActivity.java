package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onVerCalculadora(View v){
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
    }
    public void onVerFibo(View v){
        Intent intent = new Intent(this, FibonnaciActivity.class);
        startActivity(intent);
    }


}