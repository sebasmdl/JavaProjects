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

          // Multiples cuentas
        Cuenta cuentaAhorros1 = new CuentaAhorro("005455512", 1000.0);
        Cuenta cuentaCorriente1 = new CuentaCorriente("00326955", 500.0);

        // Creo un cliente con dos cuentas
        Cliente cliente1 = new Cliente("Jaime gomez", "Carrera 10 #30-26");
        cliente1.agregarCuenta(cuentaAhorros1);
        cliente1.agregarCuenta(cuentaCorriente1);

        // Agrego el cliente al banco
        banco.agregarCliente(cliente1);

        // listo los clientes del banco
        banco.listarClientes();

        // Obtengo una cuenta
        Cuenta cuentaConsultada = cliente1.getCuenta("123456");
        if (cuentaConsultada != null) {
            System.out.println("Saldo de la cuenta consultada: " + cuentaConsultada.consultarSaldo());
        }   
    }
}
