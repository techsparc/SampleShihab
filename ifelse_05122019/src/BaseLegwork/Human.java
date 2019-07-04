package BaseLegwork;

public class Human {

	/*
	 * if-else statements
	 * Statements to execute funcitonality based on your comaprison result
	 * if and else are java keywords
	 * 
	 * if (condition is true) {

			//This block of code/func gets executed

		} else {

			//If it is not true, then this block of code/func gets executed
		}

		in java, when we assign a value, we use single = sign.
		when we compare we use ==.
		>> OR operation meaning that if any of the condition can be true. we use pipe sign in OR operation.
		e.g. if(i == "avengers" || i == "AVENGERS")

		>> AND operation.
		The sign of the operation is &&.
		AND means both of the condition MUST have to be true.
		String i = "avengers";
		String j = "AVENGERS";
		e.g. if (i == "avengers" && j == "AVENGERS")

		greater equal >=
		less equal <=
		greater than >
		less than <

	 */
	public void human() {

		String i = "avengers";
		String j = "AVENGERS";


		int u = 10;
		int o = 20;

		if (u >= o && o <= u+10) {

			System.out.println("condition true, if block of code gets executed");

		} else {

			System.out.println("codition false, else block of code gets executed");
		}



		if (i == "avengers" && j == "AENGERS") {

			System.out.println("condition true, if block of code gets executed");

		} else {

			System.out.println("codition false, else block of code gets executed");
		}



	}
	
	public static void main(String[] args) {
		Human h = new Human();
		h.human();

		
	}


}
