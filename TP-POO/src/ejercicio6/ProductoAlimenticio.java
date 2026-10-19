package ejercicio6;

import java.util.Objects;

public class ProductoAlimenticio extends Producto {

    private String fechaVencimiento;
    private int calorias;

    public ProductoAlimenticio(int id, String nombre, double precio,
                               String fechaVencimiento, int calorias) {
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.calorias = calorias;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Calorías: " + calorias);
    }

    @Override
    public String toString() {
        return "ProductoAlimenticio{id=" + getId() + ", nombre='" + getNombre()
                + "', precio=" + getPrecio() + ", fechaVencimiento='" + fechaVencimiento
                + "', calorias=" + calorias + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        ProductoAlimenticio otro = (ProductoAlimenticio) o;
        return calorias == otro.calorias
                && Objects.equals(fechaVencimiento, otro.fechaVencimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaVencimiento, calorias);
    }
}
