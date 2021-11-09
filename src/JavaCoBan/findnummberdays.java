package JavaCoBan;
import java.util.Scanner;
public class findnummberdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        int numberOfDaysInMonth = 0; 
        String MonthOfName = "";

        System.out.print("Nhap Thang: ");
        int month = input.nextInt();

        System.out.print("Nhap Nam: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                	numberOfDaysInMonth = 29;
                } else {
                	numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                numberOfDaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
    }
	}
