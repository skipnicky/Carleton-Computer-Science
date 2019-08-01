public class NutsBasket implements GoodsAndServices{
  private int weight;
  private String nutsType;

  public NutsBasket(String nt, int w){
    this.weight = w;
    this.nutsType = nt;
  }

  @Override
  public String toString(){
    return("basket of "+nutsType+" costing "+ getPrice() +"$ plus taxes");
  }

  public double getPrice(){
    return(0.1*weight);
  }
}
