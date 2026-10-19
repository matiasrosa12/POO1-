package ejercicio3;

import java.util.Objects;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String sonido, String raza) {
        super(nombre, sonido);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void buscarHueso() {
        System.out.println(getNombre() + " (" + raza + ") está buscando un hueso.");
    }

    @Override
    public String toString() {
        return "Perro{nombre='" + getNombre() + "', sonido='" + getSonido()
                + "', raza='" + raza + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Perro otro = (Perro) o;
        return Objects.equals(raza, otro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raza);
    }
}
