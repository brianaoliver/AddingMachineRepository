package cse360assign2;
/**
 * 
 * @author brianaoliver
 * CSE360
 * assignment 2
 * This file contains the class AddingMachine, as well as its methods used to do calculations and 
 * document the history of changes on a variable integer.
 *
 */

/**
 * 
 *This class will serve as a calculator. It will be able to add, subtract, get values and document the histor y
 *of changes made to a total.
 */
public class AddingMachine {
	
	private int total;
	
	/**
	 * This serves as the constructor of the class. It will initialize the total to 0.
	 */
	public AddingMachine () {
		total = 0;// not needed - included for clarity
	}
	
	/**
	 * Get the current total after other functions have modified total. 
	 * @return total after being modified
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Function will add the parameter 'value' and the current total.
	 * @param value used to add to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Function will subtract the parameter and the current total.
	 * @param value used to subtract from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Function will keep track of the history of all changes made to total.
	 * return str a history documenting all changes made to total
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Delete the history of all changes made to total.
	 */
	public void clear() {
		
	}
	
}


