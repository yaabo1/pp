import java.util.Scanner;
public class GradeConversion
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your grade");
    int G=keyboard.nextInt();

    if(G==-3)
    {
      System.out.println("Your Grade is F");
    }
    else if(G==0)
    {
      System.out.println("Your Grade is Fx");
    }
    else if(G==2)
    {
      System.out.println("Your Grade is E");
    }
    else if(G==5)
    {
      System.out.println("Your Grade is D");
    }
    else if(G==7)
    {
      System.out.println("Your Grade is C");
    }
    else if(G==10)
    {
      System.out.println("Your Grade is B");
    }
    else if(G==12)
    {
      System.out.println("Your Grade is A");
    }
    else
    {
      System.out.println("Error");
    }
  }
}
