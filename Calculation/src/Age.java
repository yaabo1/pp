import java.util.Scanner;
public class Age
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");

    int a=keyboard.nextInt();


    if(a<0)
    {
      System.out.println("Error in age value");
    }
    else if(a<=11)
    {
      System.out.println("Child");
    }
    else if(a<=19)
    {
      System.out.println("Teenager");
    }
    else if(a<=64)
    {
      System.out.println("Adult");
    }
    else
    {
      System.out.println("Senior Citizen");
    }


  }
}
