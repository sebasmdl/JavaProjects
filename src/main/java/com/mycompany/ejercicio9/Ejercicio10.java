/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9;

/**
 *
 * @author sebas
 */
import java.util.concurrent.*;

class Tarea implements Runnable {
    private final String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println(nombre + " en ejecucion.");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(nombre + " ha terminado.");
    }
}

public class Ejercicio10 {

    public static void main(String[] args) throws InterruptedException {
        ejecutarHilo();
        ejecutarPoolDeHilos();
    }

    private static void ejecutarHilo() throws InterruptedException {
        Thread hilo = new Thread(new Tarea("Hilo 1"));
        hilo.start();
        hilo.join(); 
    }

    private static void ejecutarPoolDeHilos() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new Tarea("Tarea 1"));
        executor.submit(new Tarea("Tarea 2"));

        executor.shutdown(); 
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}