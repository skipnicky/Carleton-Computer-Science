public class Book implements GoodsAndServices{
  private int year;
  private String title;
  private String author;
  private double price;

  public Book(int y, String a, String t, double p){
    this.year = y;
    this.title = ""+t;
    this.author = ""+a;
    this.price = p;
  }

  @Override
  public boolean equals(Object o){
    //return this == o;
    boolean same = false;
    if(o instanceof Book){
      Book other = (Book) o;
      same = (year==other.year && title.equals(other.title)&&author.equals(other.author));
    }
    return same;
  }

  @Override
  public String toString(){
    String ret = "\""+title + "\" by " + author + ", sold for " + price + "$ plus taxes";
    return ret;
  }

  public double getPrice(){
    return(price);
  }

}
