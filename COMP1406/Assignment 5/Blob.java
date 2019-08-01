package comp1406a5;

public class Blob extends Image{

  // leave this constructor as is. This is the constructor that we will  use
	// when testing your code.
	public Blob(int rows, int cols){
		super(rows, cols);
	}




	/* modifies every pixel in specified blob to update side attribute
		will store number of pixels touching that DO NOT have ink */
  public void computePixelPerimeters(int row, int column){

		//if no ink then it's not part of the blob
		if(!pixels[row][column].hasInk){ return; }

		pixels[row][column].visited = true;
		//go to all adjacent pixels
		pixels[row][column].sides = hm(row + 1, column, 0) + hm(row - 1, column, 0) +
																hm(row, column + 1, 0) + hm(row, column - 1, 0);
	}


	//type perameter is just checking if you need to work
	// with perameter or with computePixelPerimeters

	//works because when you recursivley call the fcns
	// you're adding or subtracting the cur value
	// so as to move on to the next blob part

	private int hm(int i, int j, int type){

		//if the next row/col is off the board...
		if(i >= rows || i < 0 || j >= cols || j < 0){ return 0; }
		//if adjacent pixel has ink ...
		if(pixels[i][j].hasInk){
			//if adjacent pixel has not been visited
			if(!pixels[i][j].visited){
				if(type == 1){
					//returning the perimeter --> this computes for all the individual pixels
					//so in activation record stack --> have perimeter of all indv pixels
					// THEN the final return adds up all the ones
					return perimeter(i, j);
				}
				computePixelPerimeters(i,j);
			}
			//can return 0
			return 0;
		}
		//otherwise it does not have ink so you can return 1
		return 1;
	}

	//compute the perimeter of the entire blob that has pixel at the pos (row, col)
  public int perimeter(int row, int column){
		if(pixels[row][column].visited()) { clearImage(); }

		if(!pixels[row][column].hasInk){ return 0; }

		pixels[row][column].visited = true;

		return hm(row + 1, column, 1) + hm(row - 1, column, 1) + hm(row, column + 1, 1) +
				   hm(row, column -1, 1);
	}

	public static void main(String[] args){
		// for testing...
	  Image img = Helper.makeRandomImage(20,80,0.35);
		
	}


}
