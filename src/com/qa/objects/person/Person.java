package com.qa.objects.person;

public class Person implements Comparable<Person> {

	public static String latinName;
	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.age;
		result = prime * result + ((this.jobTitle == null) ? 0 : this.jobTitle.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.age != other.age)
			return false;
		if (this.jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!this.jobTitle.equals(other.jobTitle))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person other) {
		if (this.age > other.age)
			return -1;
		else if (this.age == other.age)
			return 0;
		else
			return +1;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + ", jobTitle=" + this.jobTitle + "]";
	}

	void print() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I am " + this.age + " years old!");
		System.out.println("And I am a " + jobTitle);
	}
}
