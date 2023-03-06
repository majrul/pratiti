package com.pratiti;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BMITest {

	@Test
	public void calculateBMI_ShouldReturn_ExpectedValue() {
		//given
		Person p = new Person(70, 1.7);
		
		//when
		double actualBmi = BMI.calculateBMI(p);
		
		//then
		double expectedBmi = 24;
		assertEquals(expectedBmi, actualBmi, 0);
	}

	@Test(expected = BMIException.class)
	public void calculateBMI_ShouldThrow_BMIException() {
		Person p = new Person(0, 1.7);
		BMI.calculateBMI(p);		
	}
	
	@Test
	public void isDietRecommended_ShouldReturn_True() {
		Person p = new Person(80, 1.7);
		boolean recommended = BMI.isDietRecommended(p);
		assertTrue(recommended);
	}
	
	@Test
	public void personWithLowestBMI_ShouldReturn_ExpectedValue() {
		//given
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(70, 1.7));
		persons.add(new Person(90, 1.7));
		persons.add(new Person(60, 1.7));
		//when
		Person actual = BMI.findPersonWithLowestBMI(persons);
		//then ?
		/*Person expected = persons.get(2);
		assertEquals(expected, actual);*/
		assertEquals(60, actual.getWeight(), 0);
		assertEquals(1.7, actual.getHeight(), 0);
	}
	
	@Test
	public void getBMIValues_ShouldReturn_ExpectedValue() {
		//given
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(70, 1.7)); //24
		persons.add(new Person(90, 1.7)); //31
		persons.add(new Person(120, 1.7)); //42
		
		//when
		double[] actual = BMI.getBMIValues(persons);
		
		//then
		double[] expected = {24, 31, 42};
		assertArrayEquals(expected, actual, 0);
	}
}












