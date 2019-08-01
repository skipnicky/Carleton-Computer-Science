package comp1406m3;

public class PersonSample extends Person implements Comparable<PersonSample>{

  public static void main(String[] args){
    PersonSample p1 = new PersonSample("Lily", 18, "Ottawa");
    PersonSample p2 = new PersonSample("Kyle", 18, "Ottawa");
    PersonSample p3 = new PersonSample("Jack", 14, "Ottawa");

    System.out.println(p1.compareTo(p2));
    System.out.println(p1.compareTo(p3));
  }
  public PersonSample(String name, int age, String birthCity){
    super(name, age, birthCity);
  }

  @Override
  public int compareTo(PersonSample o){
    if(this.age > o.age){
      return 1;
    }

    if(this.age < o.age){
      return -1;
    }

    if(this.age == o.age){
      if(this.name.length() > o.name.length()){
        return 1;
      }else if(this.name.length() < o.name.length()){
        return -1;
      }
    }

    return 0;
  }
}
