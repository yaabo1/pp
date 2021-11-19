public class FileName
{

    String name; String extention;

    public FileName(String n, String e)
    {
      name = n; extention = e;
    }
    public void SetName(String n)
    {
      name = n;
    }
    public void SetExtention(String e)
    {
      extention = e;
    }
    public String getName()
    {
      return name;
    }
    public String getExtention()
    {
      return extention;
    }
    public String getFullName()
    {
      return name+extention;
    }
    public FileName(FileName another)
    {
      this.FileName = another.FileName;
    }
    public boolean equals(Object obj)
    {
      if(!(obj instanceof))
      {
        return false;
      }
      FileName retard = (FileName)obj;
      return retard.name=name &&
             extention = retard.name;

    }
}
