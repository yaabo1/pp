public class GradeList
{
    Grade[] grade;
    double average;
    public GradeList(int numberOfGrades)
    {
      grade = new Grade[numberOfGrades];
    }
    public int getNumberOfGrades () {
    return grade.length;
  }
    public Grade[] getGrade ( int index)
    {
      return grade;
    }
    public void setGrade (Grade g,int i)
    {
    }
    public double getAverage()
    {
      return average;
    }
    public String toString()
    {
      return "";
    }
}
