package com.sofka.java.exercises.exercise_17;

/**
 * Clase television que hereda de Electrodoméstico
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Television extends HomeAppliance{

    /**
     * Resolución por defecto
     */
    private Double resolution = 20.0;

    /**
     * Sintonizador TDT por defecto
     */
    private Boolean tunerTDT = false;

    /**
     * Constructor por defecto
     */
    public Television() {
    }

    /**
     * Constructor con el precio y peso, el resto por defecto
     * @param basePrice Double
     * @param weight Double

     */
    public Television(Double basePrice, Double weight) {
        super(basePrice, weight);
        this.resolution = getResolution();
        this.tunerTDT = getTunerTDT();
    }

    /**
     * Constructor con todos los parámetros
     * @param basePrice Double
     * @param color String
     * @param energyConsumption char
     * @param weight Double
     * @param resolution Double
     * @param tunerTDT Boolean
     */
    public Television(Double basePrice, String color, char energyConsumption, Double weight, Double resolution, Boolean tunerTDT) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    /**
     * Sobrescritura del método precio final según la resolución y sintonizador
     * @return Double
     */
    @Override
    protected double finalPrice() {
        double finalPrice = super.finalPrice();
        if (resolution > 40) {
            finalPrice += finalPrice * 1.30;
        }
        if (Boolean.TRUE.equals(tunerTDT)) {
            finalPrice += 50;
        }
        return finalPrice;
    }

    /**
     * Método de acceso a resolución
     * @return Double
     */
    public Double getResolution() {
        return resolution;
    }

    /**
     * Método de acceso a sintonizador TDT
     * @return Boolean
     */
    public Boolean getTunerTDT() {
        return tunerTDT;
    }
}
