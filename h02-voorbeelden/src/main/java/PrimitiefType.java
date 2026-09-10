void main() {
    // tag::voorbeeld1[]
    boolean gevonden; // <1>
    int teZoekenGetal, getal;
    gevonden = false; // <2>
    teZoekenGetal = 20;

    while (!gevonden) // <3>
    {
        getal = Integer.parseInt(IO.readln("Geef een getal: "));
        if (getal == teZoekenGetal)
            gevonden = true; // <4>
    }
    // end::voorbeeld1[]

    // tag::voorbeeld2[]
    char letter1, letter2;
    letter1 = 'a'; // <1>
    letter2 = '*';
    // end::voorbeeld2[]

    // tag::voorbeeld3[]
    byte getal1, getal2, getal3;
    getal1 = 50;
    getal2 = -128;
    getal3 = 127;
    IO.print(String.format("%d%n", --getal2)); // <1>
    IO.print(String.format("%d%n", ++getal3)); // <2>
    // end::voorbeeld3[]

    // tag::voorbeeld4[]
    short getal4, getal5;
    getal4 = -32768;
    getal5 = 32767;
    IO.print(String.format("%d%n", --getal4)); // <1>
    IO.print(String.format("%d%n", ++getal5)); // <2>
    // end::voorbeeld4[]

    // tag::voorbeeld5[]
    long getal6, getal7;
    getal6 = 2147483647; // bovengrens van int
    getal7 = getal6 * 10;
    IO.print(String.format("%d%n", getal7)); // <1>
    // end::voorbeeld5[]

    // tag::voorbeeld6[]
    float float_getal;
    double double_getal;
    float_getal = 10;
    double_getal = float_getal; // <1>
    float_getal *= 12.123456789;
    double_getal *= 12.123456789;
    IO.print(String.format("%s%.14f%n", "float: ", float_getal)); // <2>
    IO.print(String.format("%s%.14f%n", "double: ", double_getal)); // <3>
    // end::voorbeeld6[]

}