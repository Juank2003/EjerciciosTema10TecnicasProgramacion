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
}
