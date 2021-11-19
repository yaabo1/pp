import java.util.Scanner;
public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your favourite city?");
    String city = keyboard.nextLine();
    int strSize = city.length();
    String upper = city.toUpperCase();
    String lower = city.toLowerCase();
    char letter = city.charAt(1);

    System.out.print(strSize + "\n" + upper + "\n" + lower + "\n" + letter);
  }
}
