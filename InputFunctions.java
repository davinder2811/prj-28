package day1_basic;
//wap to read two number from user and display their sum 
import java.util.Scanner;

 
public class InputFunctions
{
	public static void main(String[] args) {
		int a;
		int b;
		//Scanner is predefined class 
		//at line 14 we are creating scanner class object 
		Scanner s= new Scanner(System.in);
		System.out.println("enter two number");
		a = s.nextInt();
		b=  s.nextInt();
		
		System.out.println("sum=" + (a+b));
		
		 
		

	}

}
