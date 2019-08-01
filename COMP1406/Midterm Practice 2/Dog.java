package comp1406m2;
import java.util.Random;

public class Dog extends Animal{

  /*public static void main(String[] args){
    Animal doggie = new Dog("Disney",2009);
    System.out.println(doggie.noise());
  }*/

  //overriding noise method
  public String noise(){
    String noise1 = "grrr";
    String noise2 = "woof";

    String[] noises = {noise1, noise2};
    Random random = new Random();
    int idx = random.nextInt(noises.length);
    return(noises[idx]);
  }

  //dog constructor
  public Dog(String name, int year){
    super(name, year);
  }
}
