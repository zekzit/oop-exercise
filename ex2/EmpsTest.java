// EmpsTest.java
// Example of Employee hierarchy

package ex2;

public class EmpsTest
{
  public static void main(String args[])
  {
    Boss b = new Boss("John", "Davison", 900.00);
    CommissionWorker c = new CommissionWorker("Peter", "Collins", 400.0, 3.0, 150);
    PieceWorker p = new PieceWorker("Bob", "Bingo", 2.5, 200);
    HourlyWorker h = new HourlyWorker("Karen", "Paren", 13.75, 40);

    System.out.println(b + " earns $" + b.earnings());
    System.out.println(c + " earns $" + c.earnings());
    System.out.println(p + " earns $" + p.earnings());
    System.out.println(h + " earns $" + h.earnings());
  } // end of main()

}  // end of EmpsTest class
