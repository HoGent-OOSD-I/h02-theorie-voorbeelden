void main()
{
    // declaratie lokale variabelen
    int totaal, puntenTeller, punt;
    double gemiddelde;

    // initialisatie variabelen
    totaal = 0;
    puntenTeller = 0;

    // verwerkingsfase
    punt = geefScore(); // <1>

    while (punt != -1) // <2>
    {
        totaal += punt;
        puntenTeller++;
        punt = geefScore(); // <3>
    }

    if (puntenTeller != 0) // <4>
    {
        gemiddelde = (double) totaal / puntenTeller;  // <5>
        IO.println(String.format("Het klasgemiddelde is %.2f", gemiddelde)); // <6>
    }
    else
        IO.println("Er werden geen punten ingegeven.");
}//einde main

int geefScore() // <7>
{
    Scanner input = new Scanner(System.in);
    return Integer.parseInt(IO.readln("Geef score (/20) of -1 om te stoppen: "));
}//einde geefScore
