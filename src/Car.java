public class Car
{
  private String make, model, regNumber;
  private int year;
  private Owner owner;
  public Car(String make, String model, String regNumber, int year, Owner owner)
  {
    this.make=make; this.model=model;this.regNumber=regNumber;this.year=year;this.owner=owner;
  }

  public static int size()
  {
  }

  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public String getRegNumber(){
    return regNumber;
  }
  public int getYear(){
    return year;
  }
  public Owner getOwner(){
    return owner;
  }
  public String toString(){
    return make+model+regNumber+year+owner;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))
      return false;
    Car other=(Car)obj;
    return  other.make==make &&
            other.year==year &&
            other.owner==owner &&
            other.model==model &&
            other.regNumber==regNumber;
  }
}
