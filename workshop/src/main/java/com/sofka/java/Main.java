package com.sofka.java;

import com.sofka.java.exercises.exercise_1.Exercise1;
import com.sofka.java.exercises.exercise_2.Exercise2;
import com.sofka.java.exercises.exercise_3.Exercise3;
import com.sofka.java.exercises.exercise_4.Exercise4;
import com.sofka.java.exercises.exercise_5.Exercise5;
import com.sofka.java.exercises.exercise_6.Exercise6;
import com.sofka.java.exercises.exercise_7.Exercise7;
import com.sofka.java.exercises.exercise_8.Exercise8;
import com.sofka.java.exercises.exercise_9.Exercise9;
import com.sofka.java.exercises.exercise_10.Exercise10;
import com.sofka.java.exercises.exercise_11.Exercise11;
import com.sofka.java.exercises.exercise_12.Exercise12;
import com.sofka.java.exercises.exercise_13.Exercise13;
import com.sofka.java.exercises.exercise_14.Exercise14;
import com.sofka.java.exercises.exercise_15.Exercise15;
import com.sofka.java.exercises.exercise_16.Exercise16;
import com.sofka.java.exercises.exercise_17.Exercise17;
import com.sofka.java.exercises.exercise_18.Exercise18;
import com.sofka.java.utilities.MyException;
import com.sofka.java.utilities.Messages;
import com.sofka.java.utilities.MyScanner;

public class Main {

    /**
     * Método principal donde se ejecuta el programa
     *
     * @param args String
     */
    public static void main(String[] args) {
        init();
    }

    /**
     * Instancias de las clases MyLogger, MyScanner y de todos los ejercicios
     */
    static Messages messages = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    static Exercise1 exercise1 = new Exercise1();

    static Exercise2 exercise2 = new Exercise2();

    static Exercise3 exercise3 = new Exercise3();

    static Exercise4 exercise4 = new Exercise4();

    static Exercise5 exercise5 = new Exercise5();

    static Exercise6 exercise6 = new Exercise6();

    static Exercise7 exercise7 = new Exercise7();

    static Exercise8 exercise8 = new Exercise8();

    static Exercise9 exercise9 = new Exercise9();

    static Exercise10 exercise10 = new Exercise10();

    static Exercise11 exercise11 = new Exercise11();

    static Exercise12 exercise12 = new Exercise12();

    static Exercise13 exercise13 = new Exercise13();

    static Exercise14 exercise14 = new Exercise14();

    static Exercise15 exercise15 = new Exercise15();

    static Exercise16 exercise16 = new Exercise16();

    static Exercise17 exercise17 = new Exercise17();

    static Exercise18 exercise18 = new Exercise18();

    /**
     * Método para iniciar el programa
     */
    private static void init() {
        try {
            Boolean flag = true;
            while (Boolean.TRUE.equals(flag)) {
                messages.showWelcome();
                flag = selectOption(scanner.getInteger());
            }
        } catch (MyException myException) {
            myException.getCause();
            messages.showMessage("Digita un número, no texto");
            init();
        }
    }

    /**
     * Método para ejecutar el ejercicio que haya elegido el usuario por consola
     *
     * @param option Integer
     * @return Boolean
     */
    private static Boolean selectOption(Integer option) {
        switch (option) {
            case 1 -> exercise1.compareNumbers();
            case 2 -> {
                exercise2.inputNumber();
                exercise2.compareNumbers();
            }
            case 3 -> {
                exercise3.inputRadius();
                exercise3.calculateArea();
            }
            case 4 -> {
                exercise4.inputPriceProduct();
                exercise4.calculatePrice();
            }
            case 5 -> exercise5.showEvenOddNumber();
            case 6 -> exercise6.showEvenOddNumber();
            case 7 -> exercise7.evaluateNumber();
            case 8 -> exercise8.workingDay();
            case 9 -> {
                exercise9.replaceVowelSentence();
                exercise9.inputSentence();
                exercise9.concatSentences();
            }
            case 10 -> {
                exercise10.inputSentence();
                exercise10.deleteSpacesSentence();
            }
            case 11 -> {
                exercise11.inputSentence();
                exercise11.lengthSentence();
                exercise11.countVowels();
            }
            case 12 -> {
                exercise12.inputWords();
                exercise12.comparateTwoWords();
            }
            case 13 -> exercise13.currentDateAndTime();
            case 14 -> {
                exercise14.inputNumber();
                exercise14.printInPairs();
            }
            case 15 -> {
                exercise15.showOptions();
                exercise15.inputOption();
            }
            case 16 -> {
                exercise16.captureDataPerson();
                exercise16.createFirstPerson();
                exercise16.createSecondPerson();
                exercise16.createThirdPerson();
            }
            case 17 -> {
                exercise17.addWasher();
                exercise17.addTelevision();
                exercise17.calculateFinalPriceHomeAppliance();
                exercise17.printFinalPriceHomeAppliance();
            }
            case 18 -> {
                exercise18.addSeries();
                exercise18.addVideoGames();
                exercise18.deliverSerie();
                exercise18.deliverGames();
                exercise18.deliveredGamesAndSeries();
                exercise18.highEstimatedHoursGame();
                exercise18.highEstimatedSeasonsSerie();
            }
            case 19 -> {
                messages.showMessage("El programa ha terminado");
                return false;
            }
            default -> messages.showMessage("La opción elegida es incorrecta");
        }
        return true;
    }
}
