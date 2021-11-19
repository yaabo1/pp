public class Exercise1507
{
  public static void main(String[] args)
  {
    int[] numbers = {3, 5, 1, 3, 3, 2, 4, 2, 3};
    int total = 0;
    int numberOfHoleInOnes = 0;
    for(int i=0;i<numbers.length;i++)
    {
      total += numbers[i];
    }
    for(int j=0;j<numbers.length;j++)
    {
      if(numbers[j]==1)
      {
        numberOfHoleInOnes++;
      }
    }
    System.out.println("The total number hits:" + total);
    System.out.println("The average number of hits per hole:" + total/numbers.length);
    System.out.println("The number of Hole in Ones:" + numberOfHoleInOnes);
  }
}
