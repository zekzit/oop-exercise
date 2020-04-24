// Employee.java
package ex2;

public class Employee
{
  private String firstName;
  private String lastName;


  public Employee(String first, String last)
  { firstName = first;
    lastName = last;
  }

  public String getFirstName()
  {  return firstName;  }

  public String getLastName()
  { return lastName;  }

  public String toString()
  { return firstName + ' ' + lastName;  }

  public double earnings()
  {  return 0; }

}  // end of Employee class
