import java.util.Scanner;
public class PayrollTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    Payroll pay = new Payroll();

    System.out.println("What is your name?");
    pay.setName(keyboard.nextLine());

    System.out.println("What is your pay rate?");
    pay.setPayRate(keyboard.nextDouble());

    System.out.println("How many hours did you work");
    pay.setHours(keyboard.nextDouble());

    System.out.println("Name:" + pay.getName());
    System.out.println("Gross pay:" + pay.getGrossPay());


  }

}
