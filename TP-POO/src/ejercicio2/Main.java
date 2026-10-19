package ejercicio2;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana Gómez", "001-123456", 1000.0);

        cuenta.mostrarInfo();
        System.out.println();

        cuenta.depositar(500.0);
        cuenta.retirar(300.0);
        cuenta.retirar(5000.0);

        System.out.println("\nSaldo final: $" + cuenta.getSaldo());
        System.out.println("toString: " + cuenta);

        CuentaBancaria otra = new CuentaBancaria("Carlos Díaz", "001-999999", 0);
        System.out.println("cuenta.equals(otra): " + cuenta.equals(otra));
    }
}
