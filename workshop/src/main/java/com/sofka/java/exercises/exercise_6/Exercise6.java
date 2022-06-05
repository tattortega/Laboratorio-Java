package com.sofka.java.exercises.exercise_6;

import com.sofka.java.utilities.Messages;


/**
 * Clase Exercise6
 * Se muestra los números pares e impares del 1 hasta el 100 usando ciclo for
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise6 {
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();

    /**
     * Método para mostrar números pares e impares
     */
    public void showEvenOddNumber() {
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                messages.showMessage("Número par: "+ number);
            } else {
                messages.showMessage("Número impar: "+ number);
            }
        }
    }

}
