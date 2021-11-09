package JavaCoBan;
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class bt5 {
 
    public static void main(String[] args) {
        int a, b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");   
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập a: ");
        a = scanner.nextInt();
        System.out.println("Nhập b: ");
        b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;   
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
 
}