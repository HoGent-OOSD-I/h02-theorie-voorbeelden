package werkcollege2;

public class Mystery2
{
	public static void main (String[] args)
	{
		new Mystery2().callMysteryMethod();
	}
	
	private void callMysteryMethod()
	{
		for (int count = 1; count <= 10 ; count = count +1)
		{
			System.out.println(
				count % 2 == 1 ? "****" : "++++++++" );
		}
	}
}

