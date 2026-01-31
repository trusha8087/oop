class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        double totalAmount = principal + (principal * rate * time / 100);
        double emi = totalAmount / (time * 12);

        System.out.println("Loan Type: Home Loan");
        System.out.println("EMI: ₹" + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double totalAmount = principal + (principal * rate * time / 100);
        double emi = totalAmount / (time * 12);

        System.out.println("Loan Type: Vehicle Loan");
        System.out.println("EMI: ₹" + emi);
    }

    void calculateEMI(int principal, int time) {
        double rate = 10.0;
        double totalAmount = principal + (principal * rate * time / 100);
        double emi = totalAmount / (time * 12);

        System.out.println("Loan Type: Personal Loan");
        System.out.println("EMI: ₹" + emi);
    }

    public static void main(String[] args) {
	System.out.println("Enrollnment no. 240390107034");
        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 20, 7.5f);

        System.out.println();

        loan.calculateEMI(300000.0, 5, 9.0);

        System.out.println();

        loan.calculateEMI(100000, 2);
    }
}