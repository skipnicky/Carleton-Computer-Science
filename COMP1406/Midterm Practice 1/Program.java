package comp1406m1;

public class Program{
  public static void main(String[] args){
    WordCheck checker = new WordCheck();
    for(int n = args.length - 1; n>=0; n--){
      String cur = args[n];
      if(checker.isWord(cur) == true){
        String cap = cur.substring(0,1).toUpperCase() + cur.substring(1);
        System.out.println(cap);
      }else{System.out.println(cur);}
    }
  }
}
