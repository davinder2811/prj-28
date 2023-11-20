package day20_collection_generics;
//demonstrate generic class
//similar to c++ template 
// it is used when we have common algorithm for different datatype 
//generic in java only works with wrapper classes or class

import java.util.Scanner;

//wrapper -->Integer,Character,Float,Double,Byte,Short,Long,Boolean
//generic does not work with primitive data type


//generic class shud not inherit exception ,error or throwable 
//class abc<T1> extends Exception{ }
public class Calculation<T,T1> {
	T a,b;
	T1 c;
	void  display(T a,T b, T1 c)
	{
		this.a= a;
		this.b=b;
		this.c= c;
		System.out.println(this.a +"   "+ this.b +"  "+ this.c);
	}

	public static void main(String[] args) {
		Calculation<Integer,Float> r= new Calculation<Integer,Float>();
		Scanner s= new Scanner (System.in);
		System.out.println("enter two numbers ");
		int x=s.nextInt();
		int y=s.nextInt();
		Float z=s.nextFloat();
		r.display(x,y,z);
		
	 
		

	}

}
