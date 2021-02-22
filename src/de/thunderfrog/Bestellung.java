package de.thunderfrog;

public final class Bestellung {

    private Artikel bestellartikel;
    private int count = 1;

    public Bestellung(Artikel bestellartikel, int count) {
       this.bestellartikel = bestellartikel;
       setCount(count);
    }

    public Bestellung(Artikel bestellartikel) {
        this.bestellartikel = bestellartikel;
    }

    public int getCount() {
        return count;
    }

    public Artikel getBestellartikel() {
        return bestellartikel;
    }

    public void setBestellartikel(Artikel bestellartikel) {
        this.bestellartikel = bestellartikel;
    }

    public void setCount(int count) {
        this.count = count < 0 ? 0 : count;
    }

    public double gesamtpreis(){
        return bestellartikel.getCost() * count;
    }

    @Override
    public String toString(){
        return count + "x " + bestellartikel.getDescription() + " kosten: " + gesamtpreis();
    }

}
