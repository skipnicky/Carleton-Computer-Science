package comp1406a2;

/**
 * A class to represent temperature (with a value and scale).
 *
 * COMP 1406
 * Winter 2019
 * Assignment 2
 */

public class Temperature{

  //class attributes
  public double temp;
  public Scale scale;
	/** Initializes a temperature object with given value in Celsius
	 *  <p>
	 *  If the initial temperature is less than -273.15C then the temperature
	 *  object will be initialized with -273.15C.
   *
	 * @param temp is the initial temperature in Celsius.
	 */
  public Temperature(double temp){
    //set scale to celsius
    this.scale = Scale.CELSIUS;

    //if temp is less than -273.15
    //  which is absolute zero in celsius
    if(temp < -273.15){
      //set temp to abs zero
      this.temp = -273.15;
    }else{
      //otherwise set to passed temp
      this.temp = temp;
    }
  }


	/** Initializes a temperature object with given value using the specified scale
   * <p>
	 * If the temperature is lower than absolute zero, in the given scale,
	 * then set the temperature to absolute zero (in that scale).
   * <p>
 	 * Usage: new Temperature(12.3, Scale.KELVIN)
	 *
	 * @param temp is the initial temperature in the scale provided in
   *        the second argument.
	 * @param scale is the scale of initial temperature and must be a constant
	 *        defined in the Scale enum type.
	 */
  public Temperature(double temp, Scale scale){
    //set scale
    this.scale = scale;
    //get scale type char
    char s = this.getScale();

    //switch case to set temp to absolute zero
    //  if passed temp is less
    switch(s){
      //if scale is type FAHRENHEIT
      case 'F':
        if(temp < - 459.67){
          temp = -459.67;
        }
        break;
        
      //if scale is type CELSIUS
      case 'C':
        if(temp < -273.15){
          temp = -273.15;
        }
        break;

      //if scale is type KELVIN
      case 'K':
        if(temp < 0){
          temp = 0;
        }
        break;
    }
    this.temp = temp;
  }


	/** Initializes a new temperature object that is a copy of the
   *  temperature object parameter.
   *
   * That is, it makes a new object that is a copy of the input object.
   *
	 * @param temp is a non-null temperature object
	 */
  public Temperature(Temperature temp){
    //copies temp attributes of object passed to method
    this.temp = temp.temp;
    this.scale = temp.scale;
  }


	/** getter for the scale
	 * <p>
	 * The output of this getter method must always be the first letter of one
	 * of the names in the Scales enum class. It must be the upper case letter.
	 * <p>
	 * Example: t = new Temperature(12.3, Scale.KELVIN);
	 *          t.getScale() will then output 'K'
	 *
	 * @return the first letter (in upper case) of the string representation of the
	 *         current scale of this object.
	 */
  public char getScale(){
    //declare char to represent scale type
    char scaleType = 'n';

    //switch case to handle scale types
    //  set to char representing first letter of scale
    switch(this.scale){
      case KELVIN: scaleType = 'K'; break;
      case CELSIUS: scaleType = 'C'; break;
      case FAHRENHEIT: scaleType = 'F'; break;
    }
    return scaleType;
  }


	/** getter for the temperature
	 *
	 * @return the temperature of the object using the current scale
	 */
  public double getTemp(){
    //get temp of object
    double temp = this.temp;
    return temp;
  }


  /** setter for scale
	 *
	 * @param scale is the new scale of the temperature and must be
	 *        a constant from the Scale enum type. The next time you
	 *        call getTemp(), the temperature will be output in this scale.
   * @return a reference to this object.
	 */
  public Temperature setScale(Scale scale){
    //get original scale type
    Scale theScale = this.scale;
    //set scale of object to passed scale type
    this.scale = scale;

    //if statement for conversions from original scale type
    if(theScale == Scale.CELSIUS){
      //switch case to handle conversions from celsius to other temps
      switch(scale){
        case FAHRENHEIT: this.temp = (this.temp * 9/5) + 32; break;
        case KELVIN: this.temp = (this.temp + 273.15); break;
      }
    }else if(theScale == Scale.FAHRENHEIT){
      //switch for conversions from fahrenheit to other temps
      switch(scale){
        case CELSIUS: this.temp = (this.temp - 32) * 5/9;
                      break;
        case KELVIN: this.temp = (this.temp - 32) * 5/9 + 273.15;
                     break;
      }
    }else if(theScale == Scale.KELVIN){
      //switch for conversions from kelvin to other temps
      switch(scale){
        case CELSIUS: this.temp = this.temp - 273.15;
                      break;
        case FAHRENHEIT: this.temp = (this.temp - 273.15) * 9/5 + 32;
                         break;
      }
    }
    return this;  // do NOT change this return statement.
	}


