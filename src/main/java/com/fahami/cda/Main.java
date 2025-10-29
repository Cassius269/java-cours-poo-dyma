package com.fahami.cda;

import com.fahami.cda.entity.Fruit;
import com.fahami.cda.entity.dto.FruitDto;
import com.fahami.cda.entity.enumeration.Origin;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello world!");

        // Création d'une instance de fruit à l'aide du constructeur plein
        Fruit fraise = new Fruit("orange", Origin.Maurice, "orange");

        // Création d'une instance d'orange avec le constructeur vide
        Fruit orange = new Fruit();
        orange.setName("orange");
        orange.setOrigin(Origin.Senegal);
        orange.setColor("orange");

        
        IO.println(fraise.present());
        IO.println(orange.present());
        IO.println(fraise.isFruit() ? fraise.getName() + " est un fruit" : fraise.getName() + " est un légume");

        // Comparaison des fruits et légumes
        IO.println(fraise.equals(orange) ? "les deux objets sont équivalents" : "Les deux objets ne sont pas identitiques");
        
        // Afficher les objets
        IO.println(fraise);
        IO.println(orange);


        // Utilisation de DTO de type record
        FruitDto orangeDto = new FruitDto("orange","Sénégal", "France");
        IO.println(orangeDto.toString());
        IO.println(orangeDto.name());


        // Utilisation des énumérations
        Origin countryOrigin = Origin.France;
        IO.println(countryOrigin);

        // Création d'objet fruit avec énumération
        Fruit banana = new Fruit();
        banana.setColor("jaune");
        banana.setName("banane");
        banana.setOrigin(Origin.France);

    }
}