package com.exerc;

public class Main {
    public static void main(String[] args) {
        System.out.println(verificaIntervalo(50.2));
    }

    public static String verificaIntervalo(double valor) {
        if(valor >= 0 && valor <= 25) {
            return "Intervalo [0,25]";
        } else if (valor >= 25.00001 && valor <= 50){
            return "Intervalo (25,50]";
        } else if (valor >= 50.00001 && valor <= 75){
            return"Intervalo (50,75]";
        } else if (valor >= 75.00001 && valor <= 100){
            return"Intervalo (75,100]";
        } else {
            return"Fora de Intervalo";
        }
    }
}