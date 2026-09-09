void main() {
    // tag::voorbeeld1[]
    int teller1, result1, teller2, result2;

    teller1 = 0;
    teller2 = 0;

    result1 = teller1++; // <1>
    result2 = ++teller2; // <2>

    IO.println("teller1 : " + teller1);
    IO.println("result1 : " + result1);
    IO.println("teller2 : " + teller2);
    IO.println("result2 : " + result2);
    // end::voorbeeld1[]
}