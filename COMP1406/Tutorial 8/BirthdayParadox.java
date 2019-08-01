package comp1406t8;

import java.util.HashSet;
import java.util.Random;

public class BirthdayParadox{

	static int[] RANGES = {10, 365, 10000, 100000, Integer.MAX_VALUE};

	public static void main(String[] args){
		//output size of range
		//number of numbers needed to find repeated one
		//that number squared

		int rnd = new Random().nextInt(RANGES.length);
		Random rand = new Random();
		int usedRange = 365;
		System.out.println("RANGE USED " + usedRange);
		int breakNum = 0;
		int counter = 0;

		HashSet<Integer> set = new HashSet<Integer>();
		System.out.print("making collections... ");
		for(int i=0; i<usedRange; i+=1){
			breakNum = i;
			counter++;
			if(!set.add(rand.nextInt(usedRange))){
				break;
			}else{
				set.add(rand.nextInt(usedRange));
			}

		}
		System.out.println("done!");
		//System.out.println("Collision num: " + breakNum);
		System.out.println("Numbers used: " + counter);
		int numsquare = counter*counter;
		System.out.println("That number squared: " +  numsquare);

		//for 365 is roughly always in the range of having 20 ppl before getting matching bday
		/*
		in a set of n randomly chosen people,
		some pair of them will have the same birthday.
		By the pigeonhole principle, the probability reaches 100%
		 when the number of people reaches 367
		 (since there are only 366 possible birthdays, including February 29).
		 However, 99.9% probability is reached with just 70 people,
		 and 50% probability with 23 people.
		 These conclusions are based on the assumption that each day of the year
		 (excluding February 29) is equally probable for a birthday.*/
	}
}
