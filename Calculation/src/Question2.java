public class Question2
{
  private double rent;
  private int numberOfRooms;
  private Tenant tenant;

  public Question2(double r, int R)
  {
    rent = r;
    numberOfRooms = R;
    tenant = null;
  }
  public Question2(double r)
  {
    rent = r;
    numberOfRooms = 1;
    tenant = null;
  }
  public double getRent()
  {
    return rent;
  }
  public int getNumberOfRooms()
  {
    return numberOfRooms;
  }
  public Tenant getTenant()
  {
    return tenant;
  }
  public void setRent(double r)
  {
    rent = r;
  }
  public boolean isAvailable()
  {
    if(tenant==null)
    {
      return true;
    }

    else
    {
      return false;
    }
  }
  public rentTo(Tenant tenant)
  {
    {

    }
  }






}
