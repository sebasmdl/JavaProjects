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

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int id);
    Cliente consultarCliente(int id);
    TreeSet<Cliente> obtenerClientes();
}