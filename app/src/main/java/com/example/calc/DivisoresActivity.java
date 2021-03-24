package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DivisoresActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisores);
    }
    public void calcular(View v){

        EditText inputExpressao = (EditText) findViewById(R.id.leitor2);
        try{
            Integer expressao = Integer.parseInt(inputExpressao.getText().toString());
            atualizar(divisores(expressao));
        }catch (Exception e){
            alert("erro fatal");
        }
    }
    public String divisores(Integer num){
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        for(int i = num; i>0;i--){//não pode fazer divisoes com zero
            if(num%i==0){
               divisores.add(i);
            }
        }
        Log.d("opan",divisores.toString());

        return divisores.toString();
    }

    public void atualizar(String resp){
        alert("");
        TextView viewResp = (TextView) findViewById(R.id.resposta2);
        viewResp.setText(resp);
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert2);
        viewAlert.setText(msg);
    }

}