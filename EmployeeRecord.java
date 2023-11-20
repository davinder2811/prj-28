package day19_serialization;

import java.util.Scanner;

import java.io.*;


class NewObjectOutputStream extends ObjectOutputStream
{

 

public NewObjectOutputStream(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
@Override
protected void writeStreamHeader() {}
}

public class EmployeeRecord {

	public static void main(String[] args) {
		try {
		Scanner s= new Scanner(System.in)	;
		System.out.println("enter empid and name password");
		int i= s.nextInt();
		String j= s.next();
		String pass= s.next();
		
		Employee e= new Employee(i,j,pass);
		File f= new File("Employee2.ser");
		if(f.length()==0)
		{
		 FileOutputStream f1= new FileOutputStream("Employee2.ser",true);
		//by writing true this file will become appendable
		ObjectOutputStream o= new ObjectOutputStream(f1);
		//serialization --> convert object to bytestream 
		//persist mode 
		o.writeObject(e);// call writeStreamHeader and write additional info to file 
		o.close();
		}
		else
		{
			NewObjectOutputStream o= new NewObjectOutputStream(new FileOutputStream("Employee2.ser",true));
			 
			o.writeObject(e);// call writeStreamHeader of child class and no header will be written now  
			o.close();
		
		}
		
		
		ObjectInputStream k= new ObjectInputStream(new FileInputStream("Employee2.ser"));
		//deserialization --> convert   bytestream to object
		do
			{
			e=(Employee)k.readObject();
	   	    e.show();
	   
			}
		while(e!=null);
		}catch(Exception y) {
			 System.out.println(y);
		}
		
		 
		

	}

}







 












