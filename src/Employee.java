// placeholder for your Employee class
public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  public Employee(String theirName, double wage, int hours)
  {
    name=theirName;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public Employee()
  {
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    double weeklySalary=hoursWorked*hourlyWage;
    return weeklySalary;
  }
  public double getYearlySalary()
  {
    double yearlySalary=getWeeklySalary()*52;
    return yearlySalary;
  }
  public String toString()
  {
    String out="name: "+name+", wage: "+hourlyWage+", hours: "+hoursWorked;
    return out;
  }
  public void setName(String newName)
  {
    name=newName;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
}
  
