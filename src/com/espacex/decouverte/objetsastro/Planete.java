package com.espacex.decouverte.objetsastro;


import java.util.Objects;


public abstract class Planete implements Comparable{
    public String nom;
    public int diametre;
    
    public Atmosphere atmosphere;
    
    public float distanceEtoile;
    
    static String forme="Sphérique";
    static int nbPlanetesDecouvertes;
    
    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }
    
    public final int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }
    
    public final int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    public int compareTo(Object autreObjet) {
        if (this.equals(autreObjet)) return 0;
        Planete autrePlanete=(Planete)autreObjet; 
        return ((Float)distanceEtoile).compareTo((Float)autrePlanete.distanceEtoile);
    }

    
    static String expansion (double milliardsDAnneesLumiere){
        if (milliardsDAnneesLumiere < 14){
            return "Oh la la mais c'est super rapide !";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }
}
