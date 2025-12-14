public class UpSave extends BankAccountDecorator {
    private static final double UPSAVE_INTEREST_RATE = 0.040; // 4.0%
    private static final String UPSAVE_BENEFIT = "With Insurance";

    public UpSave(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return UPSAVE_INTEREST_RATE;
    }

    @Override
    public double computeBalanceWithInterest() {
        // Use the balance from the underlying account
        return decoratedAccount.getBalance() * (1 + UPSAVE_INTEREST_RATE);
    }

    @Override
    public String showBenefits() {
        // Concatenate standard benefits with UpSave specific benefit
        return decoratedAccount.showBenefits() + " + " + UPSAVE_BENEFIT;
    }
}