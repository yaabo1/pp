import java.util.Scanner;
public class RomanNumeral
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Write a number between 1-10");
    int n=keyboard.nextInt();

    if(n==1)
    {
      System.out.println("I");
    }
    else if(n==2)
    {
      System.out.println("II");
    }
    else if(n==3)
    {
      System.out.println("III");
    }
    else if(n==4)
    {
      System.out.println("IV");
    }
    else if(n==5)
    {
      System.out.println("V");
    }
    else if(n==6)
    {
      System.out.println("VI");
    }else if(n==7)
    {
      System.out.println("VII");
    }else if(n==8)
    {
      System.out.println("VIII");
    }else if(n==9)
    {
      System.out.println("IX");
    }else if(n==10)
    {
      System.out.println("X");
    }
    else
    {
      System.out.println("Error");
    }
  }
}
