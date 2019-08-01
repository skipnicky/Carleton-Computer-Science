package comp1406m2;

import java.time.ZonedDateTime;  // used for obtaining the current year
import java.time.ZoneId;         // used for setting time zone

public class Owl extends Animal {
  boolean wiseness;

  /*public static void main(String[] args){
    Animal owllie = new Owl("Hoo",1600,false);
    System.out.println(owllie.noise());
    System.out.println(owllie.toString());
  }*/

  //override noise method
  public String noise(){
    return("hoot");
  }

  //owl constructor
  public Owl(String name, int year, boolean wise){
    super(name, year);
    this.wiseness = wise;

  }


  //overriding toString method
  /*@Override
	public String toString(){
		//int currYear = ZonedDateTime.now( ZoneId.of("America/Montreal")).getYear();
		//int animalAge = currYear - this.birthYear;
    String tf = "a wise";
    if(this.wiseness == false){
      tf = "not a wise";
    }

		return(super.toString() + " It is "
            + tf + " owl.");
	}*/
}
