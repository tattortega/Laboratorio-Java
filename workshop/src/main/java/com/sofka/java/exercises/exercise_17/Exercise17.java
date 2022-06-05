package com.sofka.java.exercises.exercise_17;

import com.sofka.java.utilities.Messages;


/**
 * Clase Exercise17
 * Se crea objetos de lavadora y televisión y se calculan sus precios.
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Exercise17 {
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();
    double washingMachines = 0.0;
    double televisions = 0.0;
    double allAppliances = 0.0;
    HomeAppliance[] homeAppliances = new HomeAppliance[10];

    public void addWasher() {
        homeAppliances[0] = new Washer(20.0, 8.2);
        homeAppliances[1] = new Washer(10.0, 9.5);
        homeAppliances[2] = new Washer(15.0, "ROJO", 'B', 10.0, 25.0);
        homeAppliances[3] = new Washer();
        homeAppliances[4] = new Washer();
    }

    public void addTelevision() {
        homeAppliances[5] = new Television(45.5, 11.0);
        homeAppliances[6] = new Television(30.0, 15.0);
        homeAppliances[7] = new Television(25.0, "AZUL", 'D', 8.6, 75.5, false);
        homeAppliances[8] = new Television(25.0, "GRIS", 'E', 9.2, 55.0, true);
        homeAppliances[9] = new Television();
    }

    public void calculateFinalPriceHomeAppliance() {
        for (HomeAppliance appliance : homeAppliances) {

            if (appliance instanceof Washer) {
                washingMachines += appliance.finalPrice();

            } else if (appliance instanceof Television) {
                televisions += appliance.finalPrice();
            }
            allAppliances = washingMachines + televisions;
        }
    }

    public void printFinalPriceHomeAppliance() {
        messages.showMessage("Precio total de lavadoras: € " + washingMachines + "\n"+
                "Precio total de televisores: € " + televisions + "\n"+
                "Precio total de electrodomésticos: € " + allAppliances);
    }

}


