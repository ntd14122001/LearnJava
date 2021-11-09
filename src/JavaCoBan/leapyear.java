package JavaCoBan;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap Nam: ");
        int year = in.nextInt();

        boolean xx = (year % 4) == 0;
        boolean yy = (year % 100) != 0;
        boolean zz = ((year % 100 == 0) && (year % 400 == 0));

        if (xx && (yy || zz))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}