package org.collect;

import java.util.*;
public class ForEachDemo {
	public static void main(String[] args) {
		List<String> ar = new  ArrayList<String>();
		ar.add("Vivek");
		ar.add("Deepak");
		ar.add("Piyus");
		ar.add("Dheeraj");
		ar.add("Anajali");
		ar.add("Aiswarya");
		
		for(String a : ar)
			System.out.print(a+" ");
		System.out.println();
		
		ar.forEach(a -> {
		    System.out.print(a+" ");
		});
		System.out.println();
		
		Vector<Integer> v1 = new Vector<Integer>();
		for(int i=1; i<21; i++)
			v1.add(i);
		
		v1.forEach( v ->
			System.out.println(v+" ") // do not provide semicolon because we have not given the body of the overriden method by { } 
		 );
		System.out.println();
		v1.forEach(null);
	}
}
