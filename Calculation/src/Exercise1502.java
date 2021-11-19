public class Exercise1502
{
  public static void main(String[] args)
  {
    int[] sourceArray = {2,4,6,8,10};
    int[] destinationArray = new int[sourceArray.length];
    for(int i = 0; i < sourceArray.length; i++)
    {
      destinationArray[i] = sourceArray[i];
    }
    for(int j = 0; j < sourceArray.length; j++)
    {
      System.out.println("Array 1 Number " + j +":" + sourceArray[j]);
      System.out.println("Array 2 Number " + j +":" + destinationArray[j]);
    }
  }
}
