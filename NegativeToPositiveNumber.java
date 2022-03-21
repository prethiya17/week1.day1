package week1.day1;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	1. Initialize an integer with a negative number
	//	   like, int number = -40;
	//	2. Check if the number is a negative number 
	//	   Hint : any number that is lesser than zero is a negative number
	//	3. If so, convert the number to a positive numer

	//	4. Print as below
	//	        "The number -40 is converted to 40"
		
		int n=-40;
		if(n<0) {
			int m=-n;
			System.out.println( "The number -40 is converted to"+" "+ m);
		}

	}

}
