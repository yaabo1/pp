import java.util.*;

public class maxSubSum
{
  public int findMaxSubSum(ArrayList<Integer> input)
  {
    int sum, tempSum;
    sum = 0;
    tempSum = sum;
    for(int i = 0; i < input.size(); ++i)
    {
      sum = sum+input.get(i);
      if(sum<0)
      {
       sum=0;
      }
      else if(sum>tempSum)
      {
        tempSum=sum;
      }
    }
    return tempSum;
  }
}
