package utils;

public class TestUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.sumar(5, 3));
        System.out.println("Resta: " + Utilidades.restar(10, 4));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(6, 7));
        System.out.println("División: " + Utilidades.dividir(8, 2));
        System.out.println("División por cero: " + Utilidades.dividir(5, 0));
    }
}
