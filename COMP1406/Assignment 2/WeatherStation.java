package comp1406a2;

/** A weather station keeps a collection of weather reports.
  * The actual weather station it models will make temperature
  * observations which provides the data for the reports.
  *
  * A weather station only needs to remember the last 10
  * reports added to it (in the order that they are added),
  * in addition to the report with the highest temperature that
  * has ever been and recorded/added to this weather station.
  * That is, it only needs to store 11 weather reports in total.
  *
  * Notes: The highest ever temperature record might be one of the
  *        last 10 added reports but it also might not.
  *        You must store the last 10 reports in an array.
  *        The higherst ever temperature report does not need to be
  *        sotred in this array (unless it was one of the last 10).
  */
public class WeatherStation{
  //attribute which is an array of WeatherReport objects
  public WeatherReport[] reports;

/* --------------------------------------------------------------------------/
/* --------------------------------------------------------------------------/
/* ----------------------------------------------------- */
/*                                                       */
/* BEGIN  --  do NOT change anything until the end of    */
/*            this block of attributes, constructor and  */
/*            and methods                                */
/*                                                       */
/* ----------------------------------------------------- */

  /** The name of this weather station */
  protected final String name;

  /** The id number of this weather station. Should be unique. */
  protected final int    id;

  /** Initializes this weather station's name and id  */
  public WeatherStation(String nameOfStation, int idOfStation){
    this.name = nameOfStation;
    this.id   = idOfStation;
  }

  /** Getter for this weather station's name
   * @return the name of this weather station
   */
  public String getName(){ return this.name;  }

  /** Getter for this weather station's id number
   * @return the ID of this weather station
   */
  public int    getID(){ return this.id; }

  /** Creates a weather report
   * @param temperature is a valid temperature object correspinding to
   *                    an obervation at this weather station.
   * @param time is the time that the temoerature was recorded.
   * @return a weather report for this weather station recording
   *         the temperature and time of when the obervation was made.
   */
  public WeatherReport makeReport(Temperature temperature, TimeStamp time){
    return new WeatherReport(temperature, time, this);
  }

	/** A nice String representation of a weather station object */
  @Override
  public String toString(){
    return this.name + " [id:" + this.id + "]";
  }
/* ----------------------------------------------------- */
/*                                                       */
/* END - complete the methods below these comments       */
/*                                                       */
/* ----------------------------------------------------- */
/* --------------------------------------------------------------------------/*
/* --------------------------------------------------------------------------/*



  /** Adds a report to the station.
   *
   * @param report is a WeatherReport to be added to this WeatherStation
   * @return this WeatherStation. (Do NOT alter the return statement of this
   *         method.)
   *
   */
  public WeatherStation addReport(WeatherReport report){
    //if reports array is not null
		//(aka there are elements in the array)
    if(this.reports != null){
      //create copied array of the weather reports to keep original stats
      WeatherReport[] copied = this.reports;
      //set reports array to reports length plus one
      //  to make room for new report
      this.reports = new WeatherReport[(this.reports).length+1];

      //bounded for loop to re-write reports to current objects reports array
      for(int i = 0; i<copied.length; i++){
        this.reports[i] = copied[i];
      }

      //set final position in objects reports array to report
      //that was passed to method
      this.reports[(this.reports).length-1] = report;
    }else{
      //otherwise reports has no elements so create new array of length 1
      //and add report passed to method
      this.reports = new WeatherReport[1];
      this.reports[0] = report;
    }
    return this;  // do NOT alter the return statement
  }


    /** Returns the most recently added report.
      *
      *
      * @return the most recently added WeatherReport to this weatherstation.
      *         If no reports have ever been added then returns null.
      */
    public WeatherReport getMostRecentReport(){
      //if reports array is not null
  		//(aka there are elements in the array)
      if(reports != null){
        //return last report at position length -1
        // which will be the most recent one added to report
        //(is like a stack, last in first out)
        return(reports[reports.length-1]);
      }else{
        //otherwise there were no reports so return null
        return null;
      }
    }


  /** Returns the last 10 weather getReports added to this weather station.
	 * <p>
	 * If there haven't been 10 reports added then return as many as has been added.
   *
   * @return an array of the last 10 added WeatherReports (in the order
   *         that they were added). The most recently added report is the
   *         first element in the array.
   *         If there has been less than 10 reports added to this
   *         weatherstation, then returns as many reports as there is.
   *         The returned array must be the same size as the number of
   *         reports returned.
   */
  public WeatherReport[] getReports(){
    //if reports array is not null
		//(aka there are elements in the array)
    if(this.reports != null){
      //integer variable to hold length of reports array
      int len = this.reports.length;
      //unassigned array which will hold the last ten reports
      WeatherReport[] lastTen;

      //base cases for array length
      //if more than 10 reports being stored in the station...
      if(len>10){
        //array will be 10 reports long
        lastTen = new WeatherReport[10];
      //otherwise array will be same length as amount of reports < 10
      }else{
        lastTen = new WeatherReport[len];
      }

      //integer variable to hold length of lastTen reports array
      int lenTwo = lastTen.length;
      //index counter with initial value of 0
      // so as to avoid index out of bounds error within for loop
      int idx = 0;

      /* bounded for loop that iterates backwards through current array
      in order to copy over reports in order of first pos is most recent report
      initialization: pos of top of stack (last report added to array)
      termination: until you reach the length at which the reports are out of range
                   (are older than the most current)
      increment: decrease i by 1 */
      for(int i = len - 1; i >= len-lenTwo; i--){
        //set element at idx pos to report at pos explained above
        lastTen[idx] = reports[i];
        //increase idx by 1
        idx++;
      }
      return lastTen;
    }else{
      //otherwise return empty array because there are no reports
      WeatherReport[] lastTen = new WeatherReport[0];
      return lastTen;
    }
  }

  /** Returns a weather report with highest recorded temperature
   * of any report ever added to this WeatherStation.  If there have been
   * multiple reports with the same highest temperature, the most recently
   * added report is returned,.
   *
   * @return a WeatherReport that has the highest recorded temperature
   *         of any report ever added to this WeatherStation. Returns
   *         null if no report has ever been added to this weatherstation.
   */
  public WeatherReport getReportWithMaxTemp(){
    //set base case of max temp object to null
    WeatherReport maxReport = null;
    //set base max temp to absolute 0 in celsius
    double maxTemp = -273.15;

    //if reports array is not null
		//(aka there are elements in the array)
    if(reports != null){
      //bounded for loop to iterate through temperature of reports and compare
      //to base max temp each time
      for(int i = 0; i<reports.length; i++){
        //get temperature object from current report and set scale to celsius
        Temperature tempObj = reports[i].getTemperature().setScale(Scale.CELSIUS);
        //get temperature of object
        double temp = tempObj.getTemp();

        //if current temp is greater than max temp set new max temp
        //set report to be returned as report with max temp
        if(temp > maxTemp){
          maxTemp = temp;
          maxReport = reports[i];
        }
      }
    }
    return maxReport;
  }






}
