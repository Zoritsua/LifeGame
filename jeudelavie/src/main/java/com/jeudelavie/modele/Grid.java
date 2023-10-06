package com.jeudelavie.modele;

public class Grid {
    private int taille;
    private boolean[][] grille;

    // Constructeur, méthodes d'initialisation et de mise à jour de la grille
    
    public Grid(int taille) {
        this.taille = taille;
        grille = new boolean[taille][taille];
    }

    public void setCellule(int x, int y, boolean estVivante) {
        grille[x][y] = estVivante;
    }

    public boolean getCellule(int x, int y) {
        return grille[x][y];
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;

        grille = new boolean[taille][taille];
    }

    public void setGrille(boolean[][] grille) {
        this.grille = grille;
    }

    public boolean[][] getGrille() {
        return grille;
    }

}
