package com.sofka.java.exercises.exercise_18;

/**
 * Clase Videojuego con sus atributos y métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class VideoGame implements IDeliverable{

    /**
     * Atributos de videojuego
     */
    private String title;
    private Integer estimatedHours = 10;
    private Boolean delivered = false;
    private String gender;
    private String company;

    /**
     * Constructor por defecto
     */
    public VideoGame() {
    }

    /**
     * Constructor con titulo y horas estimadas como parámetros
     * @param title String
     * @param estimatedHours Integer
     */
    public VideoGame(String title, Integer estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

    /**
     * Constructor con todos los atributos como parámetros excepto entregado
     * @param title String
     * @param estimatedHours Integer
     * @param gender String
     * @param company String
     */
    public VideoGame(String title, Integer estimatedHours, String gender, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.gender = gender;
        this.company = company;
    }

    /**
     * Método de acceso de titulo
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método modificador de titulo
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método de acceso de horas estimadas
     * @return Integer
     */
    public Integer getEstimatedHours() {
        return estimatedHours;
    }

    /**
     * Método modificador de horas estimadas
     */
    public void setEstimatedHours(Integer estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    /**
     * Método de acceso de género
     * @return String
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método modificador de género
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método de acceso de compañía
     * @return String
     */
    public String getCompany() {
        return company;
    }

    /**
     * Método modificador de compañía
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Sobrescritura de método toString
     * @return String
     */
    @Override
    public String toString() {
        return "Video juego{" +
                "Titulo= " + title +
                ", Horas estimadas= " + estimatedHours +
                ", Entregado= " + delivered +
                ", Género= " + gender +
                ", Compañía=  " + company +
                '}';
    }

    @Override
    public void deliver() {
        this.delivered = true;
    }

    @Override
    public void sendBack() {
        this.delivered = false;
    }

    @Override
    public Boolean isDelivered() {
        return this.delivered;
    }

    @Override
    public Integer compareTo(Object a) {
        VideoGame videoGame = (VideoGame) a;

        if (estimatedHours > videoGame.getEstimatedHours()) {
            return 1;

        } else if (estimatedHours.equals(videoGame.getEstimatedHours())) {
            return 0;
        }
        return -1;
    }
}
