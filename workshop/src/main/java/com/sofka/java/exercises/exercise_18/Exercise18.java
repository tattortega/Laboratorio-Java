package com.sofka.java.exercises.exercise_18;

import com.sofka.java.utilities.Messages;


/**
 * Clase Exercise18
 * Se crea objetos de Serie y Videojuego, se invocan sus métodos
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Exercise18 {

    private final Serie[] seriesList;
    private final VideoGame[] videoGameList;
    /**
     * Instancia de la clase Messages
     */
    static Messages messages = Messages.getInstance();

    /**
     * Constructor por defecto
     */
    public Exercise18() {
        this.seriesList = new Serie[5];
        this.videoGameList = new VideoGame[5];
    }

    /**
     * Método para agregar videojuegos
     */
    public void addVideoGames() {
        videoGameList[0] = new VideoGame("E-football", 500);
        videoGameList[1] = new VideoGame("The Last of Us", 2000, "Terror y aventura", "Naughty Dog");
        videoGameList[2] = new VideoGame("Fall Guys: Ultimate Knockout", 100, "Plataforma", "Epic Games");
        videoGameList[3] = new VideoGame("Minecraft", 2000);
        videoGameList[4] = new VideoGame();
    }

    /**
     * Método para agregar series
     */
    public void addSeries() {
        seriesList[0] = new Serie("The Walking Dead", 11, "Terror", "Robert Kirkman");
        seriesList[1] = new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre");
        seriesList[2] = new Serie();
        seriesList[3] = new Serie("Young Sheldon", "Chuck Lorre");
        seriesList[4] = new Serie("Moon Knight", 1, "Acción", "Doug Munch, Don Perlin");
    }

    /**
     * Método para entregar series
     */
    public void deliverSerie() {
        seriesList[4].deliver();
        seriesList[0].deliver();
    }

    /**
     * Método para entregar videojuegos
     */
    public void deliverGames() {
        videoGameList[1].deliver();
        videoGameList[3].deliver();
    }

    /**
     * Método para contar las series y videojuegos entregados
     */
    public void deliveredGamesAndSeries() {
        int gamesDelivered = 0;
        int seriesDelivered = 0;
        for (Serie serie : seriesList) {
            if (Boolean.TRUE.equals(serie.isDelivered())) {
                seriesDelivered++;
                serie.sendBack();
            }
        }
        for (VideoGame game : videoGameList) {
            if (Boolean.TRUE.equals(game.isDelivered())) {
                gamesDelivered++;
                game.sendBack();
            }
        }
        messages.showMessage("Series entregadas: " + seriesDelivered);
        messages.showMessage("Videojuegos entregados: " + gamesDelivered);
    }

    /**
     * Método para mostrar el videojuego con mas horas estimadas
     */
    public void highEstimatedHoursGame() {
        VideoGame highGame = videoGameList[0];
        for (int i = 1; i < videoGameList.length; i++) {
            if (videoGameList[i].compareTo(highGame).equals(1)) {
                highGame = videoGameList[i];
            }
        }
        String printHighGame = highGame.toString();
        messages.showMessage(printHighGame);
    }

    /**
     * Método para mostrar la serie con más temporadas
     */
    public void highEstimatedSeasonsSerie() {
        Serie highSerie = seriesList[0];
        for (int i = 1; i < seriesList.length; i++) {
            if (seriesList[i].compareTo(highSerie).equals(1)) {
                highSerie = seriesList[i];
            }
        }
        String printHighSerie = highSerie.toString();
        messages.showMessage(printHighSerie);
    }

}
