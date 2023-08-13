package com.manoj.functionalprograming;

import java.util.List;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
List <String> courses=List.of("spring", "springboot","java","python","microSerivce");	

printNumeberListStructureLambdaSring(courses);

	}
	
	private static void printNumeberListStructureLambdaSring(List<String> courses) {
		
		//courses.stream().forEach(System.out::println); 
		
		//System.out.println(courses.stream().map(course->course +" " +course.length())); //just print reffrence
		
		//*********map()*********//
		courses.stream().map(course->course +" " +course.length()).forEach(System.out::println);
		
		
		
		
	}

}
