public abstract class BankAccountDecorator implements BankAccount {
    protected BankAccount decoratedAccount;

    public BankAccountDecorator(BankAccount decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    // Delegate all methods to the decoratedAccount by default
    @Override
    public String showAccountType() {
        return decoratedAccount.showAccountType();
    }

    @Override
    public double getInterestRate() {
        return decoratedAccount.getInterestRate();
    }

    @Override
    public double getBalance() {
        return decoratedAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return decoratedAccount.showBenefits();
    }

    @Override
    public double computeBalanceWithInterest() {
        return decoratedAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo() {
        return decoratedAccount.showInfo();
    }
}