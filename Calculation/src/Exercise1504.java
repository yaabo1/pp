import java.util.Scanner;

public class Exercise1504
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] numbers = new int[5];
    for(int i = 0; i < numbers.length; i++)
    {
      System.out.println("Give an integer");
      numbers[i]=keyboard.nextInt();
    }
    int total = 0;
    double average;
    for (int j = 0; j < numbers.length; j++)
    {
      total += numbers[j];
    }
    average = (double)total / numbers.length;
    System.out.println(average);
  }
}
