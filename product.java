public class product
{
    public static int getPrice(int productID)
    {
        if(productID==1)
        {
            return 10;
        }
        else if(productID == 2)
        {
            return 50;
        }
        else
        {
            return -1;
        }
    }
    
    
    public static void printProduct(int productID)
    {
        System.out.println("product id : " + productID);
    }
    
    public static void printProduct(int productID, int price)
    {
        System.out.println("product id : " + productID);
        System.out.println("price : " + price);
    }
    
     public static void printProduct(int productID, int price,int quantity)
    {
        System.out.println("Product id : " + productID);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("total : " + calculateTotal(price,quantity));
    }
    public static double calculateTotal(double price,int quantity)
    {
        return price * quantity;
    }
    
    public static void main (String[]args)
    {
        int productID = 2;
        int quantity = 3;
        
        int price = getPrice(productID);
        
        if(price == -1)
        {
            System.out.println("invalid product");
        }
        else
        {
            printProduct(productID,price,quantity);
        }
    }
}