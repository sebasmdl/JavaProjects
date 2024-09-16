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
        Cuenta cuentaAhorros2 = new CuentaAhorro("005455513", 1500.0); 
        Cuenta cuentaCorriente2 = new CuentaCorriente("00326956", 300.0);

        // Creo un cliente con dos cuentas
        Cliente cliente1 = new Cliente(1, "Jaime gomez", "Carrera 10 #30-26");
        cliente1.agregarCuenta(cuentaAhorros1);
        cliente1.agregarCuenta(cuentaCorriente1);

        Cliente cliente2 = new Cliente(2, "Ana Perez", "Carrera 12 #45-78");
        cliente2.agregarCuenta(cuentaAhorros2);
        cliente2.agregarCuenta(cuentaCorriente2);
        
        // Agrego el cliente al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // listo los clientes del banco
         System.out.println("\n\nClientes ordenados por nombre:");
        banco.listarClientes();
        
         System.out.println("\nCuentas de cada cliente ordenadas por saldo:");
        for (Cliente cliente : banco.getClientes()) { 
            System.out.println(cliente.getNombre() + ":");
            for (Cuenta cuenta : cliente.getCuentas()) { 
                System.out.println(cuenta);
            }
        }
        
         // Listar los clientes del banco
        System.out.println("\n\nClientes ordenados por ID:");
        for (Cliente cliente : banco.obtenerClientes()) {
            System.out.println(cliente);
        }
        
         // Consultar un cliente específico
        System.out.println("\n\nConsultar cliente con ID 1:");
        Cliente clienteConsultado = banco.consultarCliente(1);
        System.out.println(clienteConsultado != null ? clienteConsultado : "Cliente no encontrado.");
 
    }
}
