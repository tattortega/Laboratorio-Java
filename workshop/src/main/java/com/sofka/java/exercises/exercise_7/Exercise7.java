package com.sofka.java.exercises.exercise_7;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise7
 * Se solicita un número mayor o igual a cero
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise7 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para evaluar el número ingresado por consola
     */
    public void evaluateNumber() {
        boolean condition = true;
        do {
            try {
                messages.showMessage("Ingrese un número: ");
                int number = scanner.getInteger();
                if (number >= 0) {
                    messages.showMessage("Número ingresado: " + number);
                    condition = false;
                }
            } catch (InputMismatchException exception) {
                exception.getCause();
                messages.showMessage("Ingrese un número, no texto");
                scanner.getString();
            }
        } while (condition);
    }

}
