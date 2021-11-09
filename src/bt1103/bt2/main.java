package bt1103.bt2;
import java.io.*;
import bt1103.bt1.Student;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Car c = new Car("Xe xích lô ", "Turbo", 4, "19-9-2021");
		
		//Seriable
		//
		FileOutputStream fos = new FileOutputStream("E:\\Car.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("E:\\Car.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Car b = (Car)ois.readObject(); 
	    // down-casting object
	    System.out.print(b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	}

}