public class Smoothing{
  public static void main(String[] args){
    double[] test;

    test = new double[]{0.0,5.0,0.0,5.0};
    Smoothing.testSmooth(test);

    test = new double[]{0.0,5.0,5.0,0.0};
    Smoothing.testSmooth(test);

    test = new double[]{0.0};
    Smoothing.testSmooth(test);

    test = new double[]{0.0,1.0};
    Smoothing.testSmooth(test);

    test = new double[]{2.0,3.0,1.0,5.0};
    Smoothing.testSmooth(test);

    test = null;
    Smoothing.testSmooth(test);
  }
  private static void testSmooth(double[] a){
    if(a == null){
      System.out.println("Not a valid value, null, for the method testSmooth.");
      return;
    }

    System.out.print("Running testSmooth on:");
    printArray(a);
    smooth(a);
    System.out.print("After smoothing ");
    printArray(a);
  }

  private static void printArray(double[] a){
    if(a.length == 0){
      System.out.println("[]");
    }else{
      System.out.print("[");
      for(int i = 0; i < a.length; i++){
        if(i==0){
          System.out.print(a[0]);
        }else{
          System.out.print(","+ a[i]);
        }
      }
      System.out.println("]");
    }
  }

  public static void smooth(double[] a){
    double[] copy = new double[a.length];

    for(int i = 0; i<a.length; i++){
      copy[i] = a[i];
    }

    if(a.length == 0){
      ;
    }else if(a.length == 1){
      ;
    }else if(a.length == 2){
      double average = (copy[0] + copy[1])/2;
      a[0] = average;
      a[1] = average;
    }else{
      for(int i = 0; i<a.length;i++){
        if(i==0){
          a[0] = (copy[0] + copy[1])/2;
        }else if(i == a.length-1){
          a[a.length-1] = (copy[a.length-1] + copy[a.length-2]+ copy[a.length-3])/3;
        }else{
          a[i]= (copy[i]+copy[i+1]+copy[i-1])/3;
        }
      }
    }
  }
}
