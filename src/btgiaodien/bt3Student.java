package btgiaodien;

import java.util.Scanner;

import btgiaodien.bt2Tax.payTax;


public class bt3Student extends Bt1Person implements payTax{
	// Thuoc tinh
	protected static String name, email;
	protected static int studentID;
	protected static int phone;

	// Ham khoi tao co doi so
	public bt3Student(String name, int studentID, int phone, String email) {
		super(birthday, gender, blood_type);
		bt3Student.name = name;
		this.studentID = studentID;
		this.phone = phone;
		this.email = email;
	}

	// getter cho name
	public String getName() {
		return name;
	}

	// getter cho studentID
	public int getStudentID() {
		return studentID;
	}

	// getter cho email
	public String getEmail() {
		return email;
	}

	// getter cho phone
	public int getPhone() {
		return phone;
	}

	// setter cho name
	public void setName(String name) {
		this.name = name;
	}

	// setter cho StudentID
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	// setter cho email
	public void setEmail(String email) {
		this.email = email;
	}

	// setter cho phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// Ham hien thi
	public void display() {
		super.display();
		System.out.println("\tHo Ten: " + name);
		System.out.println("\tID Hoc Sinh: " + studentID);
		System.out.println("\tPhone: " + phone);
		System.out.println("\tEmail: " + email);
	}
	public double calcTax(double income) {
		double tax;
		tax = 0.01*income;
		return tax;
	}

	// Ham nhap thong tin
	public void enter() {
		Scanner sc = new Scanner(System.in);
		super.enter();
		System.out.print("\tNhap Ho Ten: ");
		name = sc.next();
		System.out.print("\tNhap ID Hoc Sinh: ");
		studentID = sc.nextInt();
		System.out.print("\tNhap Phone: ");
		phone = sc.nextInt();
		System.out.print("\tNhap Email: ");
		email = sc.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bt3Student P1 = new bt3Student(name, studentID, phone, email);
		P1.enter();
		P1.display();
	}

	@Override
	public double calcTax(double income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		return 0;
	}
}
