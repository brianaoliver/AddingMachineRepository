package cse360assign2;
/**
 * 
 * @author Briana Oliver
 * Class ID: CSE360 70641
 * CSE360 assignment 2
 * This file contains the class AddingMachine, as well as its methods used to do calculations and 
 * document the history of changes on a variable integer.
 *
 */

/**
 * 
 *This class will serve as a calculator. It will be able to add, subtract, get values and document the history
 *of changes made to a total.
 */
public class AddingMachine {
	
	private int total;
	private String history;
	
	/**
	 * This serves as the constructor of the class. It will initialize the total to 0, and the history 
	 * string will have be intialized to 0.
	 */
	public AddingMachine () {
		total = 0;// not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Get the current total after other functions have modified total. 
	 * @return total after being modified
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The method will add the parameter 'value' and the current total, as well as
	 * construct the history string to keep it updated.
	 * @param value used to add to the total
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	
	/**
	 * Function will subtract the parameter from the current total and will continue to add to the history
	 * string accordingly.
	 * @param value used to subtract from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	
	/**
	 * Function will keep track of the history of all changes made to total.
	 * return history a history documenting all changes made to total
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Delete the history of all changes made to total and reset history string to 0.
	 */
	public void clear() {
		history = "0";
		total = 0;
	}	
}




