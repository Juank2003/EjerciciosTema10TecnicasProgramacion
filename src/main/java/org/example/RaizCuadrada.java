package org.example;

import java.util.Scanner;

public class RaizCuadrada {

    public static void imprimirRaizCuadrada(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        double num = input.nextDouble();

        try {
            double resultado = raizCuadrada(num);
            System.out.printf("√%.2f = %.2f\n", num, resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double raizCuadrada(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("La raíz cuadrada no está definida para un número negativo.");
        }
        return Math.sqrt(num);
    }
}
