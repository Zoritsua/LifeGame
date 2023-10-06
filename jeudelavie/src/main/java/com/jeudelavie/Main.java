package com.jeudelavie;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.jeudelavie.modele.Cellule;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        int rows = 10; // Nombre de lignes
        int cols = 10; // Nombre de colonnes
    
        GridPane gridPane = new GridPane();
    
        // Créez une grille avec des cellules initialement mortes
        Cellule[][] matrice = new Cellule[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cellule cellule = new Cellule();
                matrice[row][col] = cellule;
                gridPane.add(cellule, col, row);
            }
        }
    
        // Modifiez l'état de quelques cellules (par exemple, cellules vivantes)
        matrice[2][3].setVivante(true);
        matrice[5][7].setVivante(true);
    
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Jeu de la vie");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}