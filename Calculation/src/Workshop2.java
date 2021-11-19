import java.text.DecimalFormat;
import java.util.Scanner;
public class Workshop2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("First number:");
    double n1=keyboard.nextDouble();
    System.out.println("Second number:");
    double n2=keyboard.nextDouble();
    System.out.println("Operator:");
    char o = keyboard.next().charAt(0);
    DecimalFormat formatter = new DecimalFormat("0.0000");

    switch (o)
    {
      case '+':
        System.out.println("Result:" + n1+n2);
        break;

      case '-':
        System.out.println("Result:" + (n1-n2));
        break;

      case '/':
        System.out.println("Result:" + formatter.format(n1/n2));
        break;

      case '*':
        System.out.println("Result" + n1*n2);
        break;

      default:
        System.out.println("OPERATOR NOT SUPPORTED");
        break;
    }
  }
}
