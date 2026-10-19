package ejercicio4;

public class Main {

    public static void main(String[] args) {
        Figura circulo = new Circulo("rojo", 3.0);
        Figura rectangulo = new Rectangulo("azul", 4.0, 5.0);

        circulo.mostrarInfo();
        System.out.println(circulo);

        System.out.println();
        rectangulo.mostrarInfo();
        System.out.println(rectangulo);

        System.out.println("\ncirculo.equals(rectangulo): " + circulo.equals(rectangulo));
        System.out.println("circulo.equals(otro círculo igual): "
                + circulo.equals(new Circulo("rojo", 3.0)));
    }
}
