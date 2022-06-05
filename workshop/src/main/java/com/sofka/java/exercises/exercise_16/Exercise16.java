package com.sofka.java.exercises.exercise_16;

import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

import java.util.InputMismatchException;


/**
 * Clase Exercise16
 * Se calcula el IMC indicando el peso de la persona
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Exercise16 {
    /**
     * Instancias de las clases Messages y MyScanner
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Atributos capturados por consola
     */
    private String name;
    private Integer age;
    private char genre;
    private Integer weight;
    private Double height;

    /**
     * Método para capturar los datos de la persona por consola
     */
    public void captureDataPerson() {
            try {
                messages.showMessage("Ingrese su nombre: ");
                name = scanner.getString();
                messages.showMessage("Ingrese su edad: ");
                age = scanner.getInteger();
                messages.showMessage("Ingrese su sexo (H-M): ");
                genre = scanner.getString().charAt(0);
                messages.showMessage("Ingrese su peso (Ej. 60): ");
                weight = scanner.getInteger();
                messages.showMessage("Ingrese su altura (Ej. 1.65): ");
                height = Double.parseDouble(scanner.getString());
            } catch (InputMismatchException e) {
                e.getCause();
                messages.showMessage("Ingrese el dato correcto");
            } catch (NumberFormatException e) {
                e.getCause();
                messages.showMessage("Ingrese caracteres numéricos, no texto");
            }

    }

    /**
     * Método para crear la primera.
     * Se invocan los métodos para calcular el peso, mayoría de edad e impresión de los datos capturados
     */
    public void createFirstPerson() {
        Person firstPerson = new Person(name, age, genre, weight, height);
        calculateWeight(firstPerson);
        isLegalAge(firstPerson);
        printDataPerson(firstPerson);
    }

    /**
     * Método para crear la segunda persona.
     * Se invocan los métodos para calcular el peso, mayoría de edad e impresión de los datos capturados
     */
    public void createSecondPerson() {
        Person secondPerson = new Person(name, age, genre);
        calculateWeight(secondPerson);
        isLegalAge(secondPerson);
        printDataPerson(secondPerson);
    }

    /**
     * Método para crear la tercera persona e invocar sus métodos set.
     * Se invocan los métodos para calcular el peso, mayoría de edad e impresión de los datos capturados
     */
    public void createThirdPerson() {
        Person thirdPerson = new Person();
        thirdPerson.setName("Daniela Barrios");
        thirdPerson.setAge(16);
        thirdPerson.setGenre('M');
        thirdPerson.setWeight(65);
        thirdPerson.setHeight(1.70);
        calculateWeight(thirdPerson);
        isLegalAge(thirdPerson);
        printDataPerson(thirdPerson);
    }

    /**
     * Método para evaluar su peso según su IMC
     *
     * @param person Clase Person
     */
    public void calculateWeight(Person person) {
        try {
            Integer calculateWeight = person.calculateIMC();
            switch (calculateWeight) {
                case -1 -> messages.showMessage("Estás por debajo de su peso ideal");
                case 0 -> messages.showMessage("Estás en el peso ideal");
                case 1 -> messages.showMessage("Estás con sobrepeso");
                default -> messages.showMessage("Estas pronto a morir");
            }
        } catch (NullPointerException exception) {
            exception.getCause();
            messages.showMessage("No hay datos para calcular el IMC");
        }
    }

    /**
     * Método para evaluar e imprimir por pantalla si es mayor de edad o no
     *
     * @param person Clase Person
     */
    public void isLegalAge(Person person) {
        try {
            if (person.isLegalAge()) {
                messages.showMessage("Eres mayor de edad");
            } else {
                messages.showMessage("Eres menor de edad");
            }
        } catch (NullPointerException exception) {
            exception.getCause();
            messages.showMessage("La edad es incorrecta");
        }
    }

    /**
     * Método para imprimir los datos de la persona
     *
     * @param person Clase Person
     */
    public void printDataPerson(Person person) {
        try {
            String dataPerson = person.toString();
            messages.showMessage(dataPerson);
        } catch (NullPointerException exception) {
            exception.getCause();
            messages.showMessage("No hay datos para imprimir");
        }
    }


}
