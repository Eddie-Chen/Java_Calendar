import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar_Table {
	public static void main(String[] args) {
		Calendar_Table date = new Calendar_Table();
		date.myCalendar();
	}

	// 實現日曆的方法
	public void myCalendar() {
		GregorianCalendar now = new GregorianCalendar();
		// 獲得一個Date對象
		Date date = new Date();
		// print當前時間
		System.out.println(date.toString());

		// 設置當前時間
		now.setTime(date);
		// 從當前時間中取得日期
		int toDay = now.get(Calendar.DAY_OF_MONTH);
		// 從當前時間中取得月份: 0=1月, 1=2月, 2=3月, 3=4月...
		int month = now.get(Calendar.MONTH);

		// 設置now的日期为1
		now.set(Calendar.DAY_OF_MONTH, 1);

		// 得到now是一周的第幾天
		int week = now.get(Calendar.DAY_OF_WEEK);
		// print日曆的星期標示
		System.out.println("日\t一\t二\t三\t四\t五\t六");

		// 打印當前日期前面的空格
		for (int i = Calendar.SUNDAY; i < week; i++) {
			System.out.print("\t");
		}

		// 打印日曆主體
		while (now.get(Calendar.MONTH) == month) {
			int day = now.get(Calendar.DAY_OF_MONTH);
			// 對輸出的日曆進行對齊，小於10的加上一個空格
			if (day < 10) {
				// 如果是當前日期，加上標示
				if (day == toDay) {
					System.out.print("▲" + day + "▲\t");
				} else {
					System.out.print(" " + day + "\t");
				}
			} else {
				// 如果是當前日期，加上標示
				if (day == toDay) {
					System.out.print("▲" + day + "▲\t");
				} else {
					System.out.print("" + day + "\t");
				}
			}
			// 如果是周六，進行換行
			if (week == Calendar.SATURDAY) {
				System.out.println();
			}
			// 每次輸出日期後，將日期增加一天
			now.add(Calendar.DAY_OF_MONTH, 1);
			// 重新獲得一周的第幾天
			week = now.get(Calendar.DAY_OF_WEEK);
		}
	}
}