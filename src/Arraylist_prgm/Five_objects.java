package Arraylist_prgm;

//wajp to merge to arrays using collections
//wajp to print common elements from  2 arrays using collections
//wajp 

import java.util.ArrayList;
import java.util.Iterator;
public class Five_objects {	
	String name;
	long contact;
	 Five_objects(String name,long contact )
	{
		this.name=name;
		this.contact=contact;
	}
	@Override
	public String toString() {
		
		return name+" "+contact;
	}
	 public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(new Five_objects("rama", 657689));
		a1.add(new Five_objects("krishna", 35458));
		a1.add(new Five_objects("reddy", 56847));
		a1.add(new Five_objects("rajareddy", 456789));
		a1.add(new Five_objects("murali", 89787));
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
