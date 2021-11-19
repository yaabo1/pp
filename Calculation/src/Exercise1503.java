public class Exercise1503
{public static void main(String[] args)
{
  int[] sourceArray = {2, 4, 6, 8, 10};
  int[] destinationArray = new int[sourceArray.length*2];
  for (int i = 0; i < sourceArray.length; i++)
  {
    destinationArray[i] = sourceArray[i];
  }
  for (int j = 0; j < sourceArray.length; j++)
  {
    System.out.println("Array 1 Number " + j + ":" + sourceArray[j]);
  }
  for (int k = 0; k < destinationArray.length; k++)
  {
    System.out.println("Array 2 Number " + k + ":" + destinationArray[k]);
  }
}
}
