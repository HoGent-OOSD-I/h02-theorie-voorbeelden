void main() {
    String maand;
    maand = IO.readln("Geef de naam van een maand: ");

    int maandNummer;
    // we vormen de volledige naam om naar kleine letters!
    maandNummer = switch (maand.toLowerCase())
    {
        case "januari"-> 1;
        case "februari"-> 2;
        case "maart" -> 3;
        case "april" -> 4;
        case "mei" -> 5;
        case "juni"-> 6;
        case "juli" -> 7;
        case "augustus"-> 8;
        case "september" -> 9;
        case "oktober" -> 10;
        case "november" -> 11;
        case "december" -> 12;
        default -> 0;
    };

    // afdruk verzorgen
    if (maandNummer != 0)
        IO.print(String.format("Dit is de %d%s maand van het jaar%n", maandNummer,
                maandNummer == 1 || maandNummer == 8 ? "-ste" : "-de"));
    else
        System.out.printf("De naam van de maand werd niet herkend.%n");
}//einde main
