package Calculadora;
import java.lang.Exception;

public class DesbrodaCapacidadExcepcion extends Exception {

    public DesbrodaCapacidadExcepcion() {
        super("El resultado desborda la capacidad de esta calculadora");
    }

    public DesbrodaCapacidadExcepcion(String mensaje) {
        super(mensaje);
    }
}