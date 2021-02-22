package de.thunderfrog;

public class Bestelltest {
    public static void main(String[] args) {

        // BESTELLUNG
        Bestellung bestellung = new Bestellung("Hanuta",0.99,2);
        System.out.println(bestellung.toString());

        bestellung.setCount(-5);
        System.out.println(bestellung.toString());

        bestellung.setCost(7.99);
        System.out.println("Neuer Preis von " + bestellung.getDescription() + " ist " + bestellung.getCost());
        bestellung.setCount(5);
        System.out.println(bestellung.toString());

        // ARTIKEL
        Artikel artikel = new Artikel("Duplo",0.49);
        System.out.println(artikel.toString());
        artikel.setCost(0.19);
        System.out.println("Neuer Preis von " + artikel.getDescription() + " ist " + artikel.getCost());
        System.out.println(artikel.toString());

        // ARTIKEL BESTELLUNG
        Bestellung duplo = new Bestellung(artikel.getDescription(), artikel.getCost(),4);
        System.out.println(duplo.toString());

    }
}
