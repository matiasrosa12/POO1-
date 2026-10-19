package ejercicio5;

public class Main {

    public static void main(String[] args) {
        Vehiculo auto = new Auto("Toyota", "Corolla", 190, 4);
        Vehiculo moto = new Moto("Harley-Davidson", "Fat Boy", 170, "chopera");

        System.out.println("=== Auto ===");
        auto.describir();
        System.out.println(auto);

        System.out.println("\n=== Moto ===");
        moto.describir();
        System.out.println(moto);

        System.out.println("\nauto.equals(moto): " + auto.equals(moto));
        System.out.println("auto.equals(otro auto igual): "
                + auto.equals(new Auto("Toyota", "Corolla", 190, 4)));
    }
}
