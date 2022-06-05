package com.sofka.java.exercises.exercise_14;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise14
 * Se pide un número por consola y se imprime por pantalla los números desde el número introducido hasta 1000
 * con saltos de 2 en 2.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Exercise14 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    /**
     * Número ingresada por consola
     */
    private Integer number;

    /**
     * Método para ingresar un número
     */
    public void inputNumber() {
        try {
            messages.showMessage("Ingrese un número: ");
            number = scanner.getInteger();
        } catch (InputMismatchException exception) {
            exception.getCause();
            messages.showMessage("No ingrese texto");
        }
    }

    /**
     * Método que imprime de 2 en 2 a partir de un número
     */
    public void printInPairs() {
        for (int i = number; i <= 1000; i += 2) {
            String value = String.valueOf(i);
            messages.showMessage(value);
        }
    }
}
