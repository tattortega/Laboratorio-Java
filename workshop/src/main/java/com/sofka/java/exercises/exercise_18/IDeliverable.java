package com.sofka.java.exercises.exercise_18;

/**
 * Interface Entregable con métodos a implementar
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public interface IDeliverable {

    /**
     * Método que cambia el atributo prestado a true.
     */
    void deliver();

    /**
     * Método que cambia el atributo prestado false.
     */
    void sendBack();

    /**
     * Método que devuelve el estado del atributo prestado.
     * @return Boolean
     */
    Boolean isDelivered();

    /**
     * Método que compara las horas estimadas en los videojuegos y en las series el número de temporadas.
     * @param a Object
     */
    Integer compareTo(Object a);
}
