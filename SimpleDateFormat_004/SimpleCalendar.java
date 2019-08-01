import java.text.SimpleDateFormat;
import java.util.*;
/*執行時經由參數輸入兩個整數，
第一個數字代表那一年，
第二個數字代表那一月，列印出那一年那一月的月曆。
 */
public class SimpleCalendar {
 
  public static void main(String[] args) {
	  //設定日期輸出的格式 setting the Date format
	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd HH:mm:ss");
	  //要取得時間，使用GregorianCalendar所設定的時間，來取得一個Calendar的實例
	  //Calendar 是抽象類別，無法被實例化。 類別的名稱不可稱Calendar，會造成錯誤。所以改成SimpleCalendar
	  Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
	  //假設，要取得現在的時間，首先使用Calendar的getInstance()取得一個Calendar的實例
	  //Calendar calendar = Calendar.getInstance();
	  
	  	//Use get method to receive the information from date.
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // index: 0=Jan, 11=Dec
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);
			
		System.out.println(sdf.format(calendar.getTime()));
			
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
			
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
  }
 
}