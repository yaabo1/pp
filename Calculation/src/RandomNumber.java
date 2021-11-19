import java.util.Scanner;
import java.util.Random;
public class RandomNumber
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random RandomNumber = new Random();

    int number1 = RandomNumber.nextInt(10) +1;

    System.out.println("Guess a number between 1-10");
    int number2=keyboard.nextInt();

    if(number1==number2)
    {
      System.out.println("You guessed right!!");
    }
    else
    {
      System.out.println("You guessed wrong");
    }
  }
}
