package ejercicio4;

import java.util.Objects;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{color='" + getColor() + "', base=" + base + ", altura=" + altura + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo otro = (Rectangulo) o;
        return Double.compare(base, otro.base) == 0
                && Double.compare(altura, otro.altura) == 0
                && Objects.equals(getColor(), otro.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), base, altura);
    }
}
