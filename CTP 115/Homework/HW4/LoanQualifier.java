import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        //Declare variables
        double salary;
        double yearsOnJob;

        //Get the annual salary.
        System.out.println("Enter your annual salary");
        Scanner sc=new Scanner(System.in);
        salary=sc.nextDouble();

        //Get the number of years on the current job.
        System.out.println("Enter the number of years on your current job");
        yearsOnJob=sc.nextDouble();

        //Determine whether the user qualifies.
        if (salary >= 30000 || yearsOnJob >= 2){
            System.out.println("You qualify for the loan");
        }else {
            System.out.println("You do not qualify for this loan");
        }


    }
}
