//gemaakt door Chris de Jong

import java.util.ArrayList;

public class College {
	ArrayList<Student> studentenlijst = new ArrayList<Student> ();
	
	public void studentToevoegen()
	{
		Student st1 = new Student("Lars", 24, "lars@itmail.com");
		Student st2 = new Student("Isa", 22, "isa@dzork.com");
		Student st3 = new Student("Thomas", 33, "thomas@ysmail.com");
		Student st4 = new Student("Susan", 25, "susan@rzmail.com");
		studentenlijst.add(st1);
		studentenlijst.add(st2);
		studentenlijst.add(st3);
		studentenlijst.add(st4);
	}
	public static void main(String[] args)
	{
		College cl = new College();
		cl.studentToevoegen();
		for(int i=0; i<cl.studentenlijst.size(); i++)
		{
			if(i==2)
			{
				System.out.println(cl.studentenlijst.get(i).naam + ", " + cl.studentenlijst.get(i).leeftijd + ", " + cl.studentenlijst.get(i).email);
			}
		}
	}
}
