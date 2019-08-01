package comp1406t7;

public class Lexi{


  public static void main(String[] args){
    String cat = "cat";
    String cow = "cow";

    for(int i = 0; i < cat.length() && i < cow.length(); i++){
      if(cat.charAt(i) != cow.charAt(i)){
        System.out.println(cat.charAt(i) + " " + cow.charAt(i));
        System.out.println((int)cat.charAt(i) - (int)cow.charAt(i));
      }
    }
  }

}
