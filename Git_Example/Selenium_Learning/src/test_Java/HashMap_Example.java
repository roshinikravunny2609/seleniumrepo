package test_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(1, "apple");
		hmap.put(2, "banana");
		hmap.put(1, "custard");
		System.out.println(hmap);
		System.out.println(hmap.size());
		System.out.println(hmap.get(1));
		Iterator itr = hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
		}

	}

}
