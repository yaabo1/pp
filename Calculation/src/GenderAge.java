import java.util.Scanner;
public class GenderAge
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    int a=keyboard.nextInt();
    System.out.println("What is your gender?");
    String s=keyboard.nextLine();
    char g = s.charAt(0);

    if(g=='F' && a<18)
    {
      System.out.println("Girl");
    }
    else if(g=='F' && a>=18)
    {
      System.out.println("Woman");
    }
    else if(g=='M' && a<18)
    {
      System.out.println("Boy");
    }
    else if(g=='M' && a>=18)
    {
      System.out.println("Man");
    }
    else
    {
      System.out.println("Error");
    }

  }

}
