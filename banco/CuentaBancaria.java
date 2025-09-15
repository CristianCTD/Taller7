package banco;

public class CuentaBancaria {
    private String numeroCuenta; // privado, no accesible fuera
    private double saldo;        // privado
    public String tipoCuenta;    // público

    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    // Métodos públicos para acceder a saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta +
                           ", Tipo: " + tipoCuenta +
                           ", Saldo: " + saldo);
    }
}
