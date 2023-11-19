package day1_basic;
//wap to ask choice of user 
//add
//subtract
import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {

		String choice;
		Scanner p= new Scanner(System.in);
		
		System.out.println("add ");
		System.out.println("subtract  ");
		System.out.println("enter choice ");
		
		choice= p.next();
		
		switch(choice)
		{
		case "add":
		case "Add":
		case "ADD":	
			  System.out.println("add numbers");
			  break;
		

		case "subtract":
			  System.out.println("subtract numbers");
			  break;

		default:
			  System.out.println("wrong choice");
			  break;
			  
		}
		
		

	}

}
