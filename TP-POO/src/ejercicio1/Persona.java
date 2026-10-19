package ejercicio1;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int edad;
    private long dni;

    public Persona(String nombre, int edad, long dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + ", dni=" + dni + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona otra = (Persona) o;
        return dni == otra.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
