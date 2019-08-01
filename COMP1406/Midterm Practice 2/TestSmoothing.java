public class TestSmoothing{

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

}
