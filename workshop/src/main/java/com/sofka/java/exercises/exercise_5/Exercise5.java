package com.sofka.java.exercises.exercise_5;

import com.sofka.java.utilities.Messages;


/**
 * Clase Exercise5
 * Se muestra los números pares e impares del 1 hasta el 100 usando ciclo while
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise5 {
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();

    /**
     * Método para mostrar números pares e impares
     */
    public void showEvenOddNumber() {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                messages.showMessage("Número par: "+ number);
            } else {
                messages.showMessage("Número impar: "+ number);
            }
            number++;
        }
    }

}
