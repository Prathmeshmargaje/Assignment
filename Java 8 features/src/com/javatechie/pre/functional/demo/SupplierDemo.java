package com.javatechie.pre.functional.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo 
//implements Supplier<String>
{


//	public String get() {
//		return "Hi java solution";
//	}
//	
	public static void main(String[] args) {
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
		
	//	Supplier<String> supplier =() ->"Hi java solution";
	//	System.out.println(supplier.get());
		
		List<String> list1 = Arrays.asList("a","b"); // remove to get empty 
		System.out.println(list1.stream().findAny().orElseGet(() ->"Hi java solution"));
	}

}


// This interface is used when we have to return some dummy data / meaningful data  