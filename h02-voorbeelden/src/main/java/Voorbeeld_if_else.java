void main() {
    int punten = 30, aantalGeslaagden = 0, aantalNietGeslaagden = 0;

    if (punten >= 60) IO.println("Geslaagd");

    // OF het statement op de volgende lijn
    if (punten >= 60)
        IO.println("Geslaagd");

    // OF met accolades (niet verplicht als er maar 1 statement is)
    if (punten >= 60) { IO.println("Geslaagd");	}

    // OF met accolades over verschillende regels gespreid
    if (punten >= 60)
    {
        IO.println("Geslaagd");
    }

    if (punten == 20)
    {
        IO.println("Je behaalt een credit!");
        aantalGeslaagden = aantalGeslaagden + 1;
    }

    if (punten >= 60)
        IO.println("Geslaagd");
    else
        IO.println("Niet geslaagd");

    // OF met accolades (niet verplicht als er maar 1 statement is)
    if (punten >= 60)
    {
        IO.println("Geslaagd");
    }
    else
    {
        IO.println("Niet geslaagd");
    }

    if (punten == 20)
    {
        IO.println("Je behaalt een credit!");
        aantalGeslaagden = aantalGeslaagden + 1;
    }
    else
    {
        IO.println("Je behaalt geen credit!");
        aantalNietGeslaagden = aantalNietGeslaagden + 1;
    }

    int code = 0;
    if (code == 1)
        IO.println("Je kiest om op te tellen!");
    else // code <> 1
        if (code == 2)
            IO.println("Je kiest om af te trekken!");
        else // code <> 1 en code <> 2
            if (code == 3)
                IO.println("Je kiest om te delen!");
            else // code <> 1 en code <> 2 en code <> 3
                IO.println("Je kiest om te vermenigvuldigen!");

    int grade = 70;
    if (grade >= 60)
        IO.println("Passed");
    else
    {
        IO.println("Failed");
        IO.println("You must take the course again.");
    }

    int getal1 = 5, getal2 = 5;
    if (getal1 > 10)
        if (getal2 > 20)
            IO.println("getal1 > 10 en getal2 > 20");
        else
            IO.println(" ??? ");

    if (getal1 > 10)
    {
        if (getal2 > 20)
            IO.println("getal1 > 10 en getal2 > 20");
    }
    else
        IO.println("???");
    
}//einde main