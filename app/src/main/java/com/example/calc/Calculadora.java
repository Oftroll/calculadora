package com.example.calc;

import java.util.Stack;

public class Calculadora {
    Stack<Integer> pilha = new Stack<Integer>();

    public void somar(){
        int n1 = (Integer) pilha.pop();
        int n2 = (Integer) pilha.pop();
        int resultado = n1+n2;
        pilha.push(resultado);
    }
    public void subtrair(){
        int n1 = (Integer) pilha.pop();
        int n2 = (Integer) pilha.pop();
        int resultado = n1-n2;
        pilha.push(resultado);
    }
    public void dividir(){
        int n1 = (Integer) pilha.pop();
        int n2 = (Integer) pilha.pop();
        int resultado = n1/n2;
        pilha.push(resultado);
    }
    public void multiplicar(){
        int n1 = (Integer) pilha.pop();
        int n2 = (Integer) pilha.pop();
        int resultado = n1*n2;
        pilha.push(resultado);
    }

}
