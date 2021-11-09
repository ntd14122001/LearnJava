package JavaCoBan;
import java.util.Scanner;
public class weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner weekday = new Scanner(System.in);
        System.out.print("Nhap So: ");
        int day = weekday.nextInt();

        System.out.println(getDayName(day));
	}
	 		public static String getDayName(int day) {
	        String dayName = "";
	        switch (day) {
	            case 0: dayName = "Monday"; break;
	            case 1: dayName = "Tuesday"; break;
	            case 2: dayName = "Wednesday"; break;
	            case 3: dayName = "Thursday"; break;
	            case 4: dayName = "Friday"; break;
	            case 5: dayName = "Saturday"; break;
	            case 6: dayName = "Sunday"; break;
	            default:dayName = "Ngay sai";
	        }

	        return dayName;
}
	 		
}
