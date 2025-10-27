package com.fahami.cda.entity;

public final class Fruit extends Vegetable {

    public Fruit(String name, String origin, String color) {
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

        /**
     * Méthode pour déterminer si deux objets ont les mêmes valeurs
     * @return True si tous les attributs du végétal ont les mêmes valeurs que l'objet de comparaison
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Fruit fruit = (Fruit) obj;

        if(!fruit.getName().equals(this.getName())) return false;
        if(!fruit.getOrigin().equals(this.getOrigin())) return false;
        if(!fruit.getColor().equals(this.getColor())) return false;

        return true;
    }
}
