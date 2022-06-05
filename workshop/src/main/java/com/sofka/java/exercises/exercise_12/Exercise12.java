package com.sofka.java.exercises.exercise_12;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;
import org.apache.commons.lang3.StringUtils;


/**
 * Clase Exercise12
 * Se solicita dos palabras por consola y se evalúa si son iguales o las diferencias que hay.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Exercise12 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Primera frase ingresada por consola
     */
    private String firstWord;

    /**
     * Segunda frase ingresada por consola
     */
    private String secondWord;


    /**
     * Método para ingresar dos palabras
     */
    public void inputWords() {
        messages.showMessage("Ingrese la primera palabra: ");
        firstWord = scanner.getString();
        messages.showMessage("Ingrese la segunda palabra: ");
        secondWord = scanner.getString();
    }

    /**
     * Método para comparar dos palabras
     */
    public void comparateTwoWords() {
        try {
            if (StringUtils.equals(firstWord, secondWord)) {
                messages.showMessage("Las palabras son iguales");
            } else {
                String diffFirstWord = StringUtils.difference(secondWord, firstWord);
                String diffSecondWord = StringUtils.difference(firstWord, secondWord);
                messages.showMessage("La diferencia entre las palabras es: " + diffFirstWord + " - " + diffSecondWord);
            }
        } catch (StringIndexOutOfBoundsException exception) {
            exception.getCause();
        }
    }

}
