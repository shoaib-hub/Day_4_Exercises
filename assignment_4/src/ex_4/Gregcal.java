package ex_4;
import java.util.Calendar;
public class Gregcal {
	  public static void main(String[] args) {
	    Calendar c = Calendar.getInstance();
	    System.out.println("Current Time: "+c.getTime());
	    //parameters: year, month, day
	    c.set(2022, 6, 1);
	    System.out.println("Updated Set Time is: "+c.getTime());
	    System.out.println("ERA is: "+c.get(Calendar.ERA));
	    int weekofyear = c.get(Calendar.WEEK_OF_YEAR);
	    System.out.println("Week of Year is: "+weekofyear);
	    int weekofmonth = c.get(Calendar.WEEK_OF_MONTH);
	    System.out.println("Week of Month is: "+weekofmonth);
	    int hourofday = c.get(Calendar.HOUR_OF_DAY);
	    System.out.println("Hour of Day is: "+hourofday);
	    int dayofyear = c.get(Calendar.DAY_OF_YEAR);
	    System.out.println("Day of Year is: "+dayofyear);
	  }
	}

	//Output:
//		Current Time: Sat Oct 22 12:30:14 IST 2022
//		Updated Set Time is: Fri Jul 01 12:30:14 IST 2022
//		ERA is: 1
//		Week of Year is: 27
//		Week of Month is: 1
//		Hour of Day is: 12
//		Day of Year is: 182
