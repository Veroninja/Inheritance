
public class Cake
{
   private String name;
   private String flavour;
   private int price;
   
   public Cake(String theName, String theFlavour, int thePrice)
   {
       this.name = theName;
       this.flavour = theFlavour;
       this.price = thePrice;
   }
   
   public void setName(String newName)
   {
       name = newName;
   }
   public String getName()
   {
       return name;
   }
   
   public void setHeight(String newFlavour)
   {
       flavour = newFlavour;
   }
   public String getFlavour()
   {
       return flavour;
   }
   
   public void setPrice(int newPrice)
   {
       price = newPrice;
   }
   public int getPrice()
   {
       return price;
   }
}
