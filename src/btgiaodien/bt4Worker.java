
package btgiaodien;

import java.util.Scanner;

import btgiaodien.bt2Tax.payTax;

public class bt4Worker extends Bt1Person implements payTax {
	// Thuoc tinh
	protected static String name, email;
	protected static int citizenID, phone;
	protected static double salary, other_income;

	// Ham khoi tao co doi so
	public bt4Worker(String name, int citizenID, int phone, String email, Double salary, Double other_income) {

		super(birthday, gender, blood_type);
		this.name = name;
		this.citizenID = citizenID;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.other_income = other_income;
	}
	public double calcTax(double income) {
		return (0.04*income);
	}
	// getter cho name
	public String getName() {
		return name;
	}

	// getter cho citizenID
	public int getCitizenID() {
		return citizenID;
	}

	// getter cho phone
	public int getPhone() {
		return phone;
	}

	// getter cho email
	public String getEmail() {
		return email;
	}

	// getter cho salary
	public Double getSalary() {
		return salary;
	}

	// getter cho other_income
	public Double getOther_income() {
		return other_income;
	}

	// setter cho name
	public void setName(String name) {
		this.name = name;
	}

	// setter cho citizenID
	public void setCitizenID(int citizenID) {
		this.citizenID = citizenID;
	}

	// setter cho phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// setter cho email
	public void setEmail(String email) {
		this.email = email;
	}

	// setter cho salary
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// setter cho other_income
	public void setOther_income(Double other_income) {
		this.other_income = other_income;
	}

	// Ham hien thi
	public void display() {
		super.display();
		System.out.println("\tHo Ten: " + name);
		System.out.println("\tID CMND: " + citizenID);
		System.out.println("\tPhone: " + phone);
		System.out.println("\tEmail: " + email);
		System.out.println("\tTien Luong: " + salary);
		System.out.println("\tTien Thu Nhap Khac: " + other_income);
	}

	// Ham nhap thong tin
	public void enter() {
		Scanner sc = new Scanner(System.in);
		super.enter();
		System.out.print("\tNhap Ho Ten: ");
		name = sc.next();
		System.out.print("\tNhap ID CMND: ");
		citizenID = sc.nextInt();
		System.out.print("\tNhap Phone: ");
		phone = sc.nextInt();
		System.out.print("\tNhap Email: ");
		email = sc.next();
		System.out.print("\ttNhap Tien Luong: ");
		salary = sc.nextDouble();
		System.out.print("\tNhap Tien Thu Nhap Khac: ");
		other_income = sc.nextDouble();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bt4Worker P1 = new bt4Worker(name, citizenID, phone, email, salary, other_income);
		P1.enter();
		P1.display();
	}
	@Override
	public double calcTax(double income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		return 0;
	}
}
