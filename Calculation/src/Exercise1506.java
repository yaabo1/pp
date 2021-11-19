import java.util.Scanner;

public class Exercise1506
{
  public static void main(String[] args)
  {
    Scanner keyboard=new Scanner(System.in);
    int[] array1 = new int[4];
    int[] array2 = new int[4];
    int[] sumArray = new int[array1.length];

    for(int i = 0; i < array1.length; i++)
    {
      System.out.println("Give an integer");
      array1[i]=keyboard.nextInt();
    }
    for(int j = 0; j < array2.length; j++)
    {
      System.out.println("Give an integer");
      array2[j]=keyboard.nextInt();
    }
    for(int k=0;k<array1.length;k++)
    {
      sumArray[k] = array1[k] + array2[k];
    }
    System.out.println(sumArray[0]+sumArray[1]+sumArray[2]+sumArray[3]);
  }
}
