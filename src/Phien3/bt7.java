package Phien3;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;
public class bt7 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Chọn bậc phương trình bạn muốn giải(1:2): ");
        int k = scanner.nextInt();
        if(k==1) {
        	System.out.print("Nhập hệ số bậc 2, a = ");
	        float a = bt7.scanner.nextFloat();
	        System.out.print("Nhập hệ số bậc 1, b = ");
	        float b = bt7.scanner.nextFloat();
	        bt7.PtB1(a, b);
        }else if(k==2) {
        	System.out.print("Nhập hệ số bậc 2, a = ");
	        float a = bt7.scanner.nextFloat();
	        System.out.print("Nhập hệ số bậc 1, b = ");
	        float b = bt7.scanner.nextFloat();
	        System.out.print("Nhập hằng số tự do, c = ");
	        float c = scanner.nextFloat();
	        bt7.giaiPTBac2(a, b, c);
        }
        
        
        
        System.out.println("Nhap tuy chon = ");
        int tuychon = scanner.nextInt();
        switch(tuychon) {
        case 1: {
        	System.out.print("Nhập hệ số bậc 2, a = ");
	        float a = bt7.scanner.nextFloat();
	        System.out.print("Nhập hệ số bậc 1, b = ");
	        float b = bt7.scanner.nextFloat();
	        bt7.PtB1(a, b);
        	break;
        	}
        case 2 : {
        	System.out.print("Nhập hệ số bậc 2, a = ");
	        float a = bt7.scanner.nextFloat();
	        System.out.print("Nhập hệ số bậc 1, b = ");
	        float b = bt7.scanner.nextFloat();
	        System.out.print("Nhập hằng số tự do, c = ");
	        float c = scanner.nextFloat();
	        bt7.giaiPTBac2(a, b, c);
        	break;
        	}
        case 0 :break;
        default :System.out.println("vui long nhap lai !");
        }
	}
	public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
	public static void PtB1(float a, float b) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); 
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
	}
}