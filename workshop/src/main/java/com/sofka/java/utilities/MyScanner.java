package com.sofka.java.utilities;

import com.sofka.java.utilities.abstracts.MyScannerAbstract;

/**
 * Clase que hereda de la clase abstracta MyScannerAbstract
 * Se sobrescriben los métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/06/04
 * @since 1.0.0
 */
public class MyScanner extends MyScannerAbstract {

    public static MyScanner getInstance() {
        return new MyScanner();
    }

    /**
     * Sobrescritura del método para validar la captura por consola de un entero
     *
     * @return Integer
     */
    @Override
    public Integer getInteger() {
        try {
            return super.getInteger();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Sobrescritura del método para validar la captura por consola de un double
     *
     * @return Double
     */
    @Override
    public Double getDouble() {
        try {
            return super.getDouble();
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }

    /**
     * Método para validar la captura por consola de un string
     *
     * @return String
     */
    public String getString() {
        try {
            return scanner.nextLine().replace("\\n", "");
        } catch (Exception exception) {
            throw new MyException(exception.getMessage(), exception);
        }
    }
}
