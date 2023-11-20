package javaCollection;

import java.util.*;

public class CustomTreeSet
{

	public static void main(String[] args) {
		
		
	Emp e= new Emp(100,"ashu");
	Emp e1= new Emp(22,"umesh");
	Emp e2= new Emp(38,"renu");
	Emp e3= new Emp(40,"gagan");
	Emp e4= new Emp(15,"kamal");
	
   TreeSet<Emp> t= new TreeSet<Emp>();
   
   t.add(e);  //add will call its own class compareTo method 
   t.add(e1);
   t.add(e2);
   
   System.out.println(t);
   //enhanced loop is used for printing tree set data 
   for( Emp w: t)
   {
	   System.out.println(w);
   }
	   
   
   
	}

}
