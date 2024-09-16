/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstapp;

/**
 *
 * @author sebas
 */
public class FirstApp {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cuenta cuentaAhorros = new CuentaAhorro("123456", 1000.0);
        Cliente cliente1 = new Cliente("Emilio garcia", "Calle 10 #145-4", cuentaAhorros);
        banco.agregarCliente(cliente1);

        Cuenta cuentaCorriente = new CuentaCorriente("654321", 500.0);
        Cliente cliente2 = new Cliente("Julian gomez", "Cra 34 #10-22", cuentaCorriente);
        banco.agregarCliente(cliente2);

        banco.listarClientes();

        // Realizar transacciones
        cliente1.getCuenta().depositar(500);
        cliente2.getCuenta().retirar(100);

        banco.listarClientes();
    }
}
