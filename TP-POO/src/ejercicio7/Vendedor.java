package ejercicio7;

import java.util.Objects;

public class Vendedor extends Empleado {

    private double comision;

    public Vendedor(String nombre, int legajo, double salarioBase, double comision) {
        super(nombre, legajo, salarioBase);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comision;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Comisión: $" + comision);
    }

    @Override
    public String toString() {
        return "Vendedor{nombre='" + getNombre() + "', legajo=" + getLegajo()
                + ", salarioBase=" + getSalarioBase() + ", comision=" + comision + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Vendedor otro = (Vendedor) o;
        return Double.compare(comision, otro.comision) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), comision);
    }
}
