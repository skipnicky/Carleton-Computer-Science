package comp1406a3;

public class TestFind{

//	public static void main(String[] args){FindTestCase[] idc =makeTestCases();}
	/** Generate test cases for the (modified) Find class.
		* @return an array of test cases for the (modified) Find class.
		*/
	public static FindTestCase[] makeTestCases(){
		int[][][] cases = {
			{{1,2,3,4,5,6},{3,4,5}},
			{{1,3,5,2,4,1,3,5},{1,3,5}},
			{{1,4,2,4,4,7,3,4},{7,3,4}},
			{{},{7,3,4}},
			{{1,2},{7,3,4}},
			{{7,3,4},{7,3,4}},
			{{},{2}},
			{{2,2,2,2,2,2},{2}},
			{{2},{2}},
			{{1,2,3,4,5,6,7},{1,4}},
			{{1,2,3,4,5,6,7},{1,2,3,4,5,6,7,8}},
			{{2220},{22}}
		};
		FindTestCase[] retcases = new FindTestCase[cases.length];
		for(int i=0;i<cases.length;i++){
			int[] a = cases[i][1];
			int[] b = cases[i][0];
			retcases[i] = new FindTestCase(a,b,Find.locateSequence(a,b),Find.locateAllSequenceLocations(a,b));
		}
	/*	for(FindTestCase c: retcases){
			System.out.print(c.expectedFind+" |");
			for(int x: c.expectedFindAgain){System.out.print(x+" ");}
			System.out.println();
		}*/
		return retcases;
	}

}
