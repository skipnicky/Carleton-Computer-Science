package comp1406m2;

public class animalTest {
  public static void main(String[] args){
    /*if(args != null){
      Animal[] animal_list = new Animal[Integer.parseInt(args[0])];
    }*/

    Cat Jasper = new Cat("Jasper",1,9);
    Dog Disney = new Dog("Disney",2005);
    Animal[] animal_list = {};

    Animal loudest = null;
    int longest = 0;
    for(int i = 0; i < animal_list.length; i++){
      int n = animal_list[i].noise().length();
      if(n > longest){
        longest = n;
        loudest = animal_list[i];
      }
    }
    if(loudest != null){
      if(loudest instanceof Cat){
        System.out.println(loudest.getName());
        System.out.println(loudest.getLives());
      }else{
        System.out.println(loudest.getName());
      }
    }
  }
}
