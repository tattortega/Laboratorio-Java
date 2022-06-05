package com.sofka.java.exercises.exercise_2;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise2
 * Se compara dos números ingresados por consola e indica cuál es mayor o si son iguales
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise2 {
    /**
     * Primer número a evaluar
     */
    private Integer number1;
    /**
     * Segundo número a evaluar
     */
    private Integer number2;
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para el ingreso de los números
     * Se solicita por consola los dos números a comparar
     */
    public void inputNumber() {
        try {
            messages.showMessage("Ingrese el primer número: ");
            number1 = scanner.getInteger();
            messages.showMessage("Ingrese el segundo número: ");
            number2 = scanner.getInteger();
        } catch (InputMismatchException exception) {
            messages.showMessage("Ingrese un número no texto");
        }
    }

    /**
     * Método para comparar dos números
     */
    public void compareNumbers() {
        try {
            if (number1.equals(number2)) {
                messages.showMessage("Los números son iguales");
            } else if (number1 > number2) {
                messages.showMessage("El número mayor es: " + number1);
            } else {
                messages.showMessage("El número mayor es: " + number2);
            }

        } catch (NullPointerException exception) {
            messages.showMessage("Los números no deben ser nulos");
        }
    }

}

