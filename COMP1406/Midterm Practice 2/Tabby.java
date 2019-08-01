package comp1406m2;
import java.util.Random;

public class Tabby extends Cat{

    /*public static void main(String[] args){
      Animal aristocat = new Tabby("Alex",2000);
      System.out.println(aristocat.noise());
    }*/

    //overriding noise method
    public String noise(){
      String noise1 = "prrr";
      String noise2 = "meow";
      String noise3 = "hiss";

      String[] noises = {noise1, noise2,noise3};
      Random random = new Random();
      int idx = random.nextInt(noises.length);
      return(noises[idx]);
    }

    //cat constructor
    public Tabby(String name, int year){
      super(name, year);
    }
  }
