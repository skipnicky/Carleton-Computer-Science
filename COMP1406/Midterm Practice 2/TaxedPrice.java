public class TaxedPrice{

  public static final double ON = 0.13;
  public static final double QC = 0.14975;

  public static double priceTaxesIncluded(GoodsAndServices o, double tax){
    double p = o.getPrice();
    double t = (p * tax);
    double ret = p + t;
    return(ret);
  }

}
