import java.util.*;

public class testFindMaxSubSum
{
  public static void testAll() {
    clearTerminal();
    testSinglePositive();
    testSingleNegative();
    testAllPositive();
    testAllNegative();
    test1();
    test2();
    test3();
    test4();
    testQuadraticTime();
  }

  public static void testSinglePositive() {
    int[] input = { 42 };
    int correctAnswer = 42;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("testSinglePositive",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testSinglePositive");
  }

  public static void testSingleNegative() {
    int[] input = { -123 };
    int correctAnswer = 0;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("testSingleNegative",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testSingleNegative");
  }

  public static void testAllPositive() {
    int[] input = { 1, 2, 3, 4, 5, 6 };
    int correctAnswer = 21;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("testAllPositive",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testAllPositive");
  }

  public static void testAllNegative() {
    int[] input = { -10, -5, -2, -1 };
    int correctAnswer = 0;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("testAllNegative",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testAllNegative");
  }

  public static void test1() {
    int[] input = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
    int correctAnswer = 59 + 26 + -53 + 58 + 97;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("test1",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test1");
  }

  public static void test2() {
    int[] input = { 59, 26, -53, 58, 97, -93, -23, 84 };
    int correctAnswer = 59 + 26 + -53 + 58 + 97;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("test2",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test2");
  }

  public static void test3() {
    int[] input = { 31, -41, 59, 26, -53, 58, 97 };
    int correctAnswer = 59 + 26 + -53 + 58 + 97;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("test3",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test3");
  }

  public static void test4() {
    int[] input = { -1, -2, -1, 10, -1, -2 };
    int correctAnswer = 10;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i : input) list.add(i);

    int output = new maxSubSum().findMaxSubSum(list);

    if (output != correctAnswer)
      outputFail("test4",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test4");
  }

  public static void testQuadraticTime() {
    int n1 = 1000;
    int n2 = 3000;
    long t11 = timeTest(n1);
    long t12 = timeTest(n1);
    long t13 = timeTest(n1);
    long t14 = timeTest(n1);
    long t15 = timeTest(n1);
    long t1 = Math.min(Math.min(Math.min(Math.min(t11, t12), t13), t14), t15);
    System.out.println("");
    System.out.println("Testing time complexity.");
    long t21 = timeTest(n2);
    long t22 = timeTest(n2);
    long t23 = timeTest(n2);
    long t2 = Math.min(Math.min(t21, t22), t23);
    double slowdown = ((double) t2) / t1;
    double linearSlowdown = ((double) n2) / n1;
    if (slowdown > Math.pow(linearSlowdown, 1.2))
      System.out.println("That's not linear time! Assuming all tests are ok, you get 1 point. Or try again for another point");
    else
      System.out.println("Yes! That is linear time. Assuming all tests are ok, you get 2 points.");
  }

  private static long timeTest(int n) {
    long t1 = System.nanoTime();
    ArrayList<Integer> list = new ArrayList<Integer>(n);
    for (int i = 0; i < n; ++i)
      list.add((int) (i * 982451653L % 413158511L));
    new maxSubSum().findMaxSubSum(list);
    long t2 = System.nanoTime();
    // For debugging, output the individual times:
    // System.out.println(n + " " + (t2 - t1));
    return t2 - t1;
  }

  private static void clearTerminal() {
    System.out.print('\u000C');
  }

  private static void outputPass(String testName) {
    System.out.println("[Pass " + testName + "]");
  }

  private static void outputFail(String testName, String message) {
    System.out.println("[FAIL " + testName + "] " + message);
  }

  public static void main(String[] args) {
    testAll();
    /*Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    for (int t = 0; t < testcases; ++t) {
      int n = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < n; ++i) list.add(sc.nextInt());
      System.out.println(new Maxdelsum().maxdelsum(list));
    }*/
  }
}
