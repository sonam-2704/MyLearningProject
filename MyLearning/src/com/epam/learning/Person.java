package com.epam.learning;

public class Person {
	
	public static enum GENDER
	{
		MALE,FEMALE;
	}
	
	private int id;
	private String name;
	private Double salary;
	private GENDER gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
	public boolean isMale()
	{
		return GENDER.MALE==gender;
	}
	
	public boolean isFemale()
	{
		return GENDER.FEMALE==gender;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
