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
	private String str;
	private boolean flag = true;
	
	/**
	 * This serves as the constructor of the class. It will initialize the total to 0.
	 */
	public AddingMachine () {
		total = 0;// not needed - included for clarity
		str = "";
	}
	
	/**
	 * Get the current total after other functions have modified total. 
	 * @return total after being modified
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Function will add the parameter 'value' and the current total.
	 * @param value used to add to the total
	 */
	public void add (int value) {
		total = total + value;
		str += " + " + value;
	}
	
	/**
	 * Function will subtract the parameter and the current total.
	 * @param value used to subtract from the total
	 */
	public void subtract (int value) {
		total = total - value;
		str += " - " + value;
	}
	
	/**
	 * Function will keep track of the history of all changes made to total.
	 * return str a history documenting all changes made to total
	 */
	public String toString () {
		if(flag == true) {//flag will only be true once, when the string has not been printed at all
			str = "0" + str;
			flag = false;
		}
		return str;
	}
	
	/**
	 * Delete the history of all changes made to total.
	 */
	public void clear() {
		str = "";
	}
	
	
	public static void main(String[] args) {
		AddingMachine myMachine = new AddingMachine();
		myMachine.add(4);
		myMachine.subtract(2);
		myMachine.add(5);
		int total = myMachine.getTotal();
		System.out.println("The total is " + total);
		System.out.println(myMachine.toString());
		myMachine.add(7);
		System.out.println(myMachine.toString());
		myMachine.subtract(1);
		total = myMachine.getTotal();
		System.out.println(myMachine.toString());
		System.out.println("The total is " + total);
		myMachine.clear();
		System.out.println(myMachine.toString());
	}
	
}




