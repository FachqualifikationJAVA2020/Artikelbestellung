package de.thunderfrog;

public final class Bestellung extends Artikel{

    private int count = 1;

    public Bestellung(String description, double cost, int count) {
        super(description, cost);
        this.count = count < 0 ? 0 : count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count < 0 ? 0 : count;
    }

    public double gesamtpreis(){
        return getCost() * count;
    }

    @Override
    public String toString(){
        return count + "x " + getDescription() + " kosten: " + gesamtpreis();
    }

}
