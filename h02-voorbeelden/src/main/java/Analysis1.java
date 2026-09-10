void main()
{
    // initialisatie van variabelen bij declaratie
    int passes = 0;
    int failures = 0;
    int result;

    // verwerk 10 studenten gebruikmakend van een tellergestuurde for-lus
    for (int studentCounter = 1; studentCounter <= 10; studentCounter++)
    {
        result = Integer.parseInt(IO.readln(String.format("Enter result %d (1 = pass, 2 = fail): ", studentCounter)));

        // if...else is genest in het for statement
        if (result == 1)
            passes++;
        else
            failures++;
    }//einde for

    IO.print(String.format("Passed: %d%nFailed: %d%n", passes, failures));

    // als er meer dan 8 studenten geslaagd zijn:
    if (passes > 8)
        IO.println("Bonus to instructor!");

}//einde main