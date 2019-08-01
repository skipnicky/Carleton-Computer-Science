package comp1406t7;

import java.util.Arrays;
import java.util.Comparator;

public final class TestTeam{
  private static String[] names = {
      "Kittens", "Cats", "Dogs", "Bats", "Cows", "Oxen", "Ravens", "Ohs"};

  public static void play(Team[] teams, int numGames){
    for(int loop=0; loop<numGames; loop+=1){
      for(int i=0; i<names.length; i+=1){
        for(int j=i+1; j<names.length; j+=1){
          if(Math.random() < 0.1){
            teams[i].draw();
            teams[j].draw();
          }else if(Math.random() < 0.5){
            teams[i].win();
            teams[j].lose();
          }else{
            teams[i].lose();
            teams[j].win();
          }
        }// for j
      }// for i
    }// for loop

  }

  public static void main(String[] args){
    Team[] teams = new Team[ names.length ];
    for(int i=0; i<names.length; i+=1){
      teams[i] = new Team(names[i]);
    }
    play(teams, 1);

    System.out.println("before sorting ------------------------");
    System.out.println( Arrays.toString(teams) );
    Arrays.sort(teams);
    System.out.println("after sorting -------------------------");
    System.out.println( Arrays.toString(teams) );

    Comparator<Team> cmp = new Comparator<Team> (){
      @Override
      public int compare(Team t, Team o){
        int ret = 0;
        int tNL = t.getName().length();
        int oNL = o.getName().length();

        if(t.getName().length() == o.getName().length()){
          if(t.getWins() == o.getWins()){
            ret = 0;
          } else{ ret = (t.getWins() > o.getWins()) ? -1:1; }
        } else{ ret = (tNL > oNL) ? -1:1; }

        return ret;
      }
    };

    System.out.println(" ");
    System.out.println("------COMPARATOR------");
    System.out.println("before sorting ------------------------");
    System.out.println( Arrays.toString(teams) );
    Arrays.sort(teams, cmp);
    System.out.println("after sorting -------------------------");
    System.out.println( Arrays.toString(teams) );


  }
}
