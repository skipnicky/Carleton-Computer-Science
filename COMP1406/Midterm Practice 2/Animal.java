package comp1406m2;

public abstract class Animal{
  protected String name;
  protected int age;

  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){ return this.name; }
  public abstract String noise();

}
