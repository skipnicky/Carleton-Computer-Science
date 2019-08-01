package comp1406t2;

public class Point2D{
	// instance attributes (state of objects)
	double x;
	double y;

	// instance methods (behanviour of objects)
	public double magnitude(){
		//use euclidian distance formula
		//and built in Math to calculate
		double euclidDist = Math.sqrt((x*x)+(y*y));
		return euclidDist;
	}

	//takes "other" instane of Point2D class
	public double distance(Point2D other){
		//euclidian distance using built in Math
		// saying other.x/y accesses the x and y attributes
		// of the point other
		double euclidDist = Math.sqrt(((other.x-x)*
		(other.x-x))+((other.y-y)*(other.y-y)));
		return euclidDist;
	}

	public String toString(){
		//convert doubles to strings using built in String methods
		String strx = String.valueOf(x);
		String stry = String.valueOf(y);
		//create point
		String strPoint = "("+strx+","+stry+")";
		return strPoint;
	}

}
