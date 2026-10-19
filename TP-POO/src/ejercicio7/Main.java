package ejercicio7;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Laura Pérez", 100, 500000.0);
        Empleado gerente = new Gerente("Martín López", 200, 900000.0, 0.20);
        Empleado vendedor = new Vendedor("Sofía Ruiz", 300, 450000.0, 120000.0);

        Empleado[] empleados = {empleado, gerente, vendedor};

        for (Empleado e : empleados) {
            System.out.println("=== " + e.getClass().getSimpleName() + " ===");
            e.mostrarDatos();
            System.out.println(e);
            System.out.println();
        }

        System.out.println("gerente.equals(vendedor): " + gerente.equals(vendedor));
    }
}
