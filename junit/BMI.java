package com.pratiti;

import java.util.Comparator;
import java.util.List;

public class BMI {

	public static double calculateBMI(Person person) {
		double height = person.getHeight();
		double weight = person.getWeight();
		
		if(height <= 0 || weight <= 0)
			throw new BMIException("Incorrect Data!");
		
		double bmi = weight / (height * height);
		return Math.round(bmi);
	}
	
	public static boolean isDietRecommended(Person person) {
		double bmi = calculateBMI(person);
		if(bmi >= 25)
			return true;
		return false;
	}
	
	public static double[] getBMIValues(List<Person> persons) {
		return persons
				.stream()
				.mapToDouble(BMI::calculateBMI)
				.toArray();
		/*double bmiValues[] = new double[persons.size()];
		
		for(int i=0; i<persons.size(); i++)
			bmiValues[i] = calculateBMI(persons.get(i));
		
		return bmiValues;*/
	}
	
	public static Person findPersonWithLowestBMI(List<Person> persons) {
		/*persons.sort((p1, p2) -> Double.compare(calculateBMI(p1), calculateBMI(p2)));
		return persons.get(0);*/
		return persons
				.stream()
				.sorted(Comparator.comparing(BMI::calculateBMI))
				.reduce((p1,  p2) -> p1)
				.get();
	}
	
}









