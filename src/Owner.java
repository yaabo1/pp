public class Owner
{
  private String firstName;
  private String lastName;
  public Owner(String firstName,String lastName)
  {
    this.firstName=firstName; this.lastName=lastName;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String toString()
  {
    return firstName+lastName;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Owner))
    {
      return false;
    }
    Owner other=(Owner)obj;
    return firstName==other.firstName&&
           lastName==other.lastName;
  }
}
