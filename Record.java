package day20_collection_generics;
import java.util.*;
//wap to store 50 numbers and display them 
//store only unique number no duplicate allowed
//all collection classes are generic 
public class Record {

	public static void main(String[] args) {
		
		TreeSet<Integer> s= new TreeSet<Integer>();//ascending order 
		//LinkedHashSet<Integer> s= new LinkedHashSet<Integer>();
		 //HashSet<Integer> s= new HashSet<Integer>();
		s.add(10);
		 
		s.add(66);
		s.add(44);
		s.add(444);
		s.remove(10);
		s.add(20);
		s.add(60);
		s.add(88);
		s.add(210);
		s.add(20);
		s.add(null);
		 System.out.println("size of collection"+s.size());
		System.out.println(s);
		
		

	}

}
