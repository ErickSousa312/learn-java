package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer id, String name, Double balance, Double interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance = balance*interestRate/100;
    }
}
