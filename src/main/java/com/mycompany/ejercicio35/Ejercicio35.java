/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio35;

/**
 *
 * @author sebas
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        int[] primos = new int[25];
        int index = 0;

        for (int num = 2; num <= 100; num++) {
            if (esNumeroPrimo(num)) {
                primos[index] = num;
                index++;
            }
        }

        System.out.println("Numeros primos entre 1 y 100:");
        for (int i = 0; i < index; i++) {
            System.out.print(primos[i] + " ");
        }
    }

    public static boolean esNumeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
