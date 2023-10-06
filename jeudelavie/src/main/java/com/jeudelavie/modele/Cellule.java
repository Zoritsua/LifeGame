package com.jeudelavie.modele;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cellule extends StackPane {

    private boolean estVivante;

    public Cellule() {
        Rectangle rectangle = new Rectangle(40, 40); // Taille de la cellule
        rectangle.setFill(Color.WHITE); // Couleur de fond par défaut
        rectangle.setStroke(Color.BLACK); // Couleur de la bordure

        getChildren().add(rectangle);

        // Initialisez l'état de la cellule (vivante ou morte)
        estVivante = false;
    }

    // Méthodes pour définir et obtenir l'état de la cellule
    public void setVivante(boolean vivante) {
        estVivante = vivante;
        // Mettez à jour l'apparence de la cellule en fonction de l'état
        Rectangle rectangle = (Rectangle) getChildren().get(0);
        rectangle.setFill(estVivante ? Color.BLACK : Color.WHITE);
    }

    public boolean estVivante() {
        return estVivante;
    }
}