public class Person
{
  private String name;
  private String birthday;

  public Person(String n, String b)
  {
    name = n;
    birthday = b;
  }
  public Person()
  {
    name = "Max Mustermann";
    birthday = "22,02,2002";
  }

  public void setName(String n)
  {
    name = n;
  }
  public void setBirthday(String b)
  {
    birthday = b;
  }
  public String getName()
  {
    return name;
  }
  public String getBirthday()

  {
    return birthday;
  }
}
