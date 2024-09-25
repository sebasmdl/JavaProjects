/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9;

/**
 *
 * @author sebas
 */
import java.util.Arrays;
import java.util.List;

public class Ejercicio11 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int suma = numeros.parallelStream()
                          .reduce(0, Integer::sum);
        System.out.println("Suma de numeros: " + suma);

        List<Integer> numerosAleatorios = Arrays.asList(1, 2, 3, 4, 5);
        int sumaAleatoria = numerosAleatorios.parallelStream()
                                              .map(numero -> numero + (int)(Math.random() * 10))
                                              .reduce(0, Integer::sum);
        System.out.println("Suma de numeros aleatorios: " + sumaAleatoria);
    }
}
