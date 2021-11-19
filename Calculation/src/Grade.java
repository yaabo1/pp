public class Grade
{
    String courseName;
    int grade;

  public Grade( int g, String cN)
    {
      grade = g;
      courseName = cN;
    }
    public int getGrade () {
    return grade;
  }
    public String getCourseName () {
    return courseName;
  }
    public void setGrade ( int g)
    {
      grade = g;
    }
    public void setCourseName (String cN)
    {
      courseName = cN;
    }
    public String toString () {
    return grade + courseName;
  }
}
