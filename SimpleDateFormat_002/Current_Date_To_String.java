import java.text.SimpleDateFormat;
import java.util.Date;

//Convert Date to String.

public class Current_Date_To_String {
	public static void main(String[] args) {
		//Setting the date format
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		//Date follow the sdf's format then transfer to String
		String date=sdf.format(new Date());
		System.out.println(date);
	}
}
