
public class Person {
	String name;
	int age;

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

	public String toString() {
		return "Person name: " + name + "\nPerson age: " + age;
	}

	public Person() {
		this.name = "Mike";
		this.age = 21;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}