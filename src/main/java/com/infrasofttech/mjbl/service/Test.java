package com.infrasofttech.mjbl.service;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A{
	public  void m2();
	
}

public abstract class Test implements A {
	
	

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
	
		
		
		//Test t3 = t2(t);
		 
		
		/*
		 * t.run(); t.start();
		 * 
		 * int t1 = 9;
		 */
		int data= 8;
		
		//System.out.println(t1 & data);
		/*
		 * byte var = 1; var (byte) var * 0; byte data =(byte)(var * 0 );
		 * System.out.println(var);
		 * 
		 */
		int w =10;
		A a = () -> System.out.println("ok........");
		
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6);
		
		/*
		 * for(int i :list) { System.out.println(i); }
		 */
		
		list.forEach(i -> System.out.println(i));
		
	}

}
