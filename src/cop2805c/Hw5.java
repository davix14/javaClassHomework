/**
 * 
 */
package cop2805c;

import java.util.*;

/**
 * @author Jose David Juarez
 *
 */
public class Hw5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiate new scanner obj and int var
		int input;
		Scanner scnr = new Scanner(System.in);
		
		// prompt user to enter string
		System.out.println("Please enter a number:");
		
		// scan string entered
		input = scnr.nextInt();
		
		// call getFactors method and pass input
		printList(getFactors(input));
		
		// call getSmallestFactors and print results
		printList(getSmallestFactors(input, getFactors(input)));
		
		// close scanners
		scnr.close();
	}
	
	//  create method that returns a List of all
	//	factors for a given variable
	public static List<Integer> getFactors(int in) {
		List<Integer> factors = new ArrayList<Integer>();
		
		// add 1 because it will always be a factor of anything
		factors.add(1);
		
		// for loop for finding and adding the 
		for(int i = 2; i <= in; i++) {
			if(in % i == 0)
				factors.add(i);
		}
		
		return factors;
	}
	
	// create method that returns the list of the smallest factors
	public static List<Integer> getSmallestFactors (int n, List<Integer> input) {
		List<Integer> smallest = new ArrayList<Integer>();
		boolean nextDivFound;
		
		while(n != 1) {
			int i = 1;
			nextDivFound = false;
			while(nextDivFound == false) {
				if(n % input.get(i) == 0) {
					nextDivFound = true;
					smallest.add(input.get(i));
					n = n / input.get(i);
				} else
					i++;
			}
		}
		
		return smallest;
	}

	// create method for printing lists to console
	public static void printList(List<Integer> input) {
		for(int i=0; i < input.size(); i++) {
			System.out.printf("%d ", input.get(i));
		}
		System.out.println("");
	}
	
}
