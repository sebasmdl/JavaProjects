/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstapp;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sebas
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private final List<Cuenta> cuentas;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
    }

    // Getters y Setters
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

    public Cuenta getCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta; // Find and return the account
            }
        }
        return null; // Return null if not found
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
}
