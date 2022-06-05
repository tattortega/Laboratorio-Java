package com.sofka.java.exercises.exercise_4;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise4
 * Se calcula el precio final con IVA de un producto
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Exercise4 {
    /**
     * Valor del IVA
     */
    private static final Double IVA = 1.21;
    /**
     * Precio del producto
     */
    private Double priceProduct;
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para ingresar el precio del producto
     */
    public void inputPriceProduct() {
        try {
            messages.showMessage("Ingrese el precio del producto: ");
            priceProduct = scanner.getDouble();
        } catch (InputMismatchException exception) {
            messages.showMessage("Ingrese caracteres numéricos, no texto");
        }
    }

    /**
     * Método para calcular el precio final con IVA del producto
     */
    public void calculatePrice() {
        try {
            double finalPrice = priceProduct * IVA;
            messages.showMessage(String.format("El precio del producto con IVA es: $ %.0f" , finalPrice));
        } catch (NullPointerException exception) {
            messages.showMessage("El precio de producto es nulo");
        }
    }
}
