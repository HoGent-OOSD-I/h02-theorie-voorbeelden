void main()
{
    int getal, deler;
    int teller = 1, aantal = 0;
    String getallenDeelbaar = ""; // <1>

    deler = geefDeler();
    getal = geefGetal(teller);

    while (getal != -1)
    {
        if (getal % deler == 0)
        {
            aantal++;
            getallenDeelbaar += String.format("%4d", getal); //<2>
        }
        getal = geefGetal(++teller);
    }

    IO.print(String.format("%nEr %s %d getal%s deelbaar door %d%s%s%n",
            aantal == 1? "is":"zijn", aantal,
            aantal == 1? "":"len", deler,
            !getallenDeelbaar.isEmpty()?":":".", getallenDeelbaar)); //<3>
}

int geefDeler() {
    int deler;
    do
    {
        deler = Integer.parseInt(IO.readln("Geef een strikt positieve deler in: "));
    }
    while (deler <= 0);
    return deler;
}

int geefGetal(int teller)
{
    int getal;
    do
    {
        getal = Integer.parseInt(IO.readln(String.format("Geef positief getal %d in (of stop met -1): ",
                teller)));
    }
    while (getal < -1);
    return getal;
}