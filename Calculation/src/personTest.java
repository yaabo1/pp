

  public class personTest
  {
    public static void main(String[] args)
    {
      Person pers1 = new Person("Jan Rohweder","28.03.2003");
      Person pers2 = new Person("James Cullen","11.09.2001");
      System.out.println("Name:" + pers1.getName() +"\n Birthday:" + pers1.getBirthday());
      System.out.print("Name:" + pers2.getName() +"\n Birthday:" + pers2.getBirthday());


    }
  }

