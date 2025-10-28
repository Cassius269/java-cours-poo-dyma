package com.fahami.cda.entity;
import java.util.Objects;

public abstract class Vegetable {
    // Les propriétés
    private String name; 
    private String origin; // pays d'origine
    private String color;

    // Les constructeurs
    public Vegetable(){}

    public Vegetable(String name, String origin, String color) {
        this.name = name;
        this.origin = origin;
        this.color = color;
    }

    
    // Les getters et setters
    public String getName(){
        return this.name;
    }

    public Vegetable setName(String name){
        this.name = name;
        return this;
    }

    public String getOrigin(){
        return this.origin;
    }

    public Vegetable setOrigin(String origin){
        this.origin = origin;
        return this;
    }

    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Les méthodes personnalisées
    /**
     * Méthode pour savoir si le végétal est d'origine françaisse
     * @return True si le végétal est cultivé en France ou False si non
     */
    public boolean isFrench(){
        boolean result = true;

        if(!origin.equals("France")){
            result = !result;
        }
        return result;
    }

    /**
     * Méthode pour savoir si le végétal est un fruit
     * @return True si le végétal est un fruit, False si c'est un légume
     */
    public boolean isFruit(){
        // Si l'objet créé est un fruit alors c'est vrai
        // Siinon c'est faux 
        boolean result = false;

        if(this instanceof Fruit){
            result = !result;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(name, vegetable.name) && Objects.equals(origin, vegetable.origin) && Objects.equals(color, vegetable.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(origin);
        result = 31 * result + Objects.hashCode(color);
        return result;
    }

    // Afficher les objets

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
