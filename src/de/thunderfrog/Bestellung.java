package de.thunderfrog;

public final class Bestellung extends Artikel{

    protected int count;

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
        return cost * count;
    }

    @Override
    public String toString(){
        return count + "x " + description + " kosten: " + gesamtpreis();
    }

}
