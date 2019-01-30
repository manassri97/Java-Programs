package lab4_1.person;

public class Person {
	private String name;
	private float age;
	public enum type{SAVING ,CURRENT};
	private type t;
	
	public type getT() {
		return t;
	}
	public void setT(type t) {
		this.t = t;
	}
	public Person(String name, float age) {
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}
