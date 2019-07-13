package com.esub.api.exec;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashingTest {
	public static void main(String[] args) {
		
		List<Integer> duplicates = IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
                .boxed()
                .collect( Collectors.groupingBy( c -> c, Collectors.counting() ) )
                .entrySet()
                .stream()
                .filter( p -> p.getValue() > 1 )
                .map( e -> e.getKey() )
                .collect( Collectors.toList() );
		
		//System.out.println(duplicates);
		
		
		List<Integer> l = Arrays.asList(4,2,2,1,3,1,4,2,3);
		
		List<Integer> p =l.stream().filter(t -> t.intValue() > 0).distinct().sorted().collect(Collectors.toList());
		System.out.println(p);
		/*Set<String> h = new HashSet<String>();
		for(int i=0; i<5;i++) {
			h.add(i+"");
		}
		h.add("ab");
		System.out.println(h);
		
		for(String s : h) {
			System.out.println(s);
		}
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		for(int i=0; i<5;i++) {
			l.add(i+"");
		}
		l.add("ab");
		System.out.println(l);
		
		for(String s : l) {
			System.out.println(s);
		}
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("1");
		t.add("3");
		t.add("2");
		t.add("ab");
		System.out.println(t);
		
		for(String s : t) {
			System.out.println(s);
		}
		*/

		/*Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(2, "uday");
		mp.put(1, "Anand");
		mp.put(4, "Anand");
		mp.put(3, "hoysala");
		
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();

		TreeMap<Integer,String> tmp = new TreeMap<Integer, String>();
		tmp.put(3, "uday");
		tmp.put(1, "Anand");
		tmp.put(4, "Anand");
		tmp.put(2, "hoysala");
		
		for (Map.Entry<Integer, String> entry : tmp.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}*/

		/*
		 * String s1 = new String("HELLO1"); String s2 = new String("HELLO");
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 * 
		 * s1 = s2; System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
        
		/*
		 * TreeSet<String> ts1 = new TreeSet<String>();
		 * 
		 * // Elements are added using add() method ts1.add("A"); ts1.add("B");
		 * ts1.add("C");
		 * 
		 * // Duplicates will not get insert ts1.add("C");
		 * 
		 * 
		 * System.out.println(ts1);
		 */        
		/*Map<DataKey, Integer> hm = getAllData();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("From main - "+dk.hashCode());

		Integer value = hm.get(dk);

		System.out.println("Value - "+value);*/

	}

	private static Map<DataKey, Integer> getAllData() {
		Map<DataKey, Integer> hm = new HashMap<>();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("getAllData - "+dk.hashCode());

		hm.put(dk, 10);

		return hm;
	}

}
