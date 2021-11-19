public class MyDate
{
  private int day;
  private int month;
  private int year;

  public void setDay(int dd)
  {
    day = dd;
  }
  public void setMonth(int mm)
  {
    month = mm;
  }
  public void setYear(int yyyy)
  {
    year = yyyy;
  }
  public int getDay()
  {
    return day;
  }
  public int getMonth()
  {
    return month;
  }
  public int getYear()
  {
    return year;
  }
  public MyDate(int d, int m, int y)
  {
    day = d; month = m; year = y;
  }
  public String getDate()
  {
    return(day + "/" + month + "/" + year);
  }
  public boolean isLeapYear()
  {
    if(year % 4==0 && year % 100 != 0 || year % 400==0)
    {
      return true;
    }
    else
      return false;
  }
  public int daysInMonth()
  {
    if(month==1)
      return 31;
    if(month==2&&isLeapYear())
      return 29;
    if(month==2||isLeapYear())
      return 28;
    if(month==3)
      return 31;
    if(month==4)
      return 30;
    if(month==5)
      return 31;
    if(month==6)
      return 30;
    if(month==7)
      return 31;
    if(month==8)
      return 31;
    if(month==9)
      return 30;
    if(month==10)
      return 31;
    if(month==11)
      return 30;
    if(month==12)
      return 31;
    
  }
}
