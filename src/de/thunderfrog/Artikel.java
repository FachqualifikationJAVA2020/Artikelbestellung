package de.thunderfrog;

public class Artikel {
    private double cost = 0.00;
    private final String description;

    public Artikel(String description, double cost){
        this.cost = cost;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "Der Artikel " + getDescription() + " hat den Preis: " + getCost();
    }

}
