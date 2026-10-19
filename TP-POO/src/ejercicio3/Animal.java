package ejercicio3;

import java.util.Objects;

public class Animal {

    private String nombre;
    private String sonido;

    public Animal(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void hacerSonido() {
        System.out.println("El " + nombre + " hace: " + sonido);
    }

    @Override
    public String toString() {
        return "Animal{nombre='" + nombre + "', sonido='" + sonido + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal otro = (Animal) o;
        return Objects.equals(nombre, otro.nombre) && Objects.equals(sonido, otro.sonido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sonido);
    }
}
