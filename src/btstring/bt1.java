package btstring;
import java.util.Scanner;
public class bt1 {
	
public static void main(String args[]) {
	  System.out.print("Nhap chuoi: ");
	  Scanner scanner = new Scanner(System.in);
	  String str = scanner.nextLine();
	  String replaceString = str.replaceAll(" ","");
	  System.out.println(replaceString);
	     }
}