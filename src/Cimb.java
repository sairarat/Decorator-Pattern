public class Cimb {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        account.setAccountNumber(1234);
        account.setAccountName("Juan Dela Cruz");
        account.setBalance(10000.0);

        System.out.println(account.showInfo());
        System.out.println("Account type: " + account.showAccountType());
        System.out.println("Interest rate: " + String.format("%.1f", account.getInterestRate() * 100) + "%");
        System.out.println("New balance: " + String.format("%.2f", account.computeBalanceWithInterest()));
        System.out.println("Benefits: " + account.showBenefits());

        System.out.println("----------------------");

        GSave gSave = new GSave(account);
        System.out.println(gSave.showInfo());
        System.out.println("Account type: " + gSave.showAccountType());
        System.out.println("Interest rate: " + String.format("%.1f", gSave.getInterestRate() * 100) + "%");
        System.out.println("New balance: " + String.format("%.2f", gSave.computeBalanceWithInterest()));
        System.out.println("Benefits: " + gSave.showBenefits());

        System.out.println("----------------------");

        UpSave upSave = new UpSave(account);
        System.out.println(upSave.showInfo());
        System.out.println("Account type: " + upSave.showAccountType());
        System.out.println("Interest rate: " + String.format("%.1f", upSave.getInterestRate() * 100) + "%");
        System.out.println("New balance: " + String.format("%.2f", upSave.computeBalanceWithInterest()));
        System.out.println("Benefits: " + upSave.showBenefits());
    }
}