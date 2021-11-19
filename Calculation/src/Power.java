import java.util.Scanner;

public class Power
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Give a number");
    double x=keyboard.nextDouble();
    System.out.println("Give a positive number");
    double n=keyboard.nextDouble();

    while(n<=0)
    {
      System.out.println("Please give a positive number");
      n=keyboard.nextDouble();
    }
    for(int i = 0;i <= n; ++i)
    {
      
    }
  }
}
