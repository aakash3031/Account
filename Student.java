package com.Assign2;


public final class Student {
	
	private final String name;
	private final int id;
	private final int age;

	public Student(String name,int id,int age)
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
	

}

class Check {
	public static void main(String args[]) {
		Student stu = new Student("Ram", 56,7);
		System.out.println(stu);
	}
}