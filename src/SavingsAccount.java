public class SavingsAccount implements BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    // Default Savings Account properties
    private static final double STANDARD_INTEREST_RATE = 0.01; // 1%
    private static final String STANDARD_BENEFITS = "Standard Savings Account";

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return STANDARD_INTEREST_RATE;
    }

    @Override
    public String showBenefits() {
        return STANDARD_BENEFITS;
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + STANDARD_INTEREST_RATE);
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }
}