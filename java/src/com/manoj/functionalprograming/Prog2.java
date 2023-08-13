package com.manoj.functionalprograming;

import java.util.List;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printNumeberListStructureFunctional(List.of(1,2,5,7,9,25,6));
		System.out.println(" even-");
		
		printNumeberListStructureLambda(List.of(1,2,5,6,9,25));
		
	}
//	private static void print(int num) {
//		System.out.print(" "+num);
//	}
	private static void printNumeberListStructureFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
//		for(int i:numbers) {
//			System.out.println(i);
//		}
		
		
		//numbers.stream().forEach(Prog2::print); //method refference. 
		numbers.stream().forEach(System.out::print); //method refference. 

		
	}
	
	private static void printNumeberListStructureLambda(List<Integer> numbers) {
		
		numbers.stream().
		filter(n->n%2==0).
		map(m->m*m).
		forEach(System.out::println); 
		
	}

}
