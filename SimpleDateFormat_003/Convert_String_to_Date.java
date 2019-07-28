import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Convert String to Date.

public class Convert_String_to_Date {

	public static void main(String[] args) throws IOException, ParseException {
		//Received the information from Input
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//asking the people to type in the date
		System.out.println("Please, give the date: yyyy-MM-dd");
		//Setting the date format of what we want
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		//information to String keyin
		String keyin = bf.readLine();
		//keyin information will follow sdf's date format to Date
		Date date = sdf.parse(keyin);
		//printout the Date
		System.out.println(date);
	}

}
