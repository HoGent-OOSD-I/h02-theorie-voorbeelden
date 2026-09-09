void main() {

    // tag::voorbeeld2[]
    int c;

    c = 5;
    IO.println(c);       // print 5
    IO.println(c++);     // vermeerdert c met 1, maar print de vorige waarde: 5
    IO.println(c);       // print 6

    c = 5;
    IO.println(c);       // print 5
    IO.println(++c);     // vermeerdert c met 1 en print de nieuwe waarde: 6
    IO.println(c);       // print 6
    // end::voorbeeld2[]
}