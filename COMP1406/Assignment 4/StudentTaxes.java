package comp1406a4;
import java.lang.Math;

/**
 * A class to calculate the amount of taxes owed by a student
 *
 * COMP 1406
 * Winter 2019
 * Assignment 4
 */

public class StudentTaxes extends Taxes{
  //attributes
  //-- that are not included in abstract class
  protected double income;
  protected double tuition;

  /** Initializes StudentTaxes object with specificed values
   *
   * Usage: new StudentTaxes(Lily, 101155, 100000,80000)
   *
   * @param name String name of student being created.
   * @param sin int value of their social insurance number.
   * @param income double value of their yearly income
   * @param tuition double value of their tuition rates
   */
  public StudentTaxes(String name, int sin, double income, double tuition){
    super(name, sin);
    this.income = income;
    this.tuition = tuition;
  }

  /** Function to calculate taxes owed by individual student
   *
   * @return the amount of taxes owed in long
   */
  @Override
  public long taxesOwed(){
    //variable to store amound of taxes owed
    double ret = 0;

    //if income is less than $10,000
    if(this.income < 10000){
      ret = ((this.income) * 0.10) - this.tuition;

    //if income is less than $30,000
    }else if(this.income < 30000){
      ret = ((this.income)*0.30) - (this.tuition * 0.5);

    }else{
      ret = ((this.income)*0.50) - (this.tuition * 0.25);

    }
    ret = Math.round(ret);
    return (long)ret;
  }
}
