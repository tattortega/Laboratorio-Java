package com.sofka.java.exercises.exercise_11;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.HashMap;
import java.util.Map;


/**
 * Clase Exercise11
 * Se indica la longitud de la frase ingresada por consola y la cantidad de vocales.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Exercise11 {
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
        messages.showMessage("Ingrese una frase: ");
        sentence = scanner.getString();
    }

    /**
     * Método para medir la longitud de la frase
     */
    public void lengthSentence() {
        int length;
        length = sentence.length();
        messages.showMessage("La frase tiene " + length + " de longitud");
    }

    /**
     * Método para contar las vocales de la frase
     */
    public void countVowels() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
        for (int i = 1; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if ("aeiou".contains(String.valueOf(currentLetter))) {
                String key = String.valueOf(currentLetter);
                hashMap.put(key, hashMap.get(key) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            messages.showMessage("Vocal: " + entry.getKey() + " Cantidad: " + entry.getValue());
        }
    }

}
