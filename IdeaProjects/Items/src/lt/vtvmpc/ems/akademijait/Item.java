package lt.vtvmpc.ems.akademijait;

public class Item {

  private String name;
  private double basePrice;

  public Item (String name, double basePrice){
      this.name = name;
      this.basePrice = basePrice;
  }

  public String getName(){
      return this.name;
  }

  public double getBasePrice(){
      return this.basePrice;
  }

}
