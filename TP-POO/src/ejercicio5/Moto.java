package ejercicio5;

import java.util.Objects;

public class Moto extends Vehiculo {

    private String tipo;

    public Moto(String marca, String modelo, int velocidadMaxima, String tipo) {
        super(marca, modelo, velocidadMaxima);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: " + tipo);
    }

    @Override
    public String toString() {
        return "Moto{marca='" + getMarca() + "', modelo='" + getModelo()
                + "', velocidadMaxima=" + getVelocidadMaxima() + ", tipo='" + tipo + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Moto otra = (Moto) o;
        return Objects.equals(tipo, otra.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }
}
