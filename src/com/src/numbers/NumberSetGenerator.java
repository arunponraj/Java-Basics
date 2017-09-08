package com.src.numbers;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberSetGenerator {
	
	HashSet<Integer> setOfNumbers = new HashSet<Integer>();
	
    public int getUniqueCombinationsForNumber(int input) {
    	setOfNumbers.clear();
        System.out.println("Input Number: " + input);
        
        if( input == 0)
        	return 1;
        if( input < 0 )
        	return -1;
         
        ArrayList<Integer> digits = new ArrayList<Integer>();
        
        while (input > 0) {
        	digits.add(input % 10);
        	input = input / 10;
         }
        
        int[] ints = new int[digits.size()];
        for(int i=0, len = digits.size(); i < len; i++)
           ints[i] = digits.get(i);

        getNextNumber(0, digits,0, digits.size());
        System.out.println(setOfNumbers);
        
        
    	return setOfNumbers.size();
    }
    
    void getNextNumber(int current, ArrayList<Integer> digits, int index, int end) {
    	
    	if( end <= 0) {
    		setOfNumbers.add(current);
    		return;
    	}
    	for( int i = 0 ; i < digits.size() ; i++) {
    		ArrayList<Integer> newdigits = (ArrayList<Integer> )digits.clone();
    		int nextDigit = newdigits.get(i);
    		if( nextDigit == 0 && current == 0)
    			continue;
    		newdigits.remove(i);
    		getNextNumber(current*10 + nextDigit, newdigits , index + 1, end - 1);
    	}
    }
    
    public static void main(String[] args) {
		int a = 0;
    	int b = 11111;
    	int c = 12345;
    	

		System.out.println("Number of similar numbers: " +new NumberSetGenerator().getUniqueCombinationsForNumber(a));
		System.out.println("\nNumber of similar numbers: " +new NumberSetGenerator().getUniqueCombinationsForNumber(b));
		System.out.println("\nNumber of similar numbers: " +new NumberSetGenerator().getUniqueCombinationsForNumber(c));
		
	}
}
