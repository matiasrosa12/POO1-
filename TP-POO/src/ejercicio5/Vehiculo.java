package ejercicio5;

import java.util.Objects;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void describir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }

    @Override
    public String toString() {
        return "Vehiculo{marca='" + marca + "', modelo='" + modelo
                + "', velocidadMaxima=" + velocidadMaxima + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo otro = (Vehiculo) o;
        return velocidadMaxima == otro.velocidadMaxima
                && Objects.equals(marca, otro.marca)
                && Objects.equals(modelo, otro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, velocidadMaxima);
    }
}
