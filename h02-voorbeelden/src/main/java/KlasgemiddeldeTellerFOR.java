void main() {

    //declaratie lokale variabelen
    int totaal, punt, klasGemiddelde;

    //initialisatie variabelen
    totaal = 0;

    //blijf herhalen tot...
    for (int puntenTeller = 1; puntenTeller <= 10; puntenTeller++)
    {
        punt = Integer.parseInt(IO.readln("Geef score " + puntenTeller + " (/20):"));
        totaal += punt;
    }

    klasGemiddelde = totaal / 10;

    // uitvoer
    IO.println(String.format("Het totaal is %d", totaal));
    IO.println(String.format("Het klasgemiddelde is %d%n", klasGemiddelde));
}