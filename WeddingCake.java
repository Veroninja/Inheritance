
public class WeddingCake extends Cake
{
   private int layers;
   
   public WeddingCake(String theName, String theFlavour, int thePrice, int theLayers)
   {
       super(theName, theFlavour, thePrice);
       
       layers = theLayers;
   }
   
   public void setLayers(int newLayers)
   {
       layers = newLayers;
   }
   
   public void printWeddingCake()
   {
       System.out.println("---Cake Info---");
       System.out.println("Name: "+super.getName());
       System.out.println("Flavour: "+super.getFlavour());
       System.out.println("Layers: "+layers);
       System.out.println("Price: "+super.getPrice());
   }
}
