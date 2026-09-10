void main() {
// tag::insertQuarterTag1[]
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 5; j++)
            IO.print('@');

        IO.println();
    }
    // end::insertQuarterTag1[]

    // tag::insertQuarterTag2[]
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
    // end::insertQuarterTag2[]

}