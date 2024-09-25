/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio35;

/**
 *
 * @author sebas
 */
public class Ejercicio36 {

    public static void main(String[] args) {
        int contador = 0;
        int num = 1;

        while (contador < 10) {
            if (esPerfecto(num)) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
    }

    public static boolean esPerfecto(int n) {
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }

        return suma == n;
    }
}