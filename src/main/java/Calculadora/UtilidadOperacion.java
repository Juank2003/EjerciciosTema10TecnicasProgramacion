package Calculadora;

public class UtilidadOperacion {
    public static int suma(int a, int b) throws DesbrodaCapacidadExcepcion {
        long resultado = (long)a + (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbrodaCapacidadExcepcion();
        }
        return (int)resultado;
    }

    public static int resta(int a, int b) throws DesbrodaCapacidadExcepcion {
        long resultado = (long)a - (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbrodaCapacidadExcepcion();
        }
        return (int)resultado;
    }

    public static int multiplicacion(int a, int b) throws DesbrodaCapacidadExcepcion {
        long resultado = (long)a * (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbrodaCapacidadExcepcion();
        }
        return (int)resultado;
    }

    public static int divisionEntera(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static int divisionResto(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a % b;
    }
}
