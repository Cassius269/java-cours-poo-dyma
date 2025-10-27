package com.fahami.cda;

import com.fahami.cda.entity.Fruit;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // Création d'une instance de fruit à l'aide du constructeur plein
        Fruit fraise = new Fruit("fraise", "France", "rouge");
   
        // Création d'une instance d'orange avec le constructeur vide
        Fruit orange = new Fruit();
        orange.setName("orange");
        orange.setOrigin("Suisse");
        orange.setColor("orange");

        
        IO.println(fraise.present());
        IO.println(orange.present());
        IO.println(fraise.isFruit() ? fraise.getName() + " est un fruit" : fraise.getName() + " est un légume");

        // Comparaison des fruits et légumes
        IO.println(fraise.equals(orange) ? "les deux objets sont équivalents" : "Les deux objets ne sont pas identitiques");

    }
}