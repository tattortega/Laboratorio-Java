package com.sofka.java.utilities;

/**
 * Clase para capturar las excepciones
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/06/04
 * @since 1.0.0
 */
public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Exception exception) {
        super(message, exception);
    }
}
