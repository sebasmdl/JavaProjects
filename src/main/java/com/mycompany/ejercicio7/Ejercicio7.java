    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author sebas
 */
import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro", "Pepe", "Maria");

       
        List<String> nombresConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A")) 
                .map(String::toUpperCase) 
                .toList();

        System.out.println("Nombres que comienzan con 'A' mayuscula: " + nombresConA);

        
        System.out.println("List de todos los nombres:");
        nombres.stream()
                .forEach(System.out::println); 

       
        String primerNombreConA = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .findFirst() 
                .orElse("No hay nombres que comiencen con A");

        System.out.println("Primer nombre que comienza con 'A': " + primerNombreConA);
    }
}