// Date.java
package ex2;

public class Date
{
  private int month;   // 1-12
  private int day;     // 1-31 based on month
  private int year;


  public Date(int mn, int dy, int yr)
  {
    if (mn > 0 && mn <= 12) // check the month
      month = mn;
    else {
      month = 1;
      System.out.println("Month " + mn + " invalid. Set to month 1.");
    }

    year = yr;  // could also check the year
    day = checkDay(dy); // check the day

    System.out.println("Date object constructor for date " + toString());
  }  // end of Date()


  // confirm proper day value based on month and year
  private int checkDay(int testDay)
  {
    int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    if (testDay > 0 && testDay <= daysPerMonth[month])
      return testDay;

    if (month == 2 && // February: Check for leap year
        testDay == 29 &&
        (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0))) {
      return testDay;
    }

    System.out.println("Day " + testDay + " invalid. Set to day 1.");
    return 1;
  }  // end of checkDay()


  // Create a String of the form month/day/year
  public String toString()
  {  return month + "/" + day + "/" + year;  }

}  // end of Date class
