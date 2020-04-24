// HourlyWorker.java
package ex2;

public class HourlyWorker extends Employee
{
  private double wage;  // wage per hour
  private double hours; // hours worked for week


  public HourlyWorker(String first, String last, double w, double h)
  {
    super(first, last); // call superclass constructor
    setWage(w);
    setHours(h);
  }

  public void setWage(double w)
  {  wage = (w > 0 ? w : 0);  }

  public void setHours(double h)
  { hours = (h >= 0 && h < 168 ? h : 0); }

  public double earnings()
  { return wage * hours; }

  public String toString()
  {  return "Hourly worker: " + super.toString();  }

} //end of HourlyWorker class
