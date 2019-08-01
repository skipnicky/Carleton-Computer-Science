package comp1406a2;
//import java.util.Arrays;
/** A very simple database storing weather data */
public class WeatherDatabase{
	//attribute which is an array of WeatherStation objects
	public WeatherStation[] stations;

	/* ----------------------------------- */
	/* do NOT change this constructor      */
	/* ----------------------------------- */

	/** Creates an empty weather database  */
	public WeatherDatabase(){}

	/* ----------------------------------- */




	//
	// You need to complete these methods.
	//
	// Unless stated, you will need to change the return
	// value of each of these methods as well as add the actual
	// body of the methods.
	//



	/** Returns all weather stations in the database
	* in no particular order
	*
	* @return an array containing all weather stations that are in
	*         this database. Note that the size of the array should be equal to
	*         the result of <code>this.numberOfWeatherStations()</code>.
	*/
	public WeatherStation[] getWeatherStations(){
		//if stations is not null (aka there are elements in station array)
		if(this.stations != null){
			//this means you can turn the array as is
			return stations;
		}else{
			//otherwise return empty array
			stations = new WeatherStation[0];
			return stations;
		}
	}

	/** Returns the number of weather stations in the database
	*
	* @return the number of weather stations in this database
	*/
	public int numberOfWeatherStations(){
		//base num is zero
		int num = 0;

		//if stations array is not null
		//(aka there are elements in the array)
		if(this.stations != null){
			//set num to length of stations array
			num = (this.stations).length;
		}
		return num;
	}


	/** adds a weather station to this database
		* @param station is the weather station to add. It will always be non-null.
		* @return this weather station.
		*/
	public WeatherDatabase addWeatherStation(WeatherStation station){
		//if stations array is not null
		//(aka there are elements in the array)
		if(this.stations != null){
			//copy current objects stations array to keep original stats
			WeatherStation[] copied = this.stations;
			//set stations array to stations length plus one
			// to make room for new station
			this.stations = new WeatherStation[(this.stations).length+1];

			//bounded for loop to re-write stations to current objects stations array
			for(int i = 0; i<copied.length; i++){
				this.stations[i] = copied[i];
			}

			//set final position in objects stations array to station
			//that was passed to method
			this.stations[(this.stations).length-1] = station;
		}else{
			//otherwise stations has no elements so create new array of length 1
			//and add station passed to method
			this.stations = new WeatherStation[1];
			this.stations[0] = station;
		}
		return this;    // do NOT change the return statement
	}


	/** removes weather station with given id from this database
		* @param id is the ID number of the weather station to remove.
		* @return true if the specified weather station is successfully removed,
		*         returns false otherwise (i.e., if there was no weather station
		*         with the specified ID number in this database to begin with).
		*/
	public boolean removeWeatherStation(int id){
		//base case --> removed is false
		boolean removed = false;

		//if objects stations array is not null
		//(aka there are elements in the array)
		if(this.stations != null){
			//bounded for loop to iterate through stations in array
			for(int i = 0; i<stations.length; i++){
				//if ID of current station is equal to desired ID
				// then set removed to true
				if(stations[i].getID() == id){
					removed = true;
				}
			}

			//if removed has been set to true..
			if(removed == true){
				//create temporary stations array that is copy of current objects stations
				WeatherStation[] temp = this.stations;
				//set current objects stations array to be one less than its original length
				//	original length being still stored in WeatherStation[] temp
				this.stations = new WeatherStation[temp.length-1];


				/*bounded for loop to add stations in temp (which is copy of original)
				if station is found in temp that has desired id
				set int pass to 1 --> so that it will skip that station
				when next adding to current stations */
				int pass = 0;
				for(int i = 0; i < this.stations.length; i++){
					//if current position (i+0) is equal to desired id
					if(temp[i+pass].getID() == id){
						//set pass to 1 so next addition to objects array will skip
						pass = 1;
					}

					//set element at current index i to
					//original station at i + pass (i+0 or i+1 depending)
					this.stations[i] = temp[i+pass];
				}
			}
		}

		return removed;
	}

