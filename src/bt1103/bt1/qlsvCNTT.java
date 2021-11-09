package bt1103.bt1;

import java.io.*;

public class qlsvCNTT {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

		Student s = new Student("Nguyen Tien Dat", "14-12-2001", '1', 7.5, 5);

		Student s2 = (Student) s.clone();
		System.out.println("Clone:");
		System.out.println(s2.toString());

		FileOutputStream fos = new FileOutputStream("E:\\Student.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s);
	    
	    FileInputStream fis = new FileInputStream("E:\\Student.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Student b = (Student)ois.readObject(); 
	    
	    oos.close();
	    ois.close();
	    
	    System.out.println("Compare");
	    Student c = new Student("Phan Thi Minh Hanh", "09-11-2002", '1', 5, 4);
	    System.out.println(s.toString() +" va "+ c.toString());
	    System.out.println(s.compareTo(c));	
	}

}