package JavaCoBan;
import java.util.Scanner;

public class bt3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("(0-single filer, 1-married jointly or "
				+ "qualifying widow(er), 2-married filing separately, 3-head of " + "household) Nhập trình trạng: ");
		int status = input.nextInt();

		System.out.print("Nhập thu nhập: ");
		double income = input.nextDouble();

		double tax = 0;

		if (status == 0) {
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = income *0.15;
			else if (income <= 82250)
				tax = income * 0.25;
			else if (income <= 171550)
				tax = income * 0.28;
			else if (income <= 372950)
				tax = income * 0.33;
			else
				tax = income * 0.35;
		} else if (status == 1) {
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = income *0.15;
			else if (income <= 137050)
				tax = income * 0.25;
			else if (income <= 208850)
				tax = income * 0.28;
			else if (income <= 372950)
				tax = income * 0.33;
			else
				tax = income * 0.35;
		} else if (status == 2) {
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = income *0.15;
			else if (income <= 68525)
				tax = income * 0.25;
			else if (income <= 104425)
				tax = income * 0.28;
			else if (income <= 186475)
				tax = income * 0.33;
			else
				tax = income * 0.35;
		} else if (status == 3) {
			if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 44500)
				tax = income *0.15;
			else if (income <= 117450)
				tax = income * 0.25;
			else if (income <= 190200)
				tax = income * 0.28;
			else if (income <= 372950)
				tax = income * 0.33;
			else
				tax = income * 0.35;
		} else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		System.out.println("Thuế là " + (int) (tax * 100) / 100.0);
	}
}