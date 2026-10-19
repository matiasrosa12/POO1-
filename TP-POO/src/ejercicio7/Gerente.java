package ejercicio7;

import java.util.Objects;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, int legajo, double salarioBase, double bono) {
        super(nombre, legajo, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1.0 + bono);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono: " + (bono * 100) + "%");
    }

    @Override
    public String toString() {
        return "Gerente{nombre='" + getNombre() + "', legajo=" + getLegajo()
                + ", salarioBase=" + getSalarioBase() + ", bono=" + bono + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Gerente otro = (Gerente) o;
        return Double.compare(bono, otro.bono) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bono);
    }
}
