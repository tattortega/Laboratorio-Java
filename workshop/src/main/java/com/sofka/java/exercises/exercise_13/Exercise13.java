package com.sofka.java.exercises.exercise_13;

import com.sofka.java.utilities.Messages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Clase Exercise13
 * Se consulta la fecha y hora actual
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Exercise13 {
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();

    /**
     * Método para consultar la fecha y hora actual
     */
    public void currentDateAndTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String date = dateTimeFormatter.format(currentDateTime);
        messages.showMessage("La fecha y hora actual es: " + date);

    }

}
