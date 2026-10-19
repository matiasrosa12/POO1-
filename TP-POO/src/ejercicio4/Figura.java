package ejercicio4;

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarInfo() {
        System.out.println(getClass().getSimpleName() + " de color " + color);
        System.out.printf("  Área: %.2f%n", calcularArea());
        System.out.printf("  Perímetro: %.2f%n", calcularPerimetro());
    }
}
