package com.sofka.java.exercises.exercise_15;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise15
 * Se muestra un menú de 8 opciones, el programa termina al elegir la opción 8 de lo contrario sigue mostrando el menú
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class Exercise15 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para ingresar un número
     */
    public void inputOption() {
        int option = 0;
        do {
            try {
                messages.showMessage("Ingrese una opción: ");
                option = scanner.getInteger();
                switch (option) {
                    case 1, 2, 3, 4, 5, 6, 7 -> showOptions();
                    case 8 -> messages.showMessage("El programa ha terminado");
                    default -> {
                        messages.showMessage("Opción incorrecta");
                        showOptions();
                    }
                }
            } catch (InputMismatchException exception) {
                exception.getCause();
                messages.showMessage("No ingrese texto");
            }
        } while (option != 8);

    }

    public void showOptions() {
        messages.showMessage("""
                ****** GESTIÓN CINEMATOGRÁFICA ********
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6-VER PELÍCULAS DE LOS ACTORES
                7-VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES
                8-SALIR""");
    }

}
