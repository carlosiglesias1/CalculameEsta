package com.calculadora;

public class Calculadora {
    public Calculadora() {
        super();
    }

    public double sumar(double sumando, double sumando1) {
        return sumando + sumando1;
    }

    public double restar(double sumando, double sumando1) {
        return sumando - sumando1;
    }

    public double multiplicar(double sumando, double sumando1) {
        return sumando * sumando1;
    }

    public double divide(double sumando, double sumando1) {
        return sumando / sumando1;
    }

    public double potencia(double sumando, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * sumando;
        }
        return result;
    }
}
