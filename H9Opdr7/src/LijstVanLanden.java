//gemaakt door Chris de Jong

import java.util.ArrayList;

public class LijstVanLanden {
	public static void main(String[] args)
	{
		ArrayList<String> landen = new ArrayList<String>();
		landen.add("Duitsland");
		landen.add("Verenigde staten");
		landen.add("Rusland");
		landen.add("Verenigd Koninkrijk");
		landen.add(2, "India");
		
		for(int i=0; i<landen.size(); i++)
		{
			System.out.print(" " + landen.get(i));
		}
	}
}
