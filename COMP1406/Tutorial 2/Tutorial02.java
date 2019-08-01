package comp1406t2;
import java.util.Random;
import java.util.Arrays;
/* how to compile within same package
in cmd: javac -d . directory/MainClass.java
				javac -d . directory/OtherClass.java
				java directory.MainClass
*/
public class Tutorial02 {

	// an array of strings to use
	public static String[] words = {"cat", "dog", "eel", "owl", "fox", "kitten", "puppy", "elver", "owlet", "kit"};

	public static void strings(){
		//base case for length of str
		String longest = "";
		//to keep track of all characters
		int chars = 0;

		//for loop to iterate through array
		for(int i=0; i<words.length;i++){
			/*.substring(startIdx,endIdx) returns new String object containing the
			substring of given string from specified start to end.
			startIdx = inclusive, endIdx = exclusive
			for each word in array, make substring of first char and convert to upperCase
			then add the rest of the string
			*/
			String output = words[i].substring(0,1).toUpperCase() + words[i].substring(1);

			//assign length to single variable
			int len = output.length();
			//add char from current word to continued amount of chars
			chars += len;
			//print statement
			System.out.println(output+" is "+len+" letters long.");
			//if the length of the word is greater than current longest
			if(len>longest.length()){
				//set new longest word to current
				longest = output;
			}
		}
		//printing final calculations
		System.out.println("The longest word is "+longest.toUpperCase()+".");
		System.out.println("There were "+chars+" characters in total.");
	}

	public static void rollRandomDice(long seed){
		//array to hold summed values (pos 0 to 10 for 11 possibilities)
		//sum will never = 1
		int[] faces = new int[11];

		//set random die
		Random die1 = new Random();
		Random die2 = new Random();
		//die1.setSeed(seed);
		//die2.setSeed(seed+1);

		//for loop counter up to 10000 times
		for(int i=0;i<10001;i++){
			//use nextInt to get pseudorandom number between 1 and 6
			// (technically is from 0 to 5 because it's exclusive)
			int roll1 = die1.nextInt(6)+1;
			int roll2 = die2.nextInt(6)+1;

			//sum of the two dies
			int total = roll1 + roll2;
			//subtract 2 for correct idx pos of #, add 1
			//	when it's 2 should go in pos 0 (2-2)
			//	when it's 3 should go in pos 1 (3-2), and so on
			faces[total-2]+=1;
		}
		//print out array using Arrays import method
		System.out.println(Arrays.toString(faces));
		}


	public static void testPoint2D(){
		//create points using Point2D methods/attributes
		Point2D p = new Point2D();
		Point2D p2 = new Point2D();
		p.x = 1.2;
		p.y = 2.6;
		p2.x = 1;
		p2.y = 2;
		p.magnitude();
		double dist = p.distance(p2);
		System.out.print( "magnitude of point ");
	  System.out.print(p.toString() );
		System.out.println( " is " + p.magnitude() );
		System.out.println("The distance from point 1 "+p.toString()+" to point 2 "+p2.toString()+" is "+dist);
	}

	public static void main(String[] args){
		//call fcns in main
		strings();
		System.out.println(" ");
		rollRandomDice(17);
		System.out.println(" ");
		testPoint2D();

	}

}
