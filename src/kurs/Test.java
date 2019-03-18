package kurs;

import java.util.ArrayList;
import java.util.Random;

import brodovi.FabrikaBrodova;
import brodovi.Fregata;
import brodovi.NeprijateljskiBrod;
import brodovi.NosacAviona;
import brodovi.Razarac;

public class Test 
{
	
	
	public static void RadiPosao (ArrayList<NeprijateljskiBrod> brodovi)
	{
		for (NeprijateljskiBrod neprijateljskiBrod : brodovi)
		{
			if(!(neprijateljskiBrod instanceof NosacAviona))
			{
				System.out.println("+ Napada " + neprijateljskiBrod.getIme());
				System.out.println("  Vrsi stetu od " + neprijateljskiBrod.getRazona_moc());
			}
			else
				System.out.println("- Brod " + neprijateljskiBrod.getIme() + " nosi avione");
		}	
	}
	


	public static void main(String[] args) 
	{
		
		ArrayList<NeprijateljskiBrod> neprijateljski_brodovi = new ArrayList<>();
		
		int n = 5;
		//kreirati n random neprijateljskh brodova
		Random random_generator = new Random();
//		
//		int x = random_generator.nextInt(3); // 0,1,2
//		
//		// nacin kreiranja jednog slucajnog broda
//		NeprijateljskiBrod b;
		
//		if(x == 0)
//			b = new Razarac();
//		else if(x == 1)
//			b = new NosacAviona();
//		else 
//			b = new Fregata();
	
		
//		for(int i = 0; i < n; i++)
//		{
//			int x = random_generator.nextInt(3); // 0,1,2
//			
//			//kreiranje random broja
//			NeprijateljskiBrod b;
//			if(x == 0)
//				b = new Razarac();
//			else if(x == 1)
//				b = new NosacAviona();
//			else 
//				b = new Fregata();
//			
//			neprijateljski_brodovi.add(b);
//		
//		}
//		
		
		FabrikaBrodova fabrika = new FabrikaBrodova();
		for(int i = 0; i < n; i++)
			neprijateljski_brodovi.add(fabrika.KreirajBrod("fregata"));
//			neprijateljski_brodovi.add(fabrika.KreirajRandomBrod());
		RadiPosao(neprijateljski_brodovi);
		
		
		
	}
	
}
