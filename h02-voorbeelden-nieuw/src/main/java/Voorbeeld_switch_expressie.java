void main() {
    int x = 5;
    int k = switch (x)
    {
        case 1, 2 -> 7;
        case 3, 5, 7 -> 9;
        default -> 0;
    };
    IO.println("k = " + k);
}