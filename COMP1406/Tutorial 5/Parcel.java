package comp1406t5;

/** A specific kind of mail */
public class Parcel extends Mail{
	Stuff someStuff;
	double cost;
	String comments;

	public Parcel(String description, Stuff stuff, double cost, Date day){
		super(description, day);
		this.someStuff = stuff;
		this.cost = cost;
		if(cost<10){
			this.expectedDelivery = day.futureDate(7);
		}else if(cost>19.99){
			this.expectedDelivery = day.futureDate(1);
		}else{
			this.expectedDelivery = day.futureDate(4);
		}
	}

	//overloading method (java knows what to use because signature)
	public void delivered(Date date, String comment){
		this.comments = comments;
		this.delivered(date);
	}

	@Override
	public String toString(){
		return "Description: " + this.getDescription() +
		" Expected delivery: " + this.getExpectedDelivery()
		+ " Contains: "+ this.someStuff + " Delivery status: " + this.isDelivered();
	}

}
