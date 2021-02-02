package com.example.calc;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Funcoes extends AppCompatActivity {
    public void atualizar(){
        alert("");
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert);
        viewAlert.setText(msg);
    }
}
