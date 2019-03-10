public class PolicyHolder {
    private int policyNumber ;
    private int customerAge ;
    private int numberOfAccidents ;

    public PolicyHolder(int policyNumber, int customerAge, int numberOfAccidents) {
        this.policyNumber = policyNumber;
        this.customerAge = customerAge;
        this.numberOfAccidents = numberOfAccidents;
    }

    public PolicyHolder() {
        // initialize fields to none existing values
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    public void displayPolicyHolder (){
        //Display all fields
        System.out.println(" pn:"+policyNumber+" ca;"+customerAge+" na:"+numberOfAccidents);
    }




}
