package com.example.calc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calc.Calculadora;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculadoraActivity extends AppCompatActivity {

    Calculadora calculadora = new  Calculadora();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculadora);
    }

    public void empilhar(View v){
        try {
            EditText numero = (EditText) findViewById(R.id.leitor);
            calculadora.pilha.push(Integer.parseInt(numero.getText().toString()));
            numero.setText("");
            atualizar();
        }catch (NumberFormatException e){
            alert("Erro: Digite o valor a ser empilhado");
        }


    }

    public void desempilhar(View v){
        try {
            calculadora.pilha.pop();
            atualizar();
        }catch (EmptyStackException e){
            alert("Erro: Stack Vazio");
        }

    }
    public void calcular(View v){
        Button botao = (Button) v;

        char valor =  botao.getText().charAt(0);

        try {
            if(valor == '/'){
                calculadora.dividir();
            }else if(valor == '*'){
                calculadora.multiplicar();
            }else if(valor == '+'){
                calculadora.somar();
            }else{
                calculadora.subtrair();
            }
            atualizar();
        }catch (EmptyStackException e) {
            atualizar();
            alert("Erro: Stack Vazio");

        }catch (ArithmeticException e) {
            atualizar();
            alert("Erro: Divisão por 0 é impossivel");
        }
    }

    public static Stack<Integer> inverter(Stack<Integer> pilha) {
        Stack<Integer> inverso = new Stack<Integer>();
        for (int i = pilha.size()-1; i >= 0; i--
        ) {
            inverso.push(pilha.get(i));
        }
        return inverso;
    }
    public void atualizar(){
        alert("");
        TextView viewStack = (TextView) findViewById(R.id.stack);
        viewStack.setText(inverter(calculadora.pilha).toString());
    }
    public void alert(String msg){
        TextView viewAlert = (TextView) findViewById(R.id.alert);
        viewAlert.setText(msg);
    }
}