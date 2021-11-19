public class Exercise94
{
  public static void main(String[] args)
  {

    int n = 10, firstTerm = 0, secondTerm = 1;

    for (int i = 0; i <= n; ++i)
    {
      System.out.println("Fibonacci(" + (i-1) + ") " + firstTerm);

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
