package comp1406m2;

public class TestParent{
  Parent childer1 = new Child1();
  Parent childer2 = new Child2();

  public static void main(String[] args){
    childer1.message();
    childer2.message();
  }
}
