/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lambdaexercise;

/**
 *
 * @author sebas
 */
interface Notificacion {
    void enviar(String mensaje);
}


public class SistemaNotificacion {

    public static void main(String[] args) {
        Notificacion notificacionEmail = (mensaje) -> {
            System.out.println("Enviando notificación por correo: " + mensaje);
        };

        Notificacion notificacionSMS = (mensaje) -> {
            System.out.println("Enviando notificación por SMS: " + mensaje);
        };
        
        notificacionEmail.enviar("¡Hola, usuario! Tienes un nuevo mensaje.");
        notificacionSMS.enviar("¡Alerta! Se ha detectado una actividad sospechosa.");
    }
}
