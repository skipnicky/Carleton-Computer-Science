package comp1406m1;

public class Student{
  //attributes
  private String name;
  private int id;
  private double[] grades;

  //constructor
  public Student(String name, int id, double[] grades){
    this.name = name;
    this.id = id;
    this.grades = grades;
  }
  public String toString(){
    return "Student name: "+this.name+" Student ID: " + this.id;
  }

  public static void main(String[] args){
    double[] x = {56.0,34.09};
    Student me = new Student("Lily",10115505,x);
    System.out.println(me.toString());
  }
}
