package werkcollege2;

public class GenesteFor
{
	public static void main(String[] args)
	{
		new GenesteFor().printApestaartenEnSterretjes();
	}
		
	private void printApestaartenEnSterretjes()
	{
		// tag::insertQuarterTag1[]
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 5; j++)
				System.out.print('@');

			System.out.println();
		}
		// end::insertQuarterTag1[]

		// tag::insertQuarterTag2[]
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				for (int k = 1; k <= 4; k++)
				{
					System.out.print('*');
				}
				System.out.println();
			}
			System.out.println();
		}
		// end::insertQuarterTag2[]

	}
}
