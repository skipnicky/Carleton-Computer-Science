package comp1406m1;

public class WordCheck{
  public boolean isWord(String s){
    char[] chars = s.toCharArray();
    for(char c: chars){
      if(!Character.isLetter(c)){
        return false;
      }
    }
    return true;
  }
}
