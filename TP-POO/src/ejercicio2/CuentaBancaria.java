package ejercicio2;

import java.util.Objects;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser positivo.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Saldo actual: $" + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente para retirar $" + monto
                    + ". Saldo disponible: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de $" + monto + " realizado. Saldo actual: $" + saldo);
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{titular='" + titular + "', numeroCuenta='" + numeroCuenta
                + "', saldo=" + saldo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria otra = (CuentaBancaria) o;
        return Objects.equals(numeroCuenta, otra.numeroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta);
    }
}
