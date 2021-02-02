package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calc.Fibonnaci;

import androidx.appcompat.app.AppCompatActivity;

import java.util.EmptyStackException;

public class FibonnaciActivity extends AppCompatActivity {

    Fibonnaci fibo = new Fibonnaci();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonnaci);
    }
    public void calcular(View view){
        TextView resp = (TextView) findViewById(R.id.resposta);
        EditText ler = (EditText) findViewById(R.id.ler);
        alert("");
        atualizar();
        try {
            resp.setText(fibo.calcular_fibo(Integer.parseInt(ler.getText().toString())));
        }catch (NumberFormatException e){
            alert("Erro: Digite um valor");
        }catch (ArithmeticException e) {
            alert("Erro: Nao é uma operção aritimetica valida");
        }
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert_fb);
        viewAlert.setText(msg);
    }
    public void atualizar(){
        TextView viewResp = (TextView) findViewById(R.id.resposta);
        viewResp.setText("...");
    }



}