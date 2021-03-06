package btthuake;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B2_Main {
	private B2_Student studentList[];
	private final static String fileName = "B2_Main.txt";

	public B2_Main() {

	}

	public B2_Student[] getStudentList() {
		return studentList;
	}

	@Override
	public String toString() {
		return "B2_Main [getStudentList()=" + Arrays.toString(getStudentList()) + "]";
	}

	void input(int size) {
		studentList = new B2_Student[size];
		for (int i = 0; i < size; i++) {
			studentList[i] = new B2_Student();
			getStudentList()[i].inputStudent();
		}
	}

	void output(int size) throws IOException {
		input(size);
		File file = new File(fileName);
		OutputStream outputStream = new FileOutputStream(file);
		@SuppressWarnings("resource")
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		for (int i = 0; i < studentList.length; i++) {
			getStudentList()[i].outputStudent();
			String data = getStudentList()[i].toString();
			outputStreamWriter.write(data);
			outputStreamWriter.write("\n");
		}
		outputStreamWriter.flush();
	}

	void sort_Student() throws CloneNotSupportedException {
		for (int i = 0; i < getStudentList().length - 1; i++) {
			for (int j = i + 1; j < getStudentList().length; j++) {
				if (getStudentList()[i].getSocial_activities() < getStudentList()[j].getSocial_activities()) {
					B2_Student temp = (B2_Student) getStudentList()[i].clone();
					getStudentList()[i] = (B2_Student) getStudentList()[j].clone();
					getStudentList()[j] = (B2_Student) temp.clone();
				}
			}
		}
		System.out.println("Sap xep sinh vien theo thu tu giam dan cua hoat dong xa hoi: \n");
		for (int i = 0; i < getStudentList().length; i++) {
			System.out.println("ID sinh vien " + getStudentList()[i].getStudentID() + " : \n");
			getStudentList()[i].outputStudent();
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		// TODO Auto-generated method stub
		B2_Main sm = new B2_Main();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int size = scanner.nextInt();
		sm.output(size);
		sm.sort_Student();

		ArrayList<B2_Student> studentArrayList = new ArrayList<B2_Student>();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bfr = new BufferedReader(isr);
			String line = bfr.readLine();
			while (line != null) {
				String[] array = line.split(",");

				if (array.length == 7) {
					B2_Student s = new B2_Student();
					s.setStudentID(array[0]);
					s.setName(array[1]);
					s.setGender(array[2].charAt(0));
					s.setBirth_year(Integer.parseInt(array[3]));
					s.setAcademic_year(Integer.parseInt(array[4]));
					s.setGpa(Float.parseFloat(array[5]));
					s.setSocial_activities(Float.parseFloat(array[6]));

					studentArrayList.add(s);
				}

				// System.out.println(line);
				System.out.println("Them vao File " + fileName + " in ArrayList: \n");
				for (int i = 0; i < studentArrayList.size(); i++) {
					System.out.println("ID: " + studentArrayList.get(i).getStudentID());
					System.out.println("Hoten: " + studentArrayList.get(i).getName());
					System.out.println("Gioi tinh: " + studentArrayList.get(i).getGender());
					System.out.println("Nam sinh: " + studentArrayList.get(i).getBirth_year());
					System.out.println("Nam nhap hoc: " + studentArrayList.get(i).getAcademic_year());
					System.out.println("Diem trung binh: " + studentArrayList.get(i).getGpa());
					System.out.println("Hoat dong xa hoi: " + studentArrayList.get(i).getSocial_activities());
					System.out.println();
				}
				line = bfr.readLine();
			}
			fis.close();
			isr.close();
			bfr.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		scanner.close();
	}

}