package com.sofka.java.exercises.exercise_18;

/**
 * Clase Serie con sus atributos y métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Serie implements IDeliverable {

    /**
     * Atributos de serie
     */
    private String  title;
    private Integer numberOfSeasons = 3;
    private Boolean delivered = false;
    private String genre;
    private String creator;

    /**
     * Constructor por defecto
     */
    public Serie() {
    }

    /**
     * Constructor con título y creador como parámetro
     * @param title String
     * @param creator String
     */
    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    /**
     * Constructor con todos los atributos como parámetro excepto entregado
     * @param title String
     * @param numberOfSeasons Integer
     * @param genre String
     * @param creator String
     */
    public Serie(String title, Integer numberOfSeasons, String genre, String creator) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.genre = genre;
        this.creator = creator;
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
     * Método de acceso de número de temporadas
     * @return Integer
     */
    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    /**
     * Método de acceso de número de temporadas
     */
    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    /**
     * Método de acceso de género
     * @return String
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método modificador de género
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método de acceso de creador
     * @return String
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Método modificador de creador
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Sobrescritura de método toString
     * @return String
     */
    @Override
    public String toString() {
        return "Serie{" +
                "Titulo= " + title +
                ", Número de temporadas= " + numberOfSeasons +
                ", Entregado= " + delivered +
                ", Género= " + genre +
                ", Creador= " + creator +
                '}';
    }

    /**
     * Método entregar
     */
    @Override
    public void deliver() {
        this.delivered = true;
    }

    /**
     * Método devolver
     */
    @Override
    public void sendBack() {
        this.delivered = false;
    }

    /**
     * Método es entregado
     */
    @Override
    public Boolean isDelivered() {
        return this.delivered;
    }

    @Override
    public Integer compareTo(Object a) {
        Serie serie = (Serie) a;

        if (numberOfSeasons > serie.numberOfSeasons) {
            return 1;

        } else if (numberOfSeasons.equals(serie.numberOfSeasons)) {
            return 0;
        }
        return -1;
    }
}