	/** setter for temperature
	 *
	 * @param temp is the new temperature (in the object's current scale)
   * @return a reference to this object.
	 */
  public Temperature setTemp(double temp){
    //get scale obj
    Scale scale = this.scale;

    /*if statement goes through scale type
    to make sure that passed temp is
    not less than absolute zero */
    //if scale is celsius...
    if(scale == Scale.CELSIUS){
      if(temp < -273.15){
        this.temp = -273.15;
      }else{
        this.temp = temp;
      }
    //if scale is fahrenheit...
    }else if(scale == Scale.FAHRENHEIT){
      if(temp < -459.67){
        this.temp = -459.67;
      }else{
        this.temp = temp;
      }
    //if scale is kelvin...
    }else if(scale == Scale.KELVIN){
      if(temp < 0){
        this.temp = 0;
      }else{
        this.temp = temp;
      }
    }
    return this;  // do NOT change this return statement.
	}

	/** setter for temperature
	 *
	 * @param temp is the new temperature
	 * @param scale is the scale of the new temperature. It must be
	 *        a constant from the Scale enum type.
   * @return a reference to this object.
   */
  public Temperature setTemp(double temp, Scale scale){
    //set scale
    this.scale = scale;

    /*if statement goes through scale type
    to make sure that passed temp is
    not less than absolute zero */
    //if passed scale is celsius...
    if(scale == Scale.CELSIUS){
      if(temp < -273.15){
        this.temp = -273.15;
      }else{
        this.temp = temp;
      }
    //if scale is fahrenheit...
    }else if(scale == Scale.FAHRENHEIT){
      if(temp < -459.67){
        this.temp = -459.67;
      }else{
        this.temp = temp;
      }
    //if scale is kelvin...
    }else if(scale == Scale.KELVIN){
      if(temp < 0){
        this.temp = 0;
      }else{
        this.temp = temp;
      }
    }
    return this;  // do NOT change this return statement.
	}


	/** setter for temperature
	 *
	 * @param temp is the new temperature.
	 * @param scale is a string representing one of the three scales.
   * @return a reference to this object.
   */
  public Temperature setTemp(double temp, String scale){
    /*set passed scale string to all upeper case and get first letter,
    this way you don't have to do complicated checking to match
    what is passed to a scale */
    String theScale = scale.toUpperCase().substring(0,1);

    //switch to set scale/temp based off of passed string
    switch(theScale){
      //if substring is k set scale to kelvin
      //make sure temp is above absolute zero
      case "K": this.scale = Scale.KELVIN;
                if(temp < 0){
                  this.temp = 0;
                }else{
                  this.temp = temp;
                }
                break;

      //if substring is c set scale to celsius
      //make sure temp is above absolute zero
      case "C": this.scale = Scale.CELSIUS;
                if(temp < -273.15){
                  this.temp = -273.15;
                }else{
                  this.temp = temp;
                }
                break;

      //if substring is f set scale to fahrenheit
      //make sure temp is above absolute zero
      case "F": this.scale = Scale.FAHRENHEIT;
                if(temp < -459.67){
                  this.temp = -459.67;
                }else{
                  this.temp = temp;
                }
                break;
    }
		return this;  // do NOT change this return statement.
  }

  /**
	 *
	 * @param temp is the new temperature.
	 * @param scale is a string representing one of the three scales.
   * @return a reference to this object.
   */














	/* ------------------------------------------------- */
	/* ------------------------------------------------- */
  /* do not change anything below this                 */
  /* ------------------------------------------------- */
	/* ------------------------------------------------- */

  /** String representation of a temperature object    */
	@Override
  public String toString(){
    return "" + this.getTemp() + this.getScale();
  }

}
