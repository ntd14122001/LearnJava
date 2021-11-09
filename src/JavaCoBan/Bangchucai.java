package JavaCoBan;
import java.util.Scanner;
public class Bangchucai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("Nhap : ");
        String input = in.next().toLowerCase();

        boolean chuhoa = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean chuthuong = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean nguyenam = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error . Khong Phai 1 Chu Cai Duy Nhat");
        }
        else if (!(chuhoa || chuthuong))
        {
            System.out.println("Error. Khong Phai Chu Hoa Hoac Chu Thuong ");
        }
        else if (nguyenam)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
	}

}
