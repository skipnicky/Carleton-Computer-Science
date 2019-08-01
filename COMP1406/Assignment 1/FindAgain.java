package comp1406a1;
//import java.util.Arrays;
/** Assignment 1 - Winter 2019
  * <p>
  * Problem 1
  * <p>
  * In the provided Find.java file, complete the locateSequence method.
  * For a given target sequence (non-empty array of integers), the method
  * searches the input array (of integers) to find an occurrence of the
  * target sequence if it is present. If the sequence is present, the
  * method returns the array index position of where it starts in the array.
  * If the sequence is not present, the method returns -1.
  */
public class FindAgain{

  /** Finds the last occurrence of the sequence in the array or indicates that
    * the sequence is not present.
    *
    * @param target is an array of one or more integers.
    *        It is the target sequence we are looking for.
    *
    * @param array is an array of integers.
    *
    * @return the starting position of the last occurrence of the target sequence in the
    *         array if it exists. Returns -1 otherwise.
    */

  public static int[] locateAllSequenceLocations(int[] target, int[] array){
    int idx = -1;
    int arrayLen = 0;
    int count = 1;
    int arrLen = array.length;
    int seqLen = target.length;

    if (seqLen == 0 || arrLen < seqLen){
      int[] nullArray = {0};
      return nullArray;
    }
    for(int i = 0; i+seqLen-1<arrLen;i++){
      for(int j=0;i+j<arrLen;j++){
        if(!(array[i+j]==target[j])){
          break;
        }
        if(j==seqLen-1){
          arrayLen ++;
          break;
        }
      }
    }
    int[] finalArray = new int[arrayLen+1];
    finalArray[0] = arrayLen;
    for(int i = 0; i+seqLen-1<arrLen;i++){
      for(int j = 0; i+j<arrLen;j++){
        if(!(array[i+j]==target[j])){
          break;
        }
        if(j==seqLen-1){
          finalArray[count] = i;
          count ++;
          break;
        }
      }
    }
    //System.out.println(Arrays.toString(finalArray));
    return finalArray;
}

  public static void main(String[] args){
    int[] seq = {1,0,1,1};
    int[] arr = {9,4,1,0,1,0,3,5,6,1,0,1,1,0,1,1,2,3};
    int[] output = locateAllSequenceLocations(seq,arr);
    //System.out.println(Arrays.toString(output));
  }
}
