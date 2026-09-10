void main() {
    int getal;

    do {
        getal = Integer.parseInt(IO.readln("Geef een strikt positief geheel getal in: "));
    } while (getal <= 0);

    IO.println(String.format("Het ingevoerde getal = %d",getal));
}