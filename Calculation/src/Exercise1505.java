import java.util.Scanner;

public class Exercise1505
{
public static void main(String[] args)
{
  Scanner keyboard = new Scanner(System.in);
  int[] numbers = new int[4];
  int[] numbers2 = new int[4];
  for(int i = 0; i < numbers.length; i++)
  {
    System.out.println("Give an integer");
    numbers[i]=keyboard.nextInt();
  }
  for(int j = 0; j < numbers2.length; j++)
  {
    System.out.println("Give an integer");
    numbers2[j]=keyboard.nextInt();
  }
  boolean arraysEqual = true;
  if(numbers.length != numbers2.length)
    arraysEqual = false;
  else
  {
    for(int k = 0; k<numbers.length; k++)
    {
      if (numbers[k] != numbers2[k])
      {
        arraysEqual = false;
        break;
      }
    }
  }
  if (arraysEqual)
    System.out.println("The arrays are equal");
  else
    System.out.println("The arrays are not equal");
}
}
