// CommissionWorker.java
package ex2;

public class CommissionWorker extends Employee
{
  private double salary;     // base salary per week
  private double commission; // amount per item sold
  private int quantity;      // total items sold for week


  public CommissionWorker(String first, String last, double s, double c, int q)
  {
    super(first, last); // call superclass constructor
    setSalary(s);
    setCommission(c);
    setQuantity(q);
  }

  public void setSalary(double s)
  {  salary = (s > 0 ? s : 0); }

  public void setCommission(double c)
  { commission = (c > 0 ? c : 0);  }

  // Set CommissionWorker's quantity sold
  public void setQuantity(int q)
  { quantity = (q > 0 ? q : 0);  }

  public double earnings()
  { return salary + commission * quantity;  }

  public String toString()
  { return "Commission worker: " + super.toString();  }

}  // end of CommissionWorker class

