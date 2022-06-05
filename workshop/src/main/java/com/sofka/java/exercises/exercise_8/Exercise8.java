package com.sofka.java.exercises.exercise_8;


import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise8
 * Se solicita un dia de la semana y se indica si es dia laboral o no.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise8 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para evaluar si un dia es laboral o no
     */
    public void workingDay() {
        try {
            messages.showMessage("Ingrese un dia de la semana: ");
            String day = scanner.getString().toLowerCase();
            switch (day) {
                case "lunes", "martes", "miercoles", "jueves", "viernes" -> messages.showMessage("El " + day + " es un dia laboral");
                case "sabado", "domingo" -> messages.showMessage("El " + day + " no es un dia laboral");
                default -> messages.showMessage("No has ingresado un dia correcto");
            }
        } catch (InputMismatchException exception) {
            exception.getCause();
            messages.showMessage("Vuelva a intentar");
        }
    }

}
