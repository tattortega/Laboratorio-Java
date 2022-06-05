package com.sofka.java.exercises.exercise_3;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;


/**
 * Clase Exercise3
 * Se calcula el área de un círculo
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise3 {
    /**
     * Radio del circulo
     */
    private Double radius;
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para capturar el radio del círculo
     */
    public void inputRadius() {
        messages.showMessage("Ingrese el radio del círculo: ");
        radius = scanner.getDouble();
    }

    /**
     * Método para calcular el área de un círculo
     */
    public void calculateArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        messages.showMessage(String.format("El área del círculo es de: %.2f" , area));
    }

}
