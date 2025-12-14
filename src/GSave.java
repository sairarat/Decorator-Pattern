public class GSave extends BankAccountDecorator {
    private static final double GSAVE_INTEREST_RATE = 0.025; // 2.5%
    private static final String GSAVE_BENEFIT = "GCash transfer";

    public GSave(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return GSAVE_INTEREST_RATE;
    }

    @Override
    public double computeBalanceWithInterest() {
        // Use the balance from the underlying account
        return decoratedAccount.getBalance() * (1 + GSAVE_INTEREST_RATE);
    }

    @Override
    public String showBenefits() {
        // Concatenate standard benefits with GSave specific benefit
        return decoratedAccount.showBenefits() + " + " + GSAVE_BENEFIT;
    }
}