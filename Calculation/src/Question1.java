import java.util.Scanner;
public class Question1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Type an integer:");
    int a=keyboard.nextInt();
    System.out.println("Type a second integer");
    int b=keyboard.nextInt();
    System.out.println("Type a third integer");
    int c=keyboard.nextInt();

    System.out.println("The product of " + a + "*"+ b + "is " + a*b);
    System.out.println("The sum of " + a + "+"+ b +"is " + a+b);
    System.out.println("The quotient of " + b + "/"+ c +"is " + b/c);
    System.out.println("The difference of " + b +"-"+ c + "is " + (b-c));
    System.out.println("The total sum of the calculations is " + (a*b)+(a+b)+(b/c)+(b-c));


  }
}
