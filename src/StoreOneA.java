public class StoreOneA extends StoreToRent{

    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.1;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer){
        super(loanAmount, loanPaymentTerm, loanRequired);
        this.specialCustomer = specialCustomer;
    }

    public double calculateLoanFiancing(){
        monthlyPayment = super.calculateLoanFiancing();
        if(specialCustomer){
            return monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }else{
        return monthlyPayment;
        }
    }

    public void showStoreInfo(){
        System.out.println(toString());
        }
    
    public String toString(){
        String StoreToRent = super.toString();
        double loanAmount = getloanAmount();
        int loanPaymentTerm = getloanPaymentTerm();
        double INTEREST_RATE = getINTEREST_RATE();
        return StoreToRent + "LOAN DETAILS (if applicable): " + "\n" + 
        "Loan Amount: " + loanAmount +"\n" + 
        "Loan Payment Term: " + loanPaymentTerm + "\n" + 
        "Interest Rate: " + INTEREST_RATE +"\n" + 
        "Special Customer: " + specialCustomer +"\n" + 
        "Monthly Payment: " + monthlyPayment + "\n";
        }
    
    }

