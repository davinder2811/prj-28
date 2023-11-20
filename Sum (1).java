package day20_collection_generics;
//create a generic class that should only be Number type
//in line 5 extends means the class sum can include only number or child class of Number type only 

public class Sum<E extends Number> {
     E a;
	public static void main(String[] args) {
		Sum s= new Sum(); //by default its is Object type 
		
		Sum <Integer>s1= new Sum();
		
		//Sum <String>s2= new Sum();

	}

}
