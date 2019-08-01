package comp1406t5;

/** A specific kind of mail */
public class Letter extends Mail{
	String contents;

	public Letter(String description, String text, Date day){
		super(description, day);
		this.contents = text;
	}

	@Override
	public String toString(){
		return "Letter description: " + this.getDescription() + " Delivery status: " + this.isDelivered();
	}
}
