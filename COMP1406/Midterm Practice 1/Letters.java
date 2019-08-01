public class Letters{
  public static void main(String[] args){
    String str = "hello";
    String str2 = "h3llo";
    boolean strTest = isAlpha(str);
    boolean strTest2 = isAlpha(str2);
    System.out.println("1 "+strTest+" 2 "+strTest2);
  }

  public static boolean isAlpha(String name){
    char[] chars = name.toCharArray();

    for (char c: chars){
      if(!Character.isLetter(c)){
        return false;
      }
    }
    return true;
  }
}
