package com.esub.api.domain;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		String dup = "abcdabceeedd";
		List<String> a= new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("a");
		a.add("b");
		System.out.println(a);
		usingLinkedHashSet(a);
		usingHashSet(a);
		usingJava8(a);
		usingJavaIterator(a);
		
	}
	
	public static <T> void usingLinkedHashSet(List<String> list ) {
		Set<T> set = new LinkedHashSet<>(); 	
		set.addAll((Collection<? extends T>) list); 
		list.clear();
		list.addAll((Collection<? extends String>) set);
		System.out.println("usingLinkedHashSet - "+list);
	}

	public static <T> void usingHashSet(List<String> list ) {
		Set<T> set = new HashSet<>(); 	
		set.addAll((Collection<? extends T>) list); 
		list.clear();
		list.addAll((Collection<? extends String>) set);
		System.out.println("usingHashSet - "+list);
	}

	public static void usingJava8(List<String> list ) {
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println("usingJava8 - "+list);
	}
	
	public static void usingJavaIterator(List<String> list ) {
		List<String> itr = new ArrayList<String>();
		for(String s : list) {
			if (!(itr.contains(s)) ) {
				itr.add(s);
			}
			
		}
		System.out.println("usingJavaIterator - "+itr);
	}
	

}
