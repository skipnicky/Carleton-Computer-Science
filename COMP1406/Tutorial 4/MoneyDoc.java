package comp1406t4;

/** Tutorial 4 - Winter 2019
  * <p>
  * A class that mimics the Money class but without any working code
	* <p>
	*
	* @author Lily Inskip-Shesnicky
	* @version 1.0
  */

public class MoneyDoc{

	/* stores hidden state of object */
	private int dollars = -1;
	private int cents = -1;

	/**
	* Creates an object with zero dollars and zero cents
	*
	**/
	public MoneyDoc(){
		// create an object with zero dollars and cents.
	}

	/**
	* Creates an object with c cents
	*
	* @param c is int amount of cents
	**/
	public MoneyDoc(int c){
		// create an object with c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
	}

	/**
	* Creates an object with d dollars and c cents
	*
	* @param d is int amount of dollars
	*
	* @param c is int amount of cents
	**/
	public MoneyDoc(int d, int c){
		// create an object with d dollars and c cents
		// (adjusting dollars and cents so that 0<=cents<=99)
	}

	/**
	* Creates an object with total money passed in array
	*
	* @param coins is a 6 element array that corresponds to
	* <p>
	* {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
	* <p>
	* {$2, $1, $0.25, $0.10, $0.05, $0.01}
	**/
	public MoneyDoc(int[] coins){
		// input array has 6 elements and corresponds to
		// {#toonies, #loonies, #quarters, #dimes, #nickels, #pennies}
		// {$2, $1, $0.25, $0.10, $0.05, $0.01}
		// create an object with total money passed in array
		// (adjusting internal dollars and cents so that 0<=cents<=99)
	}

	/**
	* Adds c cents to the current value
	*
	* @param c is int amount of cents
	*
	**/
	public void add(int c){}
	// adds c cents to the current value
	// Again, be sure the internal states
	// does not have cents greater than 99

	/**
	* Adds d dollars and c cents to the current value
	*
	* @param d is int amount of dollars
	*
	* @param c is int amount of cents
	*
	**/
	public void add(int d, int c){}
	// adds d dollars and c cents to the current value
	// Again, be sure the internal states
	// does not have cents greater than 99

	/**
	* Removes c cents from the current amount of money,
	* if there is enough money to remove c cents.
	* Otherwise, removes as much as it can.
	*
	* @param c is int amount of cents
	* @return the actual amount removed.
	**/
	public int remove(int c){return -1;}
	// removes c cents from the current amount of money,
	// if there is enough money to remove c cents.
	// Otherwise, removes as much as it can.
	// Returns the actual amount removed.
	// Note: the input will satisfy c >= 0 (and it may be > 100).

	/**
	* Returns a String representation of the value of the current object.
	*
	* @return The value of the current object is returned as the <code>String</code>"$D.cc"
	* where D is the number of dollars and cc is the cents of the value.  Uses the <code>format()</code>
	* method from the <code>String</code> class to ensure that the cents are displayed properly (2 spaces
	* with leading zeros if needed).
	**/
	@Override
	public String toString(){
		return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
	}

}
