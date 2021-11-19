public class Car
{
    private String make, model, color, licenseNumber;
    private int year;

    public Car(String make, String model, String color, String licenseNumber, int year)
    {
      this.make = make;this.model = model; this.color = color; this.licenseNumber = licenseNumber; this.year = year;
    }
    public Car(String make, String model, String color, int year)
    {
      this.make = make;this.model = model; this.color = color; this.licenseNumber = null; this.year = year;
    }
    public String getMake()
    {
      return make;
    }
  public String getModel()
  {
    return model;
  }
  public String getColor()
  {
    return color;
  }
  public String getLicenseNumber()
  {
    return licenseNumber;
  }
  public int getYear()
  {
    return year;
  }
  public void setColor(String c)
  {
    color = c;
  }
  public void setLicenseNumber(String ln)
  {
    licenseNumber = ln;
  }
  public Car copy()
  {
    return new Car(make,model, color, licenseNumber, year);
  }

  public String toString()
  {
    return this.make + this.model + this.color + this.licenseNumber + this.year;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car)obj;
    return make == other.make &&
           model == other.model &&
           color == other.color &&
           licenseNumber == other.licenseNumber &&
           year == other.year ;
  }


}
