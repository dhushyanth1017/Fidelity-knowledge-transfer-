public class Billcalculate {

    public static double calculateBill(double amount, boolean isFirstOrder) {
        double dis = 0.0;

        if (amount < 500) {
            System.out.println("No discount");
        } else if (amount >= 500 && amount < 1500) {
            System.out.println("5% discount");
            dis = amount * 0.05;          
            amount = amount - dis;
        } else if (amount >= 1500) {
            System.out.println("10% discount");
            dis = amount * 0.10;         
            amount = amount - dis;
        }

        if (isFirstOrder) {
            System.out.println("extra 2% discount");
            dis = amount * 0.02;          
            amount = amount - dis;
        }

        return amount;
    }

    public static void main(String[] args) {
        System.out.println(calculateBill(20000, true));
    }
}
