void main()
{
    int passes = 0;
    int failures = 0;
    int studentCounter = 1;
    int result;

    result = askResult(studentCounter);

    while (result != 0)
    {
        if (result == 1)
            passes++;
        else
            failures++;

        studentCounter++;
        result = askResult(studentCounter);
    }//einde while

    IO.println("Passed: " + passes);
    IO.println("Failed: " + failures);
}//einde main

int askResult(int studentCounter) {
    return Integer.parseInt(IO.readln("Enter result " + studentCounter +
                    " (0 = stop, 1 = pass, 2 = fail): "));
}//einde askResult




