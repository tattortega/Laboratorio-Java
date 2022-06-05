package com.sofka.java.exercises.exercise_1;

import com.sofka.java.utilities.Messages;

/**
 * Clase Exercise1
 * Se compara dos números declarados previamente y se indica cuál es mayor o si son iguales
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */

public class Exercise1 {
    /**
     * Primer número a evaluar
     */
    private static final Integer NUMBER1 = 10;
    /**
     * Segundo número a evaluar
     */
    private static final Integer NUMBER2 = 5;
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();


    /**
     * Método para comparar dos números
     */
    public void compareNumbers() {
        messages.showMessage("Los números son: "+ NUMBER1 + "-" + NUMBER2);
        if (NUMBER1.equals(NUMBER2)) {
            messages.showMessage("Los números son iguales");
        } else if (NUMBER1 > NUMBER2) {
            messages.showMessage("El número mayor es: "+ NUMBER1);
        } else {
            messages.showMessage("El número mayor es: "+ NUMBER2);
        }
    }
}
