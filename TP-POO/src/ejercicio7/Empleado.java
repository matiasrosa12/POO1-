package ejercicio7;

import java.util.Objects;

public class Empleado {

    private String nombre;
    private int legajo;
    private double salarioBase;

    public Empleado(String nombre, int legajo, double salarioBase) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Salario calculado: $" + calcularSalario());
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', legajo=" + legajo
                + ", salarioBase=" + salarioBase + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado otro = (Empleado) o;
        return legajo == otro.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }
}
