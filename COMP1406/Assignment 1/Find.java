package comp1406a1;

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
public class Find{

  /** Finds the last occurrence of the sequence in the array or indicates that
    * the sequence is not present.
    *
    * @param sequence is an array of one or more integers.
    *        It is the target sequence we are looking for.
    *
    * @param array is an array integers.
    *
    * @return the starting position of the last occurrence of the target sequence in the
    *         array if it exists. Returns -1 otherwise.
    */

  public static int locateSequence(int[] sequence, int[] array){
    int idx = -1;
    int arrLen = array.length;
    int seqLen = sequence.length;
    if (seqLen == 0 || arrLen < seqLen){
      return idx;
    }
    for(int i = 0; i+seqLen-1<arrLen;i++){
      //System.out.println(i+seqLen-1);
      //System.out.println(arrLen);
      for(int j=0;i+j<arrLen;j++){
        if(!(array[i+j]==sequence[j])){
          break;
        }
        if(j==seqLen-1){
          idx=i;
          break;
        }
      }
    }
    return idx;
}

  public static void main(String[] args){
    int output = 0;
    int[] seq = {1,2,3,4,5};
    int[] arr = {9,4,5,6,1,2,3};
    output = locateSequence(seq,arr);
    //System.out.println(output);
  }
}
