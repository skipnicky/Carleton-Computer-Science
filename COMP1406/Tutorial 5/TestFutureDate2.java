package comp1406t5;

public class TestFutureDate2{
  public static void main(String[] args){
    System.out.println("TESTING FUTURE DATE 1");
    FutureDate d1 = new FutureDate(2000,03,14);
    FutureDate2 d2 = new FutureDate2(2000,02,06);
    FutureDate d3 = new FutureDate(2019,02,28);
    FutureDate d4 = new FutureDate2(2000,03,14);

    FutureDate newDate = d1.futureDate(7);
    System.out.println("should be 2000/03/21 " + newDate);
    FutureDate newDate2 = d3.futureDate(1);
    System.out.println("Should be 2019/03/01 " + newDate2);

    System.out.println("TESTING FUTURE DATE 2");
    FutureDate2 newDate3 = d4.futureDate2(7);
    System.out.println("should be 2000/03/21 " + newDate3);
    FutureDate2 newDate4 = d2.futurefDate2(1);
    System.out.println("Should be 2019/03/01 " + newDate4);
  }
}
