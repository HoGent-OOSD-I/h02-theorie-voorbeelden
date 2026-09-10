void main() {
    int punten = 30, aantalGeslaagden = 0, aantalNietGeslaagden = 0;

    // tag::voorbeeld1_if[]
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
    // end::voorbeeld1_if[]

    // tag::voorbeeld2_if[]
    if (punten == 20)
    {
        IO.println("Je behaalt een credit!");
        aantalGeslaagden = aantalGeslaagden + 1;
    }
    // end::voorbeeld2_if[]

    // tag::voorbeeld1_if_else[]
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
    // end::voorbeeld1_if_else[]

    // tag::voorbeeld2_if_else[]
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
    // end::voorbeeld2_if_else[]

    int code = 0;
    // tag::voorbeeld2_geneste_if[]
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
    // end::voorbeeld2_geneste_if[]

    int grade = 70;
    // tag::voorbeeld3_geneste_if[]
    if (grade >= 60)
        IO.println("Passed");
    else
    {
        IO.println("Failed");
        IO.println("You must take the course again.");
    }
    // end::voorbeeld3_geneste_if[]

    int getal1 = 5, getal2 = 5;
    // tag::voorbeeld4_geneste_if[]
    if (getal1 > 10)
        if (getal2 > 20)
            IO.println("getal1 > 10 en getal2 > 20");
        else
            IO.println(" ??? ");
    // end::voorbeeld4_geneste_if[]

    // tag::voorbeeld5_geneste_if[]
    if (getal1 > 10)
    {
        if (getal2 > 20)
            IO.println("getal1 > 10 en getal2 > 20");
    }
    else
        IO.println("???");
    // end::voorbeeld5_geneste_if[]
    
}//einde main