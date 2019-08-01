package comp1406a4;
import java.lang.Math;

/**
 * A class to calculate the amount of taxes owed by a senior citizen
 *
 * COMP 1406
 * Winter 2019
 * Assignment 4
 */

public class SeniorTaxes extends Taxes{
  protected double income;
  protected double health_costs;

  public SeniorTaxes(String name, int sin, double income,
  double health_costs){
    super(name, sin);
    this.income = income;
    this.health_costs = health_costs;
  }

  @Override
  public long taxesOwed(){
    double ret = 0;
    if(this.income < 20000){
      ret =  (this.income* 0) - this.health_costs;
    }else if(this.income < 50000){
      ret = (this.income * 0.10) - (this.health_costs * 0.75);
    }else{
      ret = (this.income * 0.40) - (this.health_costs * 0.50);
    }
    ret = Math.round(ret);
    return (long)ret;
  }
}
