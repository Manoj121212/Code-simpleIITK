package com.manoj.functionalprograming;

import java.util.List;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumeberListStructure(List.of(1,2,5,7,9,25,6));
	}

	private static void printNumeberListStructure(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for(int i:numbers) {
			System.out.println(i);
		}
		
	}

}
