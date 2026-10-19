package ejercicio4;

import java.util.Objects;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo{color='" + getColor() + "', radio=" + radio + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo otro = (Circulo) o;
        return Double.compare(radio, otro.radio) == 0
                && Objects.equals(getColor(), otro.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), radio);
    }
}
