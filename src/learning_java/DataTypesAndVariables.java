package learning_java;

public class DataTypesAndVariables {

	public static void main(String[] args) {
		
		//To print something out we use System.out.println(print something here);
		//If you are typing in a string, make sure to put it in double quotes
		
	
		//Exercise 1: Print out your name
		
		//A variable stores the value of a data item. This value can change.
		// Below we create an integer variable called 'number'. We have not assigned it a value.
		// This is called, declaring a variable.
		int number;
		// Here we assign number a value
		number = 1;
		
		//We can also print out variables, it will just print out the value assigned to the variable.
		//Exercise 2: Print out the variable "number"
		
		//Exercise 3: Create a variable of type String and assign it to your names. After this, print it out.
		
		//We can declare and assign a variable like this:
		String hello = "Hello";
		
		//When printing things, we can concatenate items so that they print together. 
		// We do this by using the '+' operator:
		System.out.println("Hello" + "World");
		
		//Exercise 4: Print out the combination of the variables number and hello. The result should be 1 + Hello
	
	
		
		//A boolean data type can either be true or false. 
		//These are especially useful for logic and conditional statements, which we will introduce later on.
		Boolean isSleeping = true;
		
		
		//so far we have introduced 3 data types, an integer, a String and boolean values.
		//There are many more different data types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		
	}

}
