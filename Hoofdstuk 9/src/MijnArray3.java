

public class MijnArray3
{
  void myMethod()
  {
    // Antwoord 1
    String strArray[] = { "n", "b", "a", "z" };
    for (int i = 0; i < strArray.length; i++)
    {
      if (strArray[i].equals("z"))
      {
        System.out.print("x1 ");
      }
      else if (strArray[i].equals("a"))
      {
        System.out.print("x2 ");
      }
      else if (strArray[i].equals("b"))
      {
        System.out.print("x2 ");
      }
      else
      {
        System.out.print("x3 ");
      }
    }
  }
  public static void main(String[] args)
  {
    MijnArray3 mk = new MijnArray3();
    mk.myMethod();
  }
}
