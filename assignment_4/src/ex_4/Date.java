package ex_4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Date {

	   public static void main(String[] args) throws Exception {
	      Calendar cal = Calendar.getInstance();
	      SimpleDateFormat simpleformat1 = new SimpleDateFormat("E, y-M-d h:m:s a z");
	      System.out.println("E, y-M-d h:m:s a z Format: "+simpleformat1.format(cal.getTime()));
	      
	      SimpleDateFormat simpleformat2 = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss a zzz");
	      System.out.println("E yyyy.MM.dd hh:mm:ss a zzz Format: "+simpleformat2.format(cal.getTime()));
	      
	      SimpleDateFormat simpleformat3 = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	      System.out.println("EEEE, MMMM d, yyyy Format: "+simpleformat3.format(cal.getTime()));
	   }
	}

	//Output:
//		E, y-M-d h:m:s a z Format: Sat, 2022-10-22 12:30:38 pm IST
//		E yyyy.MM.dd hh:mm:ss a zzz Format: Sat 2022.10.22 12:30:38 pm IST
//		EEEE, MMMM d, yyyy Format: Saturday, October 22, 2022

