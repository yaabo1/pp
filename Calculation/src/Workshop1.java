public class Workshop1
{
  public static void main(String[] args)
  {
    int value1 = 10;
    int value2 = 5;
    System.out.println("Example run:");
    System.out.println("value1:" + value1);
    System.out.println("value2:" + value2);

    value1 = value1+value2;
    value2 = value1-value2;
    value1 = value1-value2;
    System.out.println("After swapping:");
    System.out.println("value1:" + value1);
    System.out.println("value2:" + value2);


  }
}
