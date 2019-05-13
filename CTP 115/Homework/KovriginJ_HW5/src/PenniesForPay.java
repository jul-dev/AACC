import java.util.Scanner;


public class PenniesForPay {
    public static void main(String[] args) {

        //Ask the user for the number of days
        System.out.println("Please enter number of days to be calculate:");
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        calcAndDisplayPay(days);


    }
    //Accepts arg- number of days return nothing
    //Calculates daily pay in pennies, doubling amount each day
    //Displays each daily amount and total for number of days in dollars
    private static void calcAndDisplayPay(int numDays) {
       int i=1;
       double total=0;
       int dailyPay=1; //Daily pay starting with one pennie

        while (i<=numDays){
            System.out.println(i +" Day "+ dailyPay+ (char) 162  );
            total+=dailyPay;
            dailyPay *=2;
            i++;
        }
        System.out.println("______________________________");
        System.out.println("The total amount is $" + total/100 );
    }
}
