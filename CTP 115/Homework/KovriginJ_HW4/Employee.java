public class Employee {

    private double payRate;
    private double hoursWorked;
    private double grossPay;

    public Employee(){

         payRate = 0.0;
         hoursWorked = 0.0;
         grossPay = 0.0;
    }

    public double getPayRate(){
        return payRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public double getGrossPay(){
        return grossPay;
    }

    public void setPayRate (double payRate) {
        if (payRate>0){
             this.payRate = payRate;
        } else {
            System.out.println("is not a valid pay rate");
            this.payRate = 0;
          }
    }

    public void setHoursWorked (double hoursWorked){
        if (hoursWorked>0){
            this.hoursWorked = hoursWorked;

        } else {
            System.out.println(hoursWorked+" is not a valid value for hours worked.");
            this.hoursWorked=0;
        }
    }

    public void computeGrossPay(){
        grossPay = payRate * hoursWorked;
        System.out.println("Gross pay is " + grossPay);
    }
}
