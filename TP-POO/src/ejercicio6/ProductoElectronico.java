package ejercicio6;

import java.util.Objects;

public class ProductoElectronico extends Producto {

    private String marca;
    private int mesesGarantia;

    public ProductoElectronico(int id, String nombre, double precio,
                               String marca, int mesesGarantia) {
        super(id, nombre, precio);
        this.marca = marca;
        this.mesesGarantia = mesesGarantia;
    }

    public String getMarca() {
        return marca;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Marca: " + marca);
        System.out.println("Garantía: " + mesesGarantia + " meses");
    }

    @Override
    public String toString() {
        return "ProductoElectronico{id=" + getId() + ", nombre='" + getNombre()
                + "', precio=" + getPrecio() + ", marca='" + marca
                + "', mesesGarantia=" + mesesGarantia + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        ProductoElectronico otro = (ProductoElectronico) o;
        return mesesGarantia == otro.mesesGarantia && Objects.equals(marca, otro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), marca, mesesGarantia);
    }
}
