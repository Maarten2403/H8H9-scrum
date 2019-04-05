

import java.util.Arrays;

public class Dier
{
  public static void main(String[] args)
  {
    // Antwoord 2
    String[] arrDier = new String[8];
    arrDier[0] = "Wolf ";
    arrDier[1] = "Leeuw ";
    arrDier[2] = "Luipaard ";
    arrDier[3] = "Olifant ";
    arrDier[4] = "Tijger ";
    // Antwoord 1
    arrDier[5] = "Beer ";
    arrDier[6] = "Zebra ";
    arrDier[7] = "Aap ";
    // Zie de klasse "Arrays" van de Java standaard API
    Arrays.sort(arrDier);
    // Antwoord 3
    for (int i = 0; i < arrDier.length; i++)
    {
      System.out.println(arrDier[i]);
    }
  }
}
