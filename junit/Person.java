package com.pratiti;

public class Person {

	private double weight;
	private double height;
	private int age;
	private Gender gender;
	
	public static enum Gender {
		MALE, FEMALE, OTHER;
	}

	public Person(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public Person(double weight, double height, int age, Gender gender) {
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
