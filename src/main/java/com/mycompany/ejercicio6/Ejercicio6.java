/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;

/**
 *
 * @author sebas
 */
public class Ejercicio6 {

   public static void main(String[] args) {
        
        UnaryOperator<Integer> aumentar = numero -> numero + 1;
        int resultadoAumento = aumentar.apply(5);
        System.out.println("5 aumentado en 1: " + resultadoAumento);

        BinaryOperator<Integer> sumar = (a, b) -> a + b;
        int resultadoSuma = sumar.apply(3, 4);
        System.out.println("Suma de 3 y 4: " + resultadoSuma);

        IntConsumer imprimirNumero = numero -> System.out.println("Numero: " + numero);
        imprimirNumero.accept(10); // 
    }
}