	/** returns the highest temperature ever recorded by any weather station
	  * in the data base.
	  */
	public Temperature getMaxTemperature(){
		//set base max temp to absolute 0 in celsius
		double maxTemp = -273.15;
		//set base case of max temp object to null
		Temperature maxTempObj = null;

		//if objects stations not equal null
		//(aka there are elements in stations array)
		if(this.stations != null){
			//bounded for loop to check temperature at report with max temp
			//from each station
			for(int i = 0; i < stations.length; i++){
				//for each station get the report with max temperature
				// then the temparature object, set the scale to celsius,
				// and then get the temperature (as in the double)
				double curTemp = this.stations[i].getReportWithMaxTemp().getTemperature().setScale(Scale.CELSIUS).getTemp();

				//if the curTemp is greater than the maxTemp
				// set the maxTemp to be the curTemp
				// and the new maxTempObj to be that temp obj from the report
				if(curTemp > maxTemp){
					maxTemp = curTemp;
					maxTempObj = this.stations[i].getReportWithMaxTemp().getTemperature();
				}
			}
		}
		return maxTempObj;
	}


	/** returns the highest temperature on a specified day
		* that is recorded in a report in the weather stations in this database.
		*
		* @param day is the day to find the max temperature on. Note that this
		*            might be the special max temperature day that a
		*            weather station records.
		* @return  the temperature object with the highest recorded Temperature
		*          in the data base on the specified day.
		*/
	public Temperature getMaxTemperature(int day){
		//set base max temp to absolute 0 in celsius
		double maxTemp = -273.15;
		//set base case of max temp object to null
		Temperature maxTempObj = null;

		//if stations array is not null
		//(aka there are elements in the array)
		if(this.stations != null){
			//bounded for loop to check temperature at desired day in each report from stations
			for(int i=0; i < this.stations.length; i++){
				//create array to hold reports from each station
				WeatherReport[] dayReports = this.stations[i].getReports();

				//bounded for loop that checks temperature (double) from each report
				// and compares to set max temp
				for(int j=0; j < dayReports.length;j++){
					//if the day at the current report equals desired day...
					if(dayReports[j].getTime().getDay() == day){
						//get temperature from that report and set scale to celsius
						double temp = dayReports[j].getTemperature().setScale(Scale.CELSIUS).getTemp();

						//if found temp is greater than what maxTemp is currently set to...
						if(temp > maxTemp){
							//set new maxTemp as well as new maxTemp object
							maxTemp = temp;
							maxTempObj = dayReports[j].getTemperature();
						}
					}
				}
			}
		}
		return maxTempObj;
	}


	/** Computes the average temperature (over all weather stations) for the
	*  time period starting at startDay and ending at endDay (inclusive)
	*
	* @param startDay is the starting day
	* @param endDay is the ending endDay
	* @return the average temperature of all temperature reports for the time
	*         period startDay to endDay (inclusive) taken from all weather
	*         stations in this weather database.
	*/
	public double averageTemperature(int startDay, int endDay){
		//set count and sum to 0
		double count = 0;
		double sum = 0;

		//if stations array is not null
		//(aka there are elements in the array)
		if (this.stations != null){
			//enhanced for loop for each element in stations array
			for(WeatherStation stn: stations){
				//get report with max temperature at current station
				WeatherReport max = stn.getReportWithMaxTemp();
				//get TimeStamp object and then int day from max report
				int day = max.getTime().getDay();

				//if day of max report falls between bounds of start and end day...
				if(startDay<=day && day<=endDay){
					//set scale of max temperature object to celsius
					max.getTemperature().setScale(Scale.CELSIUS);
					//add sum to self as well as the temperature of the max temp object
					sum += max.getTemperature().getTemp();
					//increase count by 1
					count++;
				}

				//create array of total reports from current station
				WeatherReport[] reports = stn.getReports();
				//ehanced for loop for each report at current station
				for(WeatherReport rep:reports){
					//get day at current report
					day = rep.getTime().getDay();

					//if the current report doesn't equal the max report
					//(because max report has already been added)
					// and it's day falls in bounds of start day and end day...
					if(!rep.equals(max) && startDay<=day && day<=endDay){
						//set report's temperature object scale to celsius
						rep.getTemperature().setScale(Scale.CELSIUS);
						//sum equals sum plus temperature from the current report
						sum += rep.getTemperature().getTemp();
						//increase count by 1
						count++;
					}
				}
			}
		}
		//catch case return absolute 0 if no reports
		if(count==0){return -273.15;}
		//otherwise return average which is total sum divided by total elements
		return sum/count;
	}
}
