void main() {
    int getal;

    do {
        getal = Integer.parseInt(IO.readln(
                "Geef een strikt positief en even geheel getal in: "));
    } while (getal <= 0 || getal % 2 != 0);

    IO.println("Het ingevoerde getal = " + getal);
}
