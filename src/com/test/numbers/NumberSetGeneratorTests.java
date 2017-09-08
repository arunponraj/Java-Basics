package com.test.numbers;

import static org.junit.Assert.*;

import org.junit.Test;

import com.src.numbers.NumberSetGenerator;

public class NumberSetGeneratorTests {

	@Test
	public final void testGetUniqueCombinationsForNumber() {
		NumberSetGenerator generator = new NumberSetGenerator();
    	
    	assertEquals(1, generator.getUniqueCombinationsForNumber(0));
    	assertEquals(1, generator.getUniqueCombinationsForNumber(11111));
    	assertEquals(120, generator.getUniqueCombinationsForNumber(12345));
    	assertEquals(1, generator.getUniqueCombinationsForNumber(100));
    	assertEquals(36, generator.getUniqueCombinationsForNumber(10045));
	}

}
