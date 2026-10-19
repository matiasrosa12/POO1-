package ejercicio1;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana Gómez", 25, 40123456L);
        Persona p2 = new Persona("Carlos Díaz", 32, 35987654L);

        System.out.println("=== Persona 1 ===");
        p1.mostrarDatos();

        System.out.println("\n=== Persona 2 ===");
        p2.mostrarDatos();

        System.out.println("\ntoString: " + p1);
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        Persona copia = new Persona("Ana G.", 25, 40123456L);
        System.out.println("p1.equals(copia con mismo DNI): " + p1.equals(copia));
    }
}
