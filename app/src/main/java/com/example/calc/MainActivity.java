package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
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
    public void onVerMultiplos(View v){
        Intent intent = new Intent(this, MultiplosActivity.class);
        startActivity(intent);
    }
    public void onVerDivisores(View v){
        Intent intent = new Intent(this, DivisoresActivity.class);
        startActivity(intent);
    }


}