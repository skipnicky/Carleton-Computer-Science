package comp1406t7;

public class Team implements Comparable<Team>{
  protected int wins;      // wins
  protected int losses;    // losses
  protected int draws;     // draws (tie game)
  protected String name;   // name of the team

  public Team(String name){
    this(name,0,0,0);
  }
  public Team(String name, int wins, int losses, int draws){
    this.name = name;
    this.wins = wins;
    this.losses = losses;
    this.draws = draws;
  }

  /* getters */
  public int getWins(){ return wins; }
  public int getLosses(){ return losses; }
  public int getdraws(){ return draws; }
  public String getName(){ return name; }
  /* setters */
  public Team win(){ wins += 1; return this; }
  public Team lose(){ losses += 1; return this; }
  public Team draw(){ draws += 1; return this; }

  @Override
  public int compareTo(Team o){
    int ret = 0;

    int tPoints = (this.wins * 2) + this.draws;
    int oPoints = (o.wins * 2) + o.draws;
    int tGames = this.wins + this.losses + this.draws;
    int oGames = o.wins + o.losses + o.draws;

    if(tPoints == oPoints){
      if(tGames == oGames){
        if(this.wins == o.wins){
          if(this.draws == o.draws){
            ret = 0;
          }
        }else { ret = (this.wins > o.wins) ? -1:1; }
      }else{ ret = (tGames > oGames) ? -1:1; }
    }else{ ret = (tPoints > oPoints) ? -1:1; }

    return ret;
  }

  @Override
  public String toString(){
    int tPoints = (this.wins * 2) + this.draws;
    return(name + "[" +  tPoints + "]" + ":" + " " + this.wins + "/" +
            this.losses + "/" + this.draws);
  }
}
