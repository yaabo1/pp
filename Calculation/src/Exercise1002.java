public class Exercise1002
{
  public static void main(String[] args)
  {
    int n = 64;
    double p1 = 2;

    for(int i = 1; i <= n; i++)
    {
      double p2 = p1*2;
      p1 = p2;
    }
    System.out.println("On field 64 there will be " + p1 + "grains of of wheat");

    for(int j = 1; j <= n; j++)
    {
      double p3 = p1;
      double p4 = p1*2;
      p4 = p1;
      double p5 = p3+p4;
    }
    System.out.println("There is a total of " + p1+(p1*2) + "grains of wheat");
  }
}
