package com.sofka.java.exercises.exercise_16;

import java.util.Random;

/**
 * Clase persona
 * Se definen atributos y métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Person {
    private String name;
    private Integer age;
    private String dni;
    private char genre;
    private Integer weight;
    private Double height;
    Random random = new Random();

    /**
     * Constructor por defecto
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.generateDNI();
        this.genre = 'H';
        this.weight = 0;
        this.height = 0.0;
    }

    /**
     * Constructor con algunos atributos como parámetro
     *
     * @param name  Nombre
     * @param age   Edad
     * @param genre Género
     */
    public Person(String name, Integer age, char genre) {
        this.name = name;
        this.age = age;
        this.genre = checkGenre(genre);
        this.weight = 75;
        this.height = 1.63;
        this.generateDNI();
    }

    /**
     * Constructor con todos los atributos como parámetro
     *
     * @param name   Nombre
     * @param age    Edad
     * @param genre  Género
     * @param weight Peso
     * @param height Altura
     */
    public Person(String name, Integer age, char genre, Integer weight, Double height) {
        this.name = name;
        this.age = age;
        this.generateDNI();
        this.genre = checkGenre(genre);
        this.weight = weight;
        this.height = height;
    }

    /**
     * Método para calcular el IMC según el peso y la altura
     *
     * @return Integer
     */
    public Integer calculateIMC() {
        int resultWeight = 1;
        try {
            double imc = this.weight / (Math.pow(this.height, 2));
            if (imc < 20) {
                resultWeight = -1;
            } else if (imc >= 20 && imc <= 25) {
                resultWeight = 0;
            }
        } catch (NullPointerException exception) {
            exception.getCause();
            exception.getMessage();
        }
        return resultWeight;
    }

    /**
     * Método para evaluar si es mayor de edad o no
     *
     * @return boolean
     */
    public boolean isLegalAge() {
        return age >= 18;
    }

    /**
     * Método para evaluar el género ingresado por consola
     *
     * @param genre char
     * @return char
     */
    public char checkGenre(char genre) {
        if (genre == 'M' || genre == 'm') {
            return this.setGenre(genre);
        } else {
            return this.setGenre('H');
        }
    }

    /**
     * Sobrescritura del método toString para devolver la información del objeto
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Persona{" +
                "Nombre= " + name +
                ", Edad= " + age + " años" +
                ", DNI= " + dni +
                ", Género= " + genre +
                ", Peso= " + weight + " kgs" +
                ", Altura= " + height + " metros" +
                '}';
    }

    /**
     * Método para generar un número aleatorio de 8 cifras más una letra
     */
    private void generateDNI() {
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int number = random.nextInt(100000000);
        int remainder = number % 23;
        this.dni = Integer.toString(number) + letters[remainder];
    }

    /**
     * Método modificador de name
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método modificador de age
     *
     * @param age Integer
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Método modificador de genre
     *
     * @param genre char
     * @return genre
     */
    public char setGenre(char genre) {
        this.genre = genre;
        return genre;
    }

    /**
     * Método modificador de weight
     *
     * @param weight Integer
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Método modificador de height
     *
     * @param height Double
     */
    public void setHeight(Double height) {
        this.height = height;
    }
}
