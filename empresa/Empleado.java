package empresa;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor que 0.");
        }
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
