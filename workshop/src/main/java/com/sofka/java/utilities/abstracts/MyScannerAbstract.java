package com.sofka.java.utilities.abstracts;

import java.util.Scanner;

/**
 * Clase abstracta donde se inicializa la clase scanner
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/06/04
 * @since 1.0.0
 */
public abstract class MyScannerAbstract {

    protected static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para capturar un entero de la consola
     *
     * @return Integer
     */
    public Integer getInteger() {
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Método para capturar un double de la consola
     *
     * @return Double
     */
    public Double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }

    /**
     * Método para capturar un string de la consola
     *
     * @return String
     */
    public abstract String getString();
}
