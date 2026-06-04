package cui;

import java.util.Scanner;

public class OpbouwenString
{
    public static void main(String[] args)
    {
    	new OpbouwenString().geefGetallenDeelbaarDoorGekozenDeler();
    }	
    
    private Scanner invoer = new Scanner(System.in);
    
    private void geefGetallenDeelbaarDoorGekozenDeler()
	{
		int getal, deler;
        int teller = 1, aantal = 0;
        String getallenDeelbaar = ""; // <1>
        
        deler = geefDeler();     
        getal = geefGetal(teller);
        
        while (getal != -1) 
        {          
            if (getal % deler == 0) 
            {
            	aantal++;
            	getallenDeelbaar += String.format("%4d", getal); //<2>
            }                     
            getal = geefGetal(++teller);
        }
        
        System.out.printf("%nEr %s %d getal%s deelbaar door %d%s%s%n",
        				aantal == 1? "is":"zijn", aantal, 
        				aantal == 1? "":"len", deler,
        				!getallenDeelbaar.isEmpty()?":":".", getallenDeelbaar); //<3>
    }
    
    private int geefDeler() {
    	int deler;
    	do
        {
	        System.out.print("Geef een strikt positieve deler in: ");
	        deler = invoer.nextInt();
	    }
	    while (deler <= 0);
    	return deler;
	}

	private int geefGetal(int teller)
    {
    	int getal;
        do
        {
        	System.out.printf("Geef positief getal %d in (of stop met -1): ", 
        			teller);
        	getal = invoer.nextInt();
        }
        while (getal < -1);	
        return getal;
    }
}
