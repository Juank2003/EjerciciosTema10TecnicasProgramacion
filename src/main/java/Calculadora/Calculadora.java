package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void imprimir() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introducir un número entero (o 0 para salir):");
            String input = sc.nextLine();

            if (input.equals("0")) {
                System.out.println("¡Adios!");
                sc.close();
                return;
            }

            int a;
            try {
                a = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                continue;
            }

            System.out.println(a);

            System.out.println("¿Operador? (+ - * / % o 0 para salir)");
            String operador = sc.nextLine();

            int b;
            try {
                System.out.println("Introducir un número entero:");
                b = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                continue;
            }

            try {
                switch (operador) {
                    case "+":
                        System.out.println(a + " + " + b + " = " + UtilidadOperacion.suma(a, b));
                        break;
                    case "-":
                        System.out.println(a + " - " + b + " = " + UtilidadOperacion.resta(a, b));
                        break;
                    case "*":
                        System.out.println(a + " * " + b + " = " + UtilidadOperacion.multiplicacion(a, b));
                        break;
                    case "/":
                        int divisionEntera = UtilidadOperacion.divisionEntera(a, b);
                        System.out.println(a + " / " + b + " = " + divisionEntera);
                        break;
                    case "%":
                        int divisionResto = UtilidadOperacion.divisionResto(a, b);
                        System.out.println(a + " % " + b + " = " + divisionResto);
                        break;
                    case "0":
                        System.out.println("¡Adios!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Operador no válido. Inténtelo de nuevo...");
                        continue;
                }
            } catch (DesbrodaCapacidadExcepcion e) {
                System.out.println(e.getMessage() + " Inténtelo de nuevo...");
            } catch (ArithmeticException e) {
                System.out.println("La división por cero no está definida. Inténtelo de nuevo...");
            }
        }
    }
}