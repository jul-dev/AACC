import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {
        //Inventory object using default constructor
        Inventory obj=new Inventory();

        //Loop to get inventory items from user.
        //The user should enter the item number and the original price of the item
        //loop should continue until user indicates that they have no more items
        while (true){
            System.out.println("Do you have items to be entered? Enter yes or no");
            Scanner sc=new Scanner(System.in);
            String userInput=sc.nextLine();
            if (userInput.equals("no")){
                System.out.println("Exiting Inventory System");
                break;
            }
            createInventoryItem(obj);
            printSalesData(obj);
            System.out.println();
        }

    }

    private static void printSalesData(Inventory obj) {
        double currentPrice=obj.getOriginalPrice();
        for (int i=1;i<=7;i++){
            if (i>1)currentPrice=currentPrice*0.9;
           System.out.printf("Day %d ==> Price: %.2f  " ,i, currentPrice);
           System.out.println();
        }
    }

    private static void createInventoryItem(Inventory obj) {
        System.out.println("Please enter your item number");
        Scanner sc=new Scanner(System.in);
        obj.setItemNum(sc.nextInt());
        System.out.println("Please enter your item price");
        obj.setOriginalPrice(sc.nextDouble());
    }
}

