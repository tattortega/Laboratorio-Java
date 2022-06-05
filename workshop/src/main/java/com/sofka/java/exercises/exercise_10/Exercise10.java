package com.sofka.java.exercises.exercise_10;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;


/**
 * Clase Exercise10
 * Se eliminan los espacios de la frase ingresada por consola.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise10 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Frase ingresada por consola
     */
    private String sentence;

    /**
     * Método para ingresar nueva frase
     */
    public void inputSentence() {
        messages.showMessage("Ingrese una frase con espacios: ");
        sentence = scanner.getString();
    }

    /**
     * Método para reemplazar los espacios de una frase
     */
    public void deleteSpacesSentence() {
        String newSentence = sentence.replace(" ", "");
        messages.showMessage(newSentence);
    }

}
