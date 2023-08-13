package com.manoj.functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Prog4OperrationCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers
        = Arrays.asList(2, 3, 4, 5, 2);

    // collect method returns a set
    Set<Integer> squareSet
            = numbers.stream()
              .map(x -> x * x)
            .collect(Collectors.toSet());
   
    //System.out.println(squareSet);
    
    //numbers.add(7);
    int []a= {1,2,3,2};
    int b[]= {5,3,6};
    
   //int [] temp=a.stream().
    		

}
}
