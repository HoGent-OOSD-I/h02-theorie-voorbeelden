void main() {

    // create truth table for && (conditional AND) operator
    IO.print(String.format("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",   // <1>
            "Conditional AND (&&)", "false && false", (false && false),
            "false && true", (false && true),
            "true && false", (true && false),
            "true && true", (true && true)));

    // create truth table for || (conditional OR) operator
    IO.print(String.format("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Conditional OR (||)", "false || false", (false || false),
            "false || true", (false || true),
            "true || false", (true || false),
            "true || true", (true || true)));

    // create truth table for ! (logical negation) operator
    IO.print(String.format("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
            "!false", (!false), "!true", (!true)));
}
