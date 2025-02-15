// Java Program to Illustrate Working of
// Parameterized Constructor

// Importing required inputoutput class
import java.io.*;

// Class 1
class Geek {
	// data members of the class.
	String name;
	int id;

	// Constructor would initialize data members
	// With the values of passed arguments while
	// Object of that class created
	Geek(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

// Class 2
class GFG {
	// main driver method
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Geek geek1 = new Geek("yourname", 1);
		System.out.println("GeekName :" + geek1.name
						+ " and GeekId :" + geek1.id);
	}
}
