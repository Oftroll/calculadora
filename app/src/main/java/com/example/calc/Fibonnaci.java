package com.example.calc;

import android.view.View;

public class Fibonnaci {

    public String calcular_fibo(Integer numero){
        Integer i ,j=1,k=0,soma;
        if(numero == 0){
            soma = 0;
        }else{
            soma = 1;
        }
        for (i=0;i<numero-1;i++){
            soma = k+j;
            k = j;
            j = soma;
        }

    return soma.toString();
   };
}
