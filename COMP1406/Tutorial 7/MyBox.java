package comp1406t7;

public class MyBox extends Box{

  public MyBox(String inside){
    super(inside);
  }

  @Override
  public String toString(){
    return(this.getInside());
  }

  public int lexi(String str1, String str2){
    int ret = 0;

    for(int i = 0; i < str1.length() && i < str2.length(); i++){
      if(str1.charAt(i) != str2.charAt(i)){
        ret = (int)str1.charAt(i) - (int)str2.charAt(i);
        break;
      }
    }
    return ret;
  }

  @Override
  public int compareTo(Box b){
    String bIn = b.getInside();
    int bLen = bIn.length();
    String tIn = this.getInside();
    int tLen = tIn.length();
    int ret = 0;

    if(bLen == tLen){
      ret = lexi(tIn, bIn);
    }else{
      ret = (tLen > bLen) ? 1:-1;
    }
    return ret;
  }
}
