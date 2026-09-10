void main() {
    int total = 0; // initialize total

    // total even integers from 2 through 20
    for (int number = 2; number <= 20; number += 2)
        total += number;

    IO.println("Sum is " + total); // display results
}