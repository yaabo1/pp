import java.util.Scanner;

public class Exercise91
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Give a positve number");
    int n=keyboard.nextInt();

    System.out.print("All the numbers:");
    for(int i = 0;i <= n; i++)
    {
      System.out.print( + i + " ");

    }
    System.out.print("\nAll the numbers:");
    for(int j = 0;j <= n*2; j+=2)
    {
      System.out.print( + j + " ");

    }
    System.out.print("\nAll the numbers:");
    for(int k = 0;k <= n*n; k+=4)
    {
      System.out.print( + k + " ");

    }
  }
}
