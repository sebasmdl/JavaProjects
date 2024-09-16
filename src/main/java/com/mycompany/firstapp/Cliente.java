/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstapp;

import java.util.TreeSet;
/**
 *
 * @author sebas
 */
public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private int id;
    private String direccion;
     private final TreeSet<Cuenta> cuentas;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new TreeSet<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

     public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta); // Add a new account to the list
    }

    public void eliminarCuenta(String numeroCuenta) {
        cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta)); // Remove an account by number
    }

     public TreeSet<Cuenta> getCuentas() {
        return cuentas;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nombre: ").append(nombre)
               .append(", Direccion: ").append(direccion)
               .append(", Cuentas: ");
        for (Cuenta cuenta : cuentas) {
            builder.append("[").append(cuenta).append("] ");
        }
        return builder.toString();
    }

    @Override
    public int compareTo(Cliente otroCliente) {
         return this.nombre.compareTo(otroCliente.nombre);
    }
}
