package banco;

public class TestCuenta {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("12345", 5000.0, "Ahorros");

        c.mostrarDetalles();

        System.out.println("Tipo de cuenta: " + c.tipoCuenta);

        c.setSaldo(7000.0);
        System.out.println("Saldo actualizado: " + c.getSaldo());
    }
}
