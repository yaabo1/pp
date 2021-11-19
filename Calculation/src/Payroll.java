public class Payroll
{
  private String name;
  private double payRate;
  private double hours;

  public void setName(String n)
  {
    name = n;
  }
  public void setPayRate(double p)
  {
    payRate = p;
  }
  public void setHours(double h)
  {
    hours = h;
  }
  public String getName()
  {
    return name;
  }
  public double getPayRate()
  {
    return payRate;
  }
  public double getHours()
  {
    return hours;
  }
  public double getGrossPay()
  {
    return payRate * hours;
  }

}


