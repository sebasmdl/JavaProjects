/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstapp;

/**
 *
 * @author sebas
 */
import java.util.TreeSet;

public class Banco implements ServicioClientes{
    private final TreeSet<Cliente> clientes;

    public Banco() {
        clientes = new TreeSet<>();
    }
    @Override
    public boolean  agregarCliente(Cliente cliente) {
        return clientes.add(cliente);
    }
    @Override
    public boolean eliminarCliente(int id) {
        return clientes.removeIf(cliente -> cliente.getId() == id);
    }
   @Override
      public Cliente consultarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
    
     public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

   public TreeSet<Cliente> getClientes() {
        return clientes;
    }
    @Override
    public TreeSet<Cliente> obtenerClientes() {
        return clientes;
    }
}
