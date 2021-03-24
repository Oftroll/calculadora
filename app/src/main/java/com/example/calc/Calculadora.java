package com.example.calc;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    ArrayList<Character> operadores = new ArrayList<Character>();
    Integer resposta = null;
    String expressao = null;

    public void getResposta(String exp){
        empilharExpressao(exp);
        resposta = resolveExpressao();
        expressao = exp;
    }
    public void empilharExpressao(String expressao){
        int i,j;
        j = i = 0;
        int conta = 0;
        int tam = expressao.length();
        while(i<tam){
            if(Character.isDigit(expressao.charAt(i))){
                conta++;
            }else{
                numeros.add(Integer.parseInt(expressao.substring(j, conta)));
                operadores.add(expressao.charAt(conta));
                conta++;
                j = conta;
            }
            i++;
        }
        numeros.add(Integer.parseInt(expressao.substring(j, conta)));
    }
    public int verPosicao(int tamO){
        int y,valor;
        y = valor = 0;
        while(y<tamO){
            if(operadores.get(y) =='*' || operadores.get(y) == '/'){
                valor = y;
                break;
            }
            y++;
        }
        return valor;
    };
    public int calcula(int posCalculo){
        char operador = operadores.get(posCalculo);
        int numero1 = numeros.get(posCalculo);
        int numero2 = numeros.get(posCalculo+1);

        if(operador =='+'){
            return numero1 +numero2;
        }else if(operador =='-'){
            return numero1 - numero2;
        }else if(operador == '*'){
            return numero1 * numero2;
        }else{
            return numero1 /numero2;
        }

    }
    public int resolveExpressao(){
        int tamN = numeros.size();
        int tamO = operadores.size();
        int soma = 0;
        int posCalculo = 0;
        while(tamN>1){
            posCalculo = verPosicao(tamO);
            soma = calcula(posCalculo);
            numeros.remove(posCalculo+1);
            numeros.set(posCalculo, soma);
            operadores.remove(posCalculo);
            tamN = numeros.size();
            tamO = operadores.size();
        }

        return numeros.get(posCalculo);
    }
    public  void limpar(){
        numeros = new ArrayList<Integer>();
        operadores = new ArrayList<Character>();
        resposta = null;
        expressao = null;
    }

}
