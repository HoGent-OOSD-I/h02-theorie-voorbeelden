void main() {
    Scanner input = new Scanner(System.in);

    // tag::voorbeeld1_switch[]
    int keuze = Integer.parseInt(IO.readln("Geef uw keuze in: "));

    switch (keuze)
    {
        case 1 -> IO.println("Keuze 1! Je hebt gekozen om op te tellen.");
        case 2 -> IO.println("Keuze 2! Je hebt gekozen om te delen.");
        case 3 -> IO.println("Keuze 3! Je hebt gekozen om af te trekken.");
        default -> IO.println("Foutieve keuze!");
    }
    // end::voorbeeld1_switch[]

    // tag::voorbeeld1_if_else[]
    if (keuze == 1)
        IO.println("Keuze 1! Je hebt gekozen om op te tellen.");
    else
    if (keuze == 2)
        IO.println("Keuze 2! Je hebt gekozen om te delen.");
    else
    if (keuze == 3)
        IO.println("Keuze 3! Je hebt gekozen om af te trekken.");
    else
        IO.println("Foutieve keuze!");
    // end::voorbeeld1_if_else[]

    // tag::voorbeeld2[]
    String stad = "Gent";
    switch (stad.charAt(0)) // eerste karakter van de String stad
    {
        case 'A' -> IO.println("Antwerpen");
        case 'G' -> IO.println("Gent");
        case 'B' -> IO.println("Brugge");
    }
    // end::voorbeeld2[]

    // tag::voorbeeld1_switch_expressie[]
    int bewerking = Integer.parseInt(IO.readln("Geef uw keuze in: "));
    IO.println(
            switch (bewerking)
            {
                case 1 -> "Keuze 1! Je hebt gekozen om op te tellen.";
                case 2 -> "Keuze 2! Je hebt gekozen om te delen.";
                case 3 -> "Keuze 3! Je hebt gekozen om af te trekken.";
                default -> "Foutieve keuze!";
            }
    );
    // end::voorbeeld1_switch_expressie[]
}//einde main