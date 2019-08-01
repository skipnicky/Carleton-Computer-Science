package comp1406a1;
/** Assignment 1 - Winter 2019
  * <p>
  * Problem 3
  * <p> In the provided Grades.java files, complete the finalExamGradeNeeded method.
  * <p>
  * This method takes several input parameters: a target letter grade (String),
  * a list of assignment grades (double[]), a list of tutorial grades (double[])
  * and a list of midterm grades (double[]).
  * <p>
  * The method returns the minimum grade needed on the final exam to achieve the
  * target letter grade based on the other input grades.
  * <p>
  * You must use the grading scheme as specified in the course outline.
  * Be careful to read and understand the condition for passing the course.
  * If the needed final exam grade is more than 100.0, then the method should return -1.0.
  * If the target grade will be achieved (or surpassed) regardless of the final exam mark,
  * the method should return 0.0.
  */


public class Grades{

  /** Computes the minimum final exam grade needed to achieve a desired
    * target letter grade based on provided assignment, tutorial and midterm
    * grades.
    * <p>
    * The Grade determination is based on that given in the course outline.
    * (See Piazza and be sure to read the course outline!)
    * //assignments are 32% --> 6 asgns 5% each, 3 study asgns 1% each
      //tutorials --> 8% (best 8 out of 10)
      // midterms --> 30% (best 2 out of 3), indv 15%
      // final exm --> 30%
    * @param target is the desired letter grade.
    * @param assignments contains all nine assignment grades (each out of 100). The first six are the main assignments and the last three are the study assignments.
    * @param tutorials contains all 10 tutorial grades (each out of 100).
    * @param midterms contains all 3 midterm grades (each out of 100).
    *
    * @return the minimum grade needed to achieve the target letter grade based on
    *         the provided assignment/tutorial/midterm grades and the description
    *         provided in the course outline. If the needed final exam grade is more
    *         than 100.0, return -1.0. If the target grade will be achieved (or surpassed)
    *         regardless of the final exam mark, returns 0.0.
    */
  static final double ASGNWEIGHT = 30;
  static final double STDYWEIGHT = 2;
  static final double TUTWEIGHT = 8;
  static final double MIDWEIGHT = 30;
  static final double EXAM = 30;
  public static double finalExamGradeNeeded(String   target,
                                            double[] assignments,
                                            double[] tutorials,
                                            double[] midterms){


    double targrade = 100.0;
    if (target==null){return 0;}
    switch (target){
      case "A+":targrade = 90.0;break;
      case "A":targrade = 85.0;break;
      case "A-":targrade = 80.0;break;
      case "B+":targrade = 77.0;break;
      case "B":targrade = 73.0;break;
      case "B-":targrade = 70.0;break;
      case "C+":targrade = 67.0;break;
      case "C":targrade = 63.0;break;
      case "C-":targrade = 60.0;break;
      case "D+":targrade = 57.0;break;
      case "D":targrade = 53.0;break;
      case "D-":targrade = 50.0;break;
      case "F":return 0;
    }

    double currentGrade = asgnSumWeight(assignments, ASGNWEIGHT, STDYWEIGHT)+
    tutSumWeight(tutorials, TUTWEIGHT) + midSumWeight(midterms, MIDWEIGHT);
    //System.out.println("curr "+currentGrade);
    double require = 100*(targrade-currentGrade)/EXAM;
    //System.out.println("req "+require);
    double req2 = 100*((MIDWEIGHT+EXAM)/2-midSumWeight(midterms, MIDWEIGHT))/EXAM;
    if (req2>require){require=req2;}
    if(require > 100){return -1;}
    if(require <= 0){return 0;}
    return require;
    }


  //fcn to calculate weighted average of certain assesments
  static double asgnSumWeight(double[] grades, double weight, double weight2){
    double[] studyAsgns = {grades[6],grades[7],grades[8]};
    double lowest = studyAsgns[0];
    double totalStudy = 0;
    for(int i = 0; i<studyAsgns.length;i++){
      if(studyAsgns[i]<lowest){
        lowest = studyAsgns[i];
      }
    }
    //System.out.println(lowest);
    for(double grade:studyAsgns){
      if(lowest == 100){
        totalStudy = 200;
      } else if(grade!=lowest){
          totalStudy+=grade;
      }
    }
    double totalAsgn = grades[0]+grades[1]+grades[2]+grades[3]+grades[4]+grades[5];
    double trueTotal = (totalAsgn*weight/100/6) + (totalStudy*weight2/100/2);
  //  System.out.println("true total "+trueTotal);
    return trueTotal;
  }

  static double midSumWeight(double[] grades, double weight){
    //set total val to 0
    double total = 0;
    //set base "lowest" midterm grade
    double lowest = grades[0];
    //for each grade in set of values
    for(int i = 0; i<grades.length;i++){
      if(grades[i]<lowest){
        lowest = grades[i];
      }
    }
    for(double grade:grades){
        total+=grade;
      }
    total = total-lowest;
    System.out.println("mid total "+total*weight/100/2);
    return total*weight/100/2;
  }
  static double tutSumWeight(double[] grades, double weight){
    //set total val to 0
    double total = 0;
    //set base "lowest" grade
    double lowest = grades[0];
    //set base second "lowest" grade
    double secLowest = grades[1];
    for(int i = 0; i < grades.length; i++){
      if(grades[i]<lowest){
        secLowest = lowest;
        lowest = grades[i];
      } else if(grades[i] < secLowest && grades[i] != lowest){
        secLowest = grades[i];
      }
    }
    //System.out.println(lowest);
    //System.out.println(secLowest);
    for(double grade:grades){
      total+=grade;
    }
    total = total-lowest-secLowest;
    //System.out.println("tut total "+(total*weight)/100/8);
    return ((total*weight)/100)/8;
  }

  public static void main(String[] args){
    //asgns 70.34375
    //tuts 71.5
    System.out.println(finalExamGradeNeeded("A-",
    new double[]{98.0, 97.0, 98.0, 98.0, 93.0, 94.0, 100.0, 92.0, 92.0},
    new double[]{96.0, 95.0, 99.0, 100.0, 98.0, 95.0, 99.0, 95.0, 92.0, 98.0},
    new double[]{92.0, 96.0, 95.0}));
  }
}
