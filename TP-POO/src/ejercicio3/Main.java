package ejercicio3;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("loro", "hola!");
        Perro perro = new Perro("Firulais", "guau", "Labrador");
        Gato gato = new Gato("Michi", "miau", "naranja");

        System.out.println("=== Animal ===");
        animal.hacerSonido();
        System.out.println(animal);

        System.out.println("\n=== Perro ===");
        perro.hacerSonido();
        perro.buscarHueso();
        System.out.println("Raza: " + perro.getRaza());
        System.out.println(perro);

        System.out.println("\n=== Gato ===");
        gato.hacerSonido();
        gato.ronronear();
        System.out.println("Color de pelaje: " + gato.getColorPelaje());
        System.out.println(gato);

        System.out.println("\nperro.equals(gato): " + perro.equals(gato));
        Perro otroPerro = new Perro("Firulais", "guau", "Labrador");
        System.out.println("perro.equals(otroPerro igual): " + perro.equals(otroPerro));
    }
}
