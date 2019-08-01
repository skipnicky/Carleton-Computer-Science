package comp1406m1;

public class Round{
  public static double[] round(double[] nums, double bound){
    int counter = 0;
    for(int n = 0; n<nums.length; n++){
      double cur = nums[n];
      //ternary if statement 
      double r = (cur>0)? 0.5:-0.5;
      nums[n] = (int) (nums[n]+r);
      if(cur>bound){counter++;}
    }
    double[] newArr = new double[counter];
    int idx = 0;
    for(int n = 0; n<nums.length; n++){
      if(nums[n]>bound){
        newArr[idx] = nums[n];
        idx++;
      }
    }
    return newArr;
  }

  public static void main(String[] args){
    double[] list = {4.5,-3.9,9.3};
    double[] neww = round(list, 2);
    for(double d: neww){
      System.out.println(d);
    }
  }
}
