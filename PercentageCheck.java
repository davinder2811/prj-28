package day1_basic;
//wap to ask percentage of student and check if it is less then 40 print fail
import java.util.Scanner;

public class PercentageCheck {

	public static void main(String[] args)
	{
		int percent;
        Scanner s = new Scanner(System.in);
		System.out.println("enter percentage");
		percent= s.nextInt();
		if(percent>=40)
		 
			System.out.println("pass");
		 
		else
			
			System.out.println("fail");
		 
			
	}

}
