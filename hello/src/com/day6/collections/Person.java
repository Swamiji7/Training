package com.day6.collections;

public class Person implements Cloneable /* extends object by default since its the parent class of all */ {

	private String name;
	private int age;
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name= " + name + ", age=" + age;
	}

	@Override
public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (this.name.equals(p.name) && this.age == p.age)
			return true;
		return false;
	}

	@Override 
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called ... ");
		
	}
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Person other = (Person) obj; if (age != other.age) return false; if
	 * (name == null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; return true; }
	 */

}






