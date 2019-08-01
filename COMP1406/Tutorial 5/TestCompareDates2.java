package comp1406t5;

public class TestCompareDates2{

  public static void main(String[] args){
    Date d1 = new Date(2000,03,14);
    Date d2 = new Date(2000,02,06);
    Date d3 = new Date(2001,03,14);
    Date d4 = new Date(1999,05,05);
    Date d5 = new Date(1999,05,06);
    Date d6 = new Date(2000,05,06);

    System.out.println("COMPARE DATES");

    System.out.println("Should output: positive");
    int test1 = CompareDates.compare(d1, d2);
    System.out.println("Real "+ test1);
    System.out.println("Should output: negative");
    int test2 = CompareDates.compare(d2, d1);
    System.out.println("Real " + test2);
    System.out.println("Should output: 0");
    int test3 = CompareDates.compare(d3,d3);
    System.out.println("Real " + test3);
    int t = CompareDates.compare(d4,d5);
    System.out.println("Should output: negative");
    System.out.println("Real " + t);

    System.out.println("COMPARE DATES 2");
    System.out.println("I think this means it's outputting wrong pos/neg");
    System.out.println("Should output: positive");
    int test4 = CompareDates2.compare(d1, d2);
    System.out.println("Real "+ test4);
    System.out.println("Should output: negative");
    int test5 = CompareDates2.compare(d2, d1);
    System.out.println("Real " + test5);
    System.out.println("Should output: 0");
    int test6 = CompareDates2.compare(d3,d3);
    System.out.println("Real " + test6);
    int t2 = CompareDates2.compare(d4,d5);
    System.out.println("Should output: negative");
    System.out.println("Real " + t2);

    System.out.println("COMPARE DATES 3");
    System.out.println("I think this means it can't compare between years");
    System.out.println("Should output: positive");
    int test7 = CompareDates2.compare(d1, d2);
    System.out.println("Real "+ test7);
    System.out.println("Should output: negative");
    int test8 = CompareDates2.compare(d2, d1);
    System.out.println("Real " + test8);
    System.out.println("Should output: 0");
    int test9 = CompareDates2.compare(d3,d3);
    System.out.println("Real " + test9);
    int t3 = CompareDates3.compare(d4,d5);
    System.out.println("Should output: negative");
    System.out.println("Real " + t3);
    int t7 = CompareDates2.compare(d6,d5);
    System.out.println("Should output: negative");
    System.out.println("Real " + t7);

    System.out.println("COMPARE DATES 4");
    System.out.println("I think this means it can't compare between days");
    System.out.println("Should output: positive");
    int test10 = CompareDates2.compare(d1, d2);
    System.out.println("Real "+ test10);
    System.out.println("Should output: negative");
    int test11 = CompareDates2.compare(d2, d1);
    System.out.println("Real " + test11);
    System.out.println("Should output: 0");
    int test12 = CompareDates2.compare(d3,d3);
    System.out.println("Real " + test12);
    int t4 = CompareDates4.compare(d4,d5);
    System.out.println("Should output: negative");
    System.out.println("Real " + t4);
  }
}
