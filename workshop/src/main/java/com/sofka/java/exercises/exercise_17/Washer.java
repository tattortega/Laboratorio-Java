package com.sofka.java.exercises.exercise_17;

/**
 * Clase lavadora que hereda de Electrodoméstico
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Washer extends HomeAppliance{

    /**
     * Carga por defecto
     */
    private Double charge = 5.0;

    /**
     * Constructor por defecto
     */
    public Washer() {
    }

    /**
     * Constructor con el precio y peso, el resto por defecto
     * @param basePrice Double
     * @param weight Double
     */
    public Washer(Double basePrice, Double weight) {
        super(basePrice, weight);
        this.charge = getCharge();
    }

    /**
     * Constructor con todos los parámetros
     * @param basePrice Double
     * @param color String
     * @param energyConsumption char
     * @param weight Double
     * @param charge Double
     */
    public Washer(Double basePrice, String color, char energyConsumption, Double weight, Double charge) {
        super(basePrice, color, energyConsumption, weight);
        this.charge = charge;
    }

    /**
     * Método de acceso de carga
     * @return Double
     */
    public Double getCharge() {
        return charge;
    }

    /**
     * Sobrescritura del método precio final de acuerdo a la carga de la lavadora
     * @return Double
     */
    @Override
    protected double finalPrice() {
        double finalPrice = super.finalPrice();
        if (charge > 30){
            finalPrice += 50;
        }
        return finalPrice;
    }
}
