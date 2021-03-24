package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MultiplosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplos);
    }
    public void calcular(View v){

        EditText inputNum = (EditText) findViewById(R.id.leitor3);
        EditText inputQtd= (EditText) findViewById(R.id.leitorq3);
        try{
            Integer num = Integer.parseInt(inputNum.getText().toString());
            Integer qtd = Integer.parseInt(inputQtd.getText().toString());
            atualizar(multiplos(num,qtd));
        }catch (Exception e){
            alert("erro fatal");
        }
    }
    public String multiplos(Integer num,Integer qtd){
        ArrayList<Integer> multiplos = new ArrayList<Integer>();
        multiplos.add(num);
        Integer count = num+1;
        int i = 1;
        while(i<qtd){
            if(count % num == 0){
                multiplos.add(count);
                i++;
            }
            count+=1;
        }
        return  multiplos.toString();
    }

    public void atualizar(String resp){
        alert("");
        TextView viewResp = (TextView) findViewById(R.id.resposta3);
        viewResp.setText(resp);
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert3);
        viewAlert.setText(msg);
    }
}