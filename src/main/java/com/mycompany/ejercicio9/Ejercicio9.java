    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author sebas
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Fecha de hoy: " + fechaHoy);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formato);
        System.out.println("Fecha formateada: " + fechaFormateada);

        String fechaCadena = "25/12/2023";
        LocalDate fechaConvertida = convertirCadenaAFecha(fechaCadena, formato);
        if (fechaConvertida != null) {
            System.out.println("Fecha convertida: " + fechaConvertida);
        }

        ZonedDateTime horaEnZona = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Hora actual en Nueva York: " + horaEnZona);
    }

    private static LocalDate convertirCadenaAFecha(String cadenaFecha, DateTimeFormatter formato) {
        try {
            return LocalDate.parse(cadenaFecha, formato);
        } catch (DateTimeParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
            return null;
        }
    }
}
