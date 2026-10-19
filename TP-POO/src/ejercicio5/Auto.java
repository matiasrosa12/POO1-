package ejercicio5;

import java.util.Objects;

public class Auto extends Vehiculo {

    private int nroPuertas;

    public Auto(String marca, String modelo, int velocidadMaxima, int nroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.nroPuertas = nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Número de puertas: " + nroPuertas);
    }

    @Override
    public String toString() {
        return "Auto{marca='" + getMarca() + "', modelo='" + getModelo()
                + "', velocidadMaxima=" + getVelocidadMaxima() + ", nroPuertas=" + nroPuertas + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Auto otro = (Auto) o;
        return nroPuertas == otro.nroPuertas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nroPuertas);
    }
}
