import java.util.Random;

public class UniqueSum {
	static Random rand = new Random();

	public void noUniqueSum(int min, int max) {
		
		int numOne = (int) (Math.random() * ((max - min) + 1)) + min;
		int numTwo = (int) (Math.random() * ((max - min) + 1)) + min;
		int numThree = (int) (Math.random() * ((max - min) + 1)) + min;
		
		System.out.println(numOne);
		System.out.println(numTwo);
		System.out.println(numThree);
		
		if (numOne != numTwo && numOne != numThree && numTwo != numOne && numTwo != numThree && numThree != numOne && numThree != numTwo) {
			System.out.println(numOne+numTwo+numThree);
		}
		else if (numOne == numTwo) {
			System.out.println(numThree);
		}
		else if (numTwo == numThree) {
			System.out.println(numOne);
		}
		else if (numOne == numThree) {
			System.out.println(numTwo);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}