public class Test{
public static void main(String[] args){
  double[] a = {2.0,3.0,1.0,5.0};
  double[] copy = new double[a.length];

  for(int i = 0; i<a.length; i++){
    copy[i] = a[i];
  }

  if(a.length == 0){
    ;
  }else{
    for(int i = 0; i<a.length;i++){
      if(i==0){
        a[0] = (copy[0] + copy[1])/2;
      }else if(i == a.length-1){
        a[a.length-1] = (copy[a.length-1] + copy[a.length-2]+ copy[a.length-3])/3;
      }else{
        a[i]= (copy[i]+copy[i+1]+copy[i-1])/3;
      }
    }
  }

  if(a.length == 0){
    System.out.println("[]");
  }else{
    System.out.print("[");
    for(int i = 0; i < a.length; i++){
      if(i==0){
        System.out.print(a[0]);
      }else{
        System.out.print(","+ a[i]);
      }
    }
    System.out.print("]");
  }
}

}
