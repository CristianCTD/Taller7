package empresa;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", 2500.0);
        Empleado e2 = new Empleado("Luis", -1000.0);

        e1.mostrarInformacion();
        e2.mostrarInformacion();

        System.out.println("Empleado: " + e1.nombre);
        e1.setSalario(3000.0);
        System.out.println("Nuevo salario: " + e1.getSalario());
    }
}
