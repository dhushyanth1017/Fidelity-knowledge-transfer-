class discount
{
    public static void main(String[]args)
    {
        discount(1200,true);
    }
    
    public static void discount(int amount,boolean member)
    {
        if(amount>=1000)
        {
            if(member==true)
            {
                double result = amount * 0.80; 
                System.out.println(result);
            }
            else 
            {
                double result = amount * 0.90;
                System.out.println(result);
            }
        }
         else{
             System.out.println(amount);
        }
    }
}