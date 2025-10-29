package com.fahami.cda.entity;

import com.fahami.cda.entity.dto.iVegetable;
import com.fahami.cda.entity.enumeration.Origin;

public final class Fruit extends Vegetable  implements iVegetable {

    public Fruit(String name, Origin origin, String color) {
        super(name, origin, color);
    }

    public Fruit(){

    }

    /**
     * Méthode pour présenter le fruit
     * @return Une châine de caractères de présentation
     */
    @Override // surcharcher la classe abstraite
    public String present(){
        String present = "";
        if(isFrench()){
           present = this.getName() + " est un fruit d'origine française";
        }else {
           present = this.getName() + " est un fruit ne provenant pas de la France";
        }

        return present;
    }

    
}
