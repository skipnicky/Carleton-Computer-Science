package comp1406a4;
import java.util.Arrays;
import java.util.Random;

/**
 * A class to create a standard playing card for a deck of cards
 *
 * COMP 1406
 * Winter 2019
 * Assignment 4
 */

public class StandardCard extends Card{

  /** Initializes StandardCard object with specificed values
   * <p>
	 * If the rank is Joker set the suit to NONE no matter what
   * <p>
   * Usage: new StandardCard("King", "Hearts")
   *
   * @param rank rank of card being created (String - 1,2,...,10,Jack, etc)
   * @param suit suit of card being created (String - Clubs, Hearts, Diamonds, etc)
   */
  public StandardCard(String rank, String suit){
    //inherit constructor from Card
    super(suit,rank);

    //if card rank is joker
    // always set suit to NONE
    if(rank.equals("Joker")){
      this.suit = "NONE";
    }
  }

  /** Initializes StandardCard object with specificed values
   * <p>
   * If the passed int rank is 0, 1, or in range 11 to 14 set objects
   * rank to appropriate String value
   * <p>
   * Usage: new StandardCard(12, "Hearts")
   *
   * @param rank rank of card being created (int - 0 to 14)
   * @param suit suit of card being created (String - Clubs, Hearts, Diamonds, etc)
   */
  public StandardCard(int rank, String suit){
    //inherit constructor from Card
    //  convert rank int to String before passing var
    super(suit, Integer.toString(rank));

    //switch case with rank
    // in order to set appropriate values
    switch(rank){
      //if int rank is 1 --> Joker and suit must be set NONE
      case 1: this.rank = "Joker";
              this.suit = "NONE";
                    break;
      //if int rank is 11 --> Jack
      case 11: this.rank = "Jack";
                    break;
      //if int rank is 12 --> Queen
      case 12: this.rank = "Queen";
                    break;
      //if int rank is 13 --> King
      case 13: this.rank = "King";
                    break;
      //if int rank is 14 --> Ace
      case 14: this.rank = "Ace";
                    break;
      //if int rank is 0 --> None
      case 0: this.rank = "None";
                    break;
      //default case is anything besides above cases
      //  will set current card objects rank to String value of int rank
      default: this.rank =  Integer.toString(rank);
              break;
    }
  }

  /** Gets the numeric value associated with the Card's rank
    *
    * @return numeric value of rank
   */
  public int getRankValue(){
    //variable to store numeric rank value
    int ret = 0;

    //switch case with current card objects rank (String)
    switch(this.rank){
      //if Joker --> return rank is 1
      case "Joker": ret = 1;
                    break;
      //if Jack --> return rank is 11
      case "Jack": ret = 11;
                    break;
      //if Queen --> return rank is 12
      case "Queen": ret = 12;
                    break;
      //if King --> return rank is 13
      case "King": ret = 13;
                    break;
      //if Ace --> return rank is 14
      case "Ace": ret = 14;
                    break;
      //if None --> return rank is 0
      case "None": ret = 0;
                    break;
      //default case is anything besides above cases
      //  return rank is current card obj's rank as an int
      default: ret = Integer.parseInt(this.rank);
              break;
    }
    return ret;
  }

  /** Gets a numeric value associated with the Card's suit
    *
    * @param c is the Card object whose suit value is desired
    * @return numeric value of suit
   */
  public int getSuitNum(Card c){
    //variable to store numeric suit value
    int ret = 0;

    //switch case with current card objects suit (String)
    switch(c.suit){
      //if Diamonds --> return suit is 1
      case "Diamonds": ret = 1;
                       break;
      //if Clubs --> return suit is 2
      case "Clubs": ret = 2;
                    break;
      //if Hearts --> return suit is 3
      case "Hearts": ret = 3;
                     break;
      //if Spades --> return suit is 4
      case "Spades": ret = 4;
                    break;
      //if NONE --> return suit is 0
      case "NONE": ret = 0;
                    break;
    }
    return ret;
  }

  /** Override of compareTo method that returns 0/1/-1 when comparing
    * two card objects (based on which has higher value)
    *
    * @param o is the "other" card object being compared against the
    *          "current" card object
    * @return result of comparing the two objects
   */
  @Override
  public int compareTo(Card o){
    //variable to store comparable result
    int ret = 0;

    //if either objects being compared have rank Joker...
    if(this.rank.equals("Joker") || o.rank.equals("Joker")){
      //if both objects being compared are Joker...
      if(o.rank.equals(this.rank)){
        ; //pass because ret remains 0 (they are same)

      //otherwise if it's "main" object that is Joker
      //and not "other" object
      }else if(this.rank.equals("Joker")){
        //return is -1
        ret = -1;

      //otherwise return is 1
      }else{ ret = 1; }

    //if ranks are not joker
    }else{
      //get int values of "this" object and "o" objects rank/suit
      int tSuit = getSuitNum(this);
      int oSuit = getSuitNum(o);
      int oRank = o.getRankValue();
      int tRank = this.getRankValue();

      //if both Card objects have same rank and suit...
      if(this.rank.equals(o.rank) && this.suit.equals(o.suit)){
        ; //pass because ret remains 0 (they are same)

      //otherwise if suit is same but rank is different
      // only need to consider rank
      }else if(o.suit.equals(this.suit)){
        /* Ternary operator --> condition ? result1:result2
        if (tRank > oRank) is true: return is 1
        otherwise if (tRank > oRank) is false: return is -1
        */
        ret = (tRank > oRank) ? 1 : -1;

      //otherwise rank and suit is different
      // so only need to consider suit
      }else{
        //if (tSuit > oSuit) is true: return is 1
        //otherwise if (tSuit > oSuit) is false: return is -1
        ret = (tSuit > oSuit) ? 1 : -1;
      }
    }
    return ret;
  }

}
