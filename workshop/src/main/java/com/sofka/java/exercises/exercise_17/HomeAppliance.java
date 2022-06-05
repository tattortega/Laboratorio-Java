package com.sofka.java.exercises.exercise_17;

import java.util.HashMap;

/**
 * Clase abstracta de electrodoméstico donde se definen los atributos y métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public abstract class HomeAppliance {

    /**
     * Precio base por defecto
     */
    private Double basePrice = 100.0;
    /**
     * Color por defecto
     */
    private String color = "BLANCO";
    /**
     * Consumo energético por defecto
     */
    private char energyConsumption = 'F';
    /**
     * Peso por defecto
     */
    private Double weight = 5.0;

    /**
     * Constructor por defecto
     */
    protected HomeAppliance() {
    }

    /**
     * Constructor con ciertos atributos como parámetro
     * @param basePrice Precio base
     * @param weight Peso
     */
    protected HomeAppliance(Double basePrice, Double weight) {
        this.basePrice = basePrice;
        this.weight = weight;
    }

    /**
     * Constructor con todos los atributos
     * @param basePrice Precio base
     * @param color Color
     * @param energyConsumption Consumo de energía
     * @param weight   Peso
     */
    protected HomeAppliance(Double basePrice, String color, char energyConsumption, Double weight) {
        this.basePrice = basePrice;
        this.color = color;
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }

    /**
     * Método de acceso a Precio base
     * @return  Double
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * Método de acceso a Color
     * @return Color
     */
    public String getColor() {
        return color;
    }

    /**
     * Método de acceso a consumo de energía
     * @return EnergyConsumption
     */
    public char getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * Método de acceso a peso
     * @return Double
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Método para comprobar el consumo energético del electrodoméstico
     * @param letter char
     */
    protected void checkEnergyConsumption(char letter) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : letters) {
            if (c != letter) {
                this.energyConsumption = 'F';
                break;
            }
        }
    }

    /**
     * Método para comprobar el color del electrodoméstico
     * @param color String
     */
    protected void checkColor(String color) {
        color = color.toUpperCase();
        if(color.equals("BLANCO") ||  color.equals("NEGRO") || color.equals("ROJO")
                ||  color.equals("AZUL") ||  color.equals("GRIS")){
            this.color = color;
        }else {
            this.color = getColor();
        }
    }

    /**
     * Método para calcular el precio final del electrodoméstico
     */
    protected double finalPrice() {
        double finalPrice = this.basePrice;
        HashMap<Character, Integer> pricesByEnergyConsumption = new HashMap<>();
        pricesByEnergyConsumption.put('A', 100);
        pricesByEnergyConsumption.put('B', 80);
        pricesByEnergyConsumption.put('C', 60);
        pricesByEnergyConsumption.put('D', 50);
        pricesByEnergyConsumption.put('E', 30);
        pricesByEnergyConsumption.put('F', 10);
        finalPrice += Integer.parseInt(pricesByEnergyConsumption.get(this.energyConsumption).toString());

        if(this.weight >= 0 && this.weight <= 19){
            finalPrice += 10;
        } else if (this.weight >= 20 && this.weight <= 49) {
            finalPrice += 50;
        }else if (this.weight >= 50 && this.weight <= 79) {
            finalPrice += 80;
        }else {
            finalPrice += 100;
        }
        return finalPrice;
    }
}
