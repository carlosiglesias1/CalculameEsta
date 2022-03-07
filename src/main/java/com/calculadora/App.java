package com.calculadora;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    /**
     *
     */
    private static final String DEFAULT_TEXT = "Introduce dos números: ";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Hello Calculator!");
        int opcion;
        do {
            System.out.println("\t1.-Sumar\n\t2.-Restar\n\t3.-Multiplicar\n\t4.-Dividir\n\t5.-Potencia\n\t0.-Salir");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println(DEFAULT_TEXT);
                    System.out.println(calculadora.sumar(Double.parseDouble(teclado.nextLine()),
                            Double.parseDouble(teclado.nextLine())));
                    break;
                case 2:
                    System.out.println(DEFAULT_TEXT);
                    System.out.println(calculadora.restar(Double.parseDouble(teclado.nextLine()),
                            Double.parseDouble(teclado.nextLine())));
                    break;
                case 3:
                    System.out.println(DEFAULT_TEXT);
                    System.out.println(calculadora.multiplicar(Double.parseDouble(teclado.nextLine()),
                            Double.parseDouble(teclado.nextLine())));
                    break;
                case 4:
                    System.out.println(DEFAULT_TEXT);
                    System.out.println(calculadora.divide(Double.parseDouble(teclado.nextLine()),
                            Double.parseDouble(teclado.nextLine())));
                    break;
                case 5:
                    System.out.println("Introduce dos base y exponente: ");
                    System.out.println(calculadora.potencia(Double.parseDouble(teclado.nextLine()),
                            Integer.parseInt(teclado.nextLine())));
                    break;
                default:
                    opcion = 0;
                    break;
            }
        } while (opcion != 0);
        teclado.close();
    }
}
