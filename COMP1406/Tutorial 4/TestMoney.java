package comp1406t4;

/* basic tester for Money class */

public class TestMoney{

  public static void main(String[] args){

    Money money;
    String actual,expected;

    System.out.print("        Money() test : ");
    money = new Money("empty");
    actual = money.toString();
    expected = money.getName() + ": $0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money("two args", 0,0);
    actual = money.toString();
    expected = money.getName() + ": $0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money("two args again", 12,7);
    actual = money.toString();
    expected = money.getName() + ": $12.07";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money("two args yet again", 3,4023);
    actual = money.toString();
    expected = money.getName() + ": $43.23";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int) test : ");
    money = new Money("one arg", 0);
    actual = money.toString();
    expected = money.getName() + ": $0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int) test : ");
    money = new Money("one arg again", 63);
    actual = money.toString();
    expected = money.getName() + ": $0.63";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int) test : ");
    money = new Money("one are yet again", 21387);
    actual = money.toString();
    expected = money.getName() + ": $213.87";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("   Money(int[]) test : ");
		int[] some_coinage = {3,0,5,1,3,3}; // $7.53
    money = new Money("array", some_coinage);
    actual = money.toString();
    expected = money.getName() + ": $7.53";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.println(" ");
    System.out.println("TESTING ADD & REMOVE");
    money = new Money("new money one",250);
    actual = money.toString();
    System.out.println("Original $: " +actual);

    money.add(150);
    actual = money.toString();
    System.out.println("Adding 150 cents: " + actual);

    money.add(3,46);
    actual = money.toString();
    System.out.println("Adding 3 dollars and 46 cents: " + actual);

    money.remove(6);
    actual = money.toString();
    System.out.println("Removing 6 cents: " + actual);

    money.remove(100);
    actual = money.toString();
    System.out.println("Removing 100 cents: " + actual);

    int amount = money.remove(650);
    actual = money.toString();
    System.out.println("Removing 650 cents: " + actual);
    System.out.println("Amount removed: " + amount);

    money = new Money("new money two",500);
    actual = money.toString();
    System.out.println("Original $: " + actual);

    amount = money.remove(150);
    actual = money.toString();
    System.out.println("Removing 150 cents: " + actual);
    System.out.println("Amount removed: " + amount);

  }
}
