import java.util.Scanner;

public class PersonDriver {
	/**
	 * 
	 * @author SM Nazibullah Touhid
	 * Prof. Tanes Kanchanawanchai
	 * CSC 200
	 * April 17, 2017
	 * License: GMU
	 * Program:
	 * Give the complete definition of a class called Person that has two instance variables, one for the person's name and the other for the person's age.
	 * 
	 * Add methods to the Person class to perform the following tasks:
	 * 
	 * Add constructors to initialize value of Person object, one without parameters and another with name and age parameters
	 * Set the name attribute of a Person objectSet the age attribute of a Person object
	 *Get the name of a Person object
	 *Get the age of a Person object
	 *Add toString method to return information about the person in string format.
	 * 
	 *Purpose of the program:
	 *To understand use of Class
	 */
	public static void main(String[] args) {
		// constructor with parameters
		Person person = new Person("tim", 17);
		System.out.println(person);

		// constructor without parameters
		Person person2 = new Person();
		System.out.println(person2.toString());

		// getting parameters from user
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter person's name: ");
		String name = keyboard.next();
		person2.setName(name);

		System.out.println("Enter the age of the person: ");
		int age = keyboard.nextInt();
		person2.setAge(age);
		
		keyboard.close();

		System.out.println("Name: " + person.getName());
		System.out.println("Age : " + person.getAge());

	}

}
