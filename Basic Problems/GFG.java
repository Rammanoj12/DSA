// Importing input output classes
//import java.io.*;

// Class 1
// Parent class
class Parent
{

// Function
void msg()
{

	// Print message for this class
	System.out.println("Parent show method is called");
}
}

// Class 2
// Child class
class Child extends Parent
{

	// Overriding existing method of Parent class
	@Override

	// Same Function which will override
	// existing Parent class function
	void msg()
	{

	// Print message for this class
	System.out.println("Child show method is called");
	}

}

// Class3
// Main class
class GFG
{

	// Main driver method
	public static void main(String[] args)
	{
	// Creating a Parent class object
	// but referencing it to a Child class
	Parent obj = new Child();
	
	// Calling the show() method to execute
	obj.msg();
	}
}
