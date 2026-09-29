void main() {
    int getal;

    do { // <1> <2>
        getal = Integer.parseInt(IO.readln("Geef een strikt positief geheel getal in: "));
    } while (getal <= 0); // <3>

    IO.println(String.format("Het ingevoerde getal = %d",getal));
}