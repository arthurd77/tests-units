package com.example.tests.testes;

public class Calculadora {
    Integer num1;
    Integer num2;

    public int soma(Integer num1, Integer num2){
        return num1 + num2;
    }

    public int subtracao(Integer num1, Integer num2){
        return num1 - num2;
    }

    public int divisao(Integer num1, Integer num2){
        return num1 / num2;
    }

    public int multiplicacao(Integer num1, Integer num2){
        return num1 * num2;
    }

    public Boolean isPositive(Integer num){
        return num > 0;
    }

}
