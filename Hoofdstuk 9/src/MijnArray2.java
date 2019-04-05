import java.util.Arrays;

public class MijnArray2
{
  public static void main(String[] args)
  {
    char[] arrCharA = new char[4];
    arrCharA[0] = 'w';
    arrCharA[1] = 'k';
    arrCharA[2] = 'd';
    arrCharA[3] = 'r';
    char[] arrCharB = Arrays.copyOf(arrCharA, arrCharA.length);
    // de index van het element 'k'
    int i = Arrays.binarySearch(arrCharA, 'k');
    // controleert of de twee arrays gelijk zijn
    boolean b = Arrays.equals(arrCharA, arrCharB);
    // System.out.print(i + " " + b);
    // Antwoord 1
    char[] arrayChar = new char[8];
    arrayChar[0] = 'R';
    arrayChar[1] = 'N';
    arrayChar[2] = 'B';
    arrayChar[3] = 'S';
    arrayChar[4] = 'M';
    arrayChar[5] = 'O';
    arrayChar[6] = 'A';
    arrayChar[7] = 'C';
    // Antwoord 2
    boolean isEqual = Arrays.equals(arrayChar, arrCharA);
    System.out.println("Zijn ze gelijk? " + isEqual);
    // Antwoord 3
    Arrays.sort(arrayChar);
    // Antwoord 4
    for (int x = 0; x < arrayChar.length; x++)
    {
      System.out.print(arrayChar[x] + ", ");
    }
  }
}
