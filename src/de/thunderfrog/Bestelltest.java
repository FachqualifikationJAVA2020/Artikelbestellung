package de.thunderfrog;

public class Bestelltest {
    public static void main(String[] args) {

        // ARTIKEL
        Artikel artikel = new Artikel("Duplo",0.49);
        System.out.println(artikel);
        artikel.setCost(0.19);
        System.out.println("Neuer Preis von " + artikel.getDescription() + " ist " + artikel.getCost());
        System.out.println(artikel);

        // ARTIKEL BESTELLUNG
        Bestellung duplo = new Bestellung(artikel,4);
        System.out.println(duplo);

        // Description kann nicht verändert werden
        // artikel.description = "Neues Hanutu";



    }
}
