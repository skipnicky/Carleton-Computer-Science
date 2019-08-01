package comp1406a1;
//import java.util.Arrays;
/** Assignment 1 - Winter 2019
  * <p>
  * Problem 4
  * <p>
  * In this problem, you will complete three methods to check if a SUDOKU game is valid or not.
  */
  public class SudokuChecker{

  	/** checks if row 'row' is OK in the grid */
    public static boolean checkRow(int row, byte[][] grid){
      return singleArray(grid[row]);
    }
    public static boolean singleArray(byte[] arr){
      //uses array of length 9
      //[1,3,2,4,5,6,9,7,8]
      int N = arr.length;
      //1 to 9
      int satisfied=0;
      for(byte i=1;i<=N;i++){
        for(byte b:arr){
          if (b ==i){
            satisfied++;
            break;
          }
        }
      }
      return (satisfied == N);
    }
    public boolean singleArraysort(byte[] arr){
      //uses array of length 9
      //[1,3,2,4,5,6,9,7,8]
      int N = arr.length;
      //need sort function
      byte[] sorted = sort(arr);
      for(byte i=0;i<N;i++){
        if (i+1!=arr[i]){return false;}
      }
      return true;
    }
    public byte[] sort(byte[] arr){
      return arr;
    }
  	/** checks if column 'col' is OK in the grid */
    public static boolean checkColumn(int col, byte[][] grid){
      byte[] arr = new byte[grid.length];
      for(int i=0;i<grid.length;i++){
        arr[i] = grid[i][col];
      }
    //  System.out.println(Arrays.toString(arr));
      return singleArray(arr);
    }

  	/** checks if the subregion 'region' is OK in the grid */
    public static boolean checkSubregion(int region, byte[][] grid){
      //assume 9x9 grid
      //column in a 3x3 representation
      int col = region%3;
      //row in a 3x3 representation
      int row = region/3;
      int n=0;
      //new array of size grid length
        //grid length will = # in subregion
      byte[] arr = new byte[grid.length];
      //3n, 3n+1
      for(int i=3*row;i<3*(row+1);i++){
        for (int j=3*col;j<3*(col+1);j++){
          //set pos in array to the # at row and col
          arr[n] = grid[i][j];
          n++;
        }
      }
      return singleArray(arr);
    }

    public static boolean check(byte[][] grid){
      // check the subregions
      for(int subregion=0; subregion<9; subregion+=1){
        System.out.println(subregion);
        if( !checkSubregion(subregion, grid) ){
          return false;
        }
      }

      // check the rows
      for(int row=0; row<9; row+=1){
        if( !checkRow(row, grid) ){
          return false;
        }
      }

     // check the rows
     for(int col=0; col<9; col+=1){
        if( !checkColumn(col, grid) ){
          return false;
        }
      }


  		// if we get this far then we conclude that the grid
  		// must be valid (because if it was not, we would have
  		// returned false somewhere above)
      return true;
    }



    public static void main(String[] args){

      System.out.print("exmample1 | expected output is true  | actual output is ");
      System.out.println(check(example1));

      System.out.print("exmample2 | expected output is false | actual output is ");
      System.out.println(check(example2));

    }


      /** sample valid game */
    public static byte[][] example1 = new byte[][]{
      {5,3,4,6,7,8,9,1,2},
      {6,7,2,1,9,5,3,4,8},
      {1,9,8,3,4,2,5,6,7},
      {8,5,9,7,6,1,4,2,3},
      {4,2,6,8,5,3,7,9,1},
      {7,1,3,9,2,4,8,5,6},
      {9,6,1,5,3,7,2,8,4},
      {2,8,7,4,1,9,6,3,5},
      {3,4,5,2,8,6,1,7,9}};

    /** sample invalid game */
    public static byte[][] example2 = new byte[][]{
      {0,1,0,1,0,1,0,1,0},
      {6,7,2,1,9,5,3,4,8},
      {1,9,8,3,4,2,5,6,7},
      {8,5,9,7,6,1,4,2,3},
      {4,2,6,8,5,3,7,9,1},
      {7,1,3,9,2,4,8,5,6},
      {9,6,1,5,3,7,2,8,3},
      {2,8,7,4,1,9,6,2,6},
      {3,4,5,2,8,6,1,8,8}};

  }
