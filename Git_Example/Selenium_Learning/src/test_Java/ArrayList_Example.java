package test_Java;

import java.util.ArrayList;

public class ArrayList_Example {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Chennai");
		al.add("Madurai");
		al.set(1, "Salem");
		System.out.println(al);
		al.add(2, "Madurai");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
	System.out.println(al.size());
	System.out.println(al.indexOf("Madurai"));
	System.out.println(al.get(5));
	
	}
}
