import java.util.Scanner;
import java.util.Random;

public class Exercise96
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random Exercise96 = new Random();
    int n1 = Exercise96.nextInt(1000);
    System.out.println("Give a number between 1-1000");
    int n2=keyboard.nextInt();

    for(int i = 0; ; i++)
    {
      if(n1>n2)
      {
        System.out.println("Your guess was too low");
        System.out.println("Give a number between 1-1000");
        n2=keyboard.nextInt();
      }
      else if(n1<n2)
      {
        System.out.println("Your guess was too high");
        System.out.println("Give a number between 1-1000");
        n2=keyboard.nextInt();
      }
      else if(n1==n2)
      {
        System.out.println("You guessed right");
        System.out.println("You guessed wrong " + i + " times");
        break;
      }
    }
  }
}
