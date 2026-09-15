void main() {
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 5; j++)
            IO.print('@');

        IO.println();
    }

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 3; j++)
        {
            for (int k = 1; k <= 4; k++)
            {
                IO.print('*');
            }
            IO.println();
        }
        IO.println();
    }

}