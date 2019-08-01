package comp1406t5;

/** A tester for the FutureDate class */
public class TestCompareDates{

	/** Execute a single test case
	  *
		* @param d1 is a date
		* @param d2 is a date
		* @param compare is the expected output of compare(d1,d2)
		* @param version is the version of code to test (1,2,3,4)
		* @return true if the compare(d1,d2) == compare
    */
	public static boolean test(Date d1, Date d2, int compare, int version){
		boolean pass = false;
		switch(version){
		case 0:
		case 1:
			pass = CompareDates.compare(d1,d2) == compare;
			System.out.println("compare(" + d1 + " , " + d2 + ") = "
			+ String.format("%2d", CompareDates.compare(d1,d2)) + "  expected "
			+ String.format("%2d", compare) + "  " + (pass?"passed":"failed") );
			break;
		case 2:
			pass = CompareDates2.compare(d1,d2) == compare;
			System.out.println("compare(" + d1 + " , " + d2 + ") = "
			+ String.format("%2d", CompareDates2.compare(d1,d2)) + "  expected "
			+ String.format("%2d", compare) + "  " + (pass?"passed":"failed") );
			break;
		case 3:
			pass = CompareDates3.compare(d1,d2) == compare;
			System.out.println("compare(" + d1 + " , " + d2 + ") = "
			+ String.format("%2d", CompareDates3.compare(d1,d2)) + "  expected "
			+ String.format("%2d", compare) + "  " + (pass?"passed":"failed") );
			break;
		case 4:
			pass = CompareDates4.compare(d1,d2) == compare;
			System.out.println("compare(" + d1 + " , " + d2 + ") = "
			+ String.format("%2d", CompareDates4.compare(d1,d2)) + "  expected "
			+ String.format("%2d", compare) + "  " + (pass?"passed":"failed") );
			break;
		}
		return pass;
	}

	public static void main(String[] args){
		// test CompareDates
		int version = 1;
		test( new Date(2019, 01, 12), new Date(2019, 01, 12), 0, version);

		// test CompareDates2 (buggy version)
		version = 2;
		test( new Date(2019, 01, 12), new Date(2019, 01, 12), 0, version);


	}
}
