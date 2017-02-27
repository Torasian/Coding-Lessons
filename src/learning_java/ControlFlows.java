package learning_java;

public class ControlFlows {
	
	//Control flow statements, however, break up the flow of execution by employing decision making, looping, and branching, 
	//enabling your program to conditionally execute particular blocks of code.
	

	public static void main(String[] args) {
		
		//an if stement execute a block of code if a certain condition is satisfied. For example:
		
		if (5>2) { //The condition is given inside the circular brackets
			System.out.println("Yaay, 5 is greater than 2"); 
			//within the curly brackets, you write the code that you want to be executed if the condition is met
		}
		
		//exercise 1 - form an if statement where the condition is met and print something out
		
		
		//we can use multiple if statements. We can use "else if" to add an additional layer of decision making.
		//If the first if statement is not satisfied, it will move on to the next one and check if that condition is met
		//Finally we use the world "else" to signify a default case, this will be executed when none of the if statements are staisfied
		
		int num1 = 2;
		int num2 = 3;
		
		if(num1 > num2){
			System.out.println(num1 + " is bigger than " + num2);
		} else if(num2 == num1) {
			System.out.println(num1 + " is equal to " + num2);
		} else {
			System.out.println("You're all out of luck");
		}
		
		//exercise 2 - form an else if block, using an if statement, and else if statement and an else statement using num1 and num2
		// Make the second statement (else if statement execute)
		
		
		
		
		//An alternative to an if statement is a switch statement, this is especially useful when dealing with many cases
		// For example:
		
		int filmRating = 5;
		
		switch (filmRating) {
		case 1:
			System.out.println("This film was terrible");
			break;
		case 2:
			System.out.println("This film was pretty bad");
			break;
		case 3:
			System.out.println("This film was okay");
			break;
		case 4:
			System.out.println("This film was good");
			break;
		case 5:
			System.out.println("This film was excellent");
			break;
		default:
			System.out.println("Error, incorrect rating");
			break;
		}
			
		//Exercise 3 - create a variable called months of the year. Create a switch statements so that each case represent a month of the year.
		// For example - for case 1 - we would print: January and for case 5 we would print may
		
	}

}
