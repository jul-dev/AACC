public class InsuranceApp {
    public static void main(String[] args) {
    //Create and initialize a PolicyHolder object using the default constructor, naming it newPolicyHolder.
        PolicyHolder newPolicyHolder= new PolicyHolder();
        newPolicyHolder.setCustomerAge(45);
        newPolicyHolder.setPolicyNumber(1234);
        newPolicyHolder.setNumberOfAccidents(1);

        PolicyHolder ph2= new PolicyHolder(142, 2,0);
        PolicyHolder ph3= new PolicyHolder(345, 60,0);

        checkAccident(newPolicyHolder);
        checkAccident(ph2);
        checkAccident(ph3);
    }

    public static void checkAccident(PolicyHolder ph){
        if ((ph.getCustomerAge()>35)&& (ph.getNumberOfAccidents()<=1)){
            ph.displayPolicyHolder();

        }

    }
}
