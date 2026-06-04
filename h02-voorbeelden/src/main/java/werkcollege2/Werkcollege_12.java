package werkcollege2;

public class Werkcollege_12
{
	public static void main(String[] args)
	{
		new Werkcollege_12().berekenIncrementEnDecrement();
	}
		
	private void berekenIncrementEnDecrement()
	{
		int a = 0, b = 0, c = 0;
		
		a = ++b  +  ++c;     //  a =       b =       c =

		a = b++  +  c++;     //  a =       b =       c =

		a = ++b  +  c++;     //  a =       b =       c = 

		a = b--  +  c--;     //  a =       b =       c =
	}
}
