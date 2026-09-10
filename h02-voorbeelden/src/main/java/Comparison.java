void main() {
    int number1 = Integer.parseInt(IO.readln("Enter first integer: "));
    int number2 = Integer.parseInt(IO.readln("Enter second integer: "));

    if (number1 == number2) {
        IO.println(String.format("%d == %d", number1, number2));
    }

    if (number1 != number2) {
        IO.println(String.format("%d != %d", number1, number2));
    }

    if (number1 < number2) {
        IO.println(String.format("%d < %d", number1, number2));
    }

    if (number1 > number2) {
        IO.println(String.format("%d > %d", number1, number2));
    }

    if (number1 <= number2) {
        IO.println(String.format("%d <= %d", number1, number2));
    }

    if (number1 >= number2) {
        IO.println(String.format("%d >= %d", number1, number2));
    }
}
