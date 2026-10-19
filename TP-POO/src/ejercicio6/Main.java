package ejercicio6;

public class Main {

    public static void main(String[] args) {
        Producto generico = new Producto(1, "Cuaderno", 2500.0);
        Producto alimento = new ProductoAlimenticio(2, "Yogur", 1200.0, "30/11/2026", 150);
        Producto electronico = new ProductoElectronico(3, "Auriculares", 45000.0, "Sony", 12);

        Producto[] productos = {generico, alimento, electronico};

        for (Producto p : productos) {
            System.out.println("=== " + p.getClass().getSimpleName() + " ===");
            p.mostrarInfo();
            System.out.println(p);
            System.out.println();
        }

        System.out.println("alimento.equals(electronico): " + alimento.equals(electronico));
    }
}
