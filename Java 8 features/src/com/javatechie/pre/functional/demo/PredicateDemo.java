package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo 
//implements Predicate<Integer>
{

 // noraml expression
//	public boolean test(Integer t) {
//		if (t%2==0) {
//			return true;
//		}else {
//		return false;
//		}
//	}
	
	
	public static void main(String[] args) {
//		Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(7));
		
//-----------with lamda-------		
		Predicate<Integer> predicate =(t) -> t%2==0;
		System.out.println(predicate.test(8));
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);

		list1.stream().filter(t->t%2==0).forEach(t-> System.out.println("Printing even :"+t));
	}

}
