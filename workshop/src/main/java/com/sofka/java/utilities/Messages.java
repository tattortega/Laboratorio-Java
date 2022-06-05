package com.sofka.java.utilities;

import org.jboss.logging.Logger;


/**
 * Clase donde se inicializa la clase Logger y se muestran los mensajes del programa principal
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/26
 * @since 1.0.0
 */
public class Messages {

    private static final Logger logger = Logger.getLogger(Messages.class);

    /**
     * Método para la instancia de la clase
     *
     * @return Messages
     */
    public static Messages getInstance() {
        return new Messages();
    }

    /**
     * Método de bienvenida del programa
     */
    public void showWelcome() {
        logger.info("""
                A continuación encontrara una lista de 18 ejercicios.
                Digite la opción del ejercicio que desea ejecutar
                1. Ejercicio 1
                2. Ejercicio 2
                3. Ejercicio 3
                4. Ejercicio 4
                5. Ejercicio 5
                6. Ejercicio 6
                7. Ejercicio 7
                8. Ejercicio 8
                9. Ejercicio 9
                10. Ejercicio 10
                11. Ejercicio 11
                12. Ejercicio 12
                13. Ejercicio 13
                14. Ejercicio 14
                15. Ejercicio 15
                16. Ejercicio 16
                17. Ejercicio 17
                18. Ejercicio 18
                19. Salir del programa""");
    }

    /**
     * Método para mostrar cualquier mensaje por consola
     */
    public void showMessage(String message) {
        logger.info(message);
    }

}
