import java.util.Scanner;

public class Exercise1001
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Username:");
    String n=keyboard.nextLine();
    System.out.println("Password:");
    String p1=keyboard.nextLine();
    System.out.println("Confirmation Password:");
    String p2=keyboard.nextLine();
    do
    {
      if (p1.equals(p2))
      {
        break;
      }
      else
      {
        System.out.println("Password and Confirmation Password did not match try again");
        System.out.println("Password:");
        p1 = keyboard.nextLine();
        System.out.println("Confirmation Password:");
        p2 = keyboard.nextLine();
      }
    }
    while(2<1);
    System.out.println("Username: " + n + "\nPassword: " + p1);
  }
}
