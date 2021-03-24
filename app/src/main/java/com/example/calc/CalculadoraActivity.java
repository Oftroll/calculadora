package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class CalculadoraActivity extends Activity {

    Calculadora calculadora = new  Calculadora();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculadora);
    }


    public void calcular(View v){

        EditText inputExpressao = (EditText) findViewById(R.id.leitor);
        String expressao =  inputExpressao.getText().toString();
        try{
            calculadora.limpar();
            calculadora.getResposta(expressao);
            atualizar();
        }catch (Exception e){
            alert("erro fatal");
        }
    }

    public void atualizar(){
        alert("");
        TextView viewExpressao = (TextView) findViewById(R.id.expressao);
        TextView viewResp = (TextView) findViewById(R.id.resposta1);
        viewExpressao.setText(calculadora.expressao);
        viewResp.setText(calculadora.resposta.toString());
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert);
        viewAlert.setText(msg);
    }
}