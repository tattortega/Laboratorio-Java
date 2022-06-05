package com.sofka.java.exercises.exercise_9;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;


/**
 * Clase Exercise9
 * Se reemplazan las a por una e de una cadena de texto y se agrega otra cadena de texto ingresada por consola.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise9 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    /**
     * Frase inicial
     */
    private static final String SENTENCE = "La sonrisa sera la mejor arma contra la tristeza, ";
    /**
     * Frase reemplazada
     */
    private String sentenceReplaced;
    /**
     * Nueva frase
     */
    private String newSentence;

    /**
     * Método para reemplazar vocales de la frase
     */
    public void replaceVowelSentence() {
        messages.showMessage(SENTENCE);
        sentenceReplaced = SENTENCE.replace("a", "e");
        messages.showMessage(sentenceReplaced);
    }

    /**
     * Método para ingresar nueva frase
     */
    public void inputSentence() {
        messages.showMessage("Ingrese una frase: ");
        newSentence = scanner.getString();
    }

    /**
     * Método para concatenar las frases
     */
    public void concatSentences() {
        String finalSentence = sentenceReplaced + newSentence;
        messages.showMessage(finalSentence);
    }

}
