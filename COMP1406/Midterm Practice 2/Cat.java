package comp1406m2;

public class Cat extends Animal {

  protected int lives;

  public static void main(String[] args){
    Cat Jasper = new Cat("Jasper",1,3);
    System.out.println(Jasper.getName());
    System.out.println(Jasper.getLives());
    System.out.println(Jasper.noise());
    Jasper = new Cat("Jasper",2);
    System.out.println(Jasper.getName());
    System.out.println(Jasper.getLives());
    System.out.println(Jasper.noise());

  }

  public Cat(String name, int age, int lives){
  		super(name, age);
  		this.lives = lives;
  }

  public Cat(String name, int age){
  	this(name, age, 9);
  }

  public int getLives(){
  	return this.lives;
  }

  public String noise(){
    String ret = "";
    for(int i = 0; i < this.lives; i++){
      ret += "meow ";
    }
    return ret;
  }
}
