package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {}

    public BusinessAccount(Integer id, String name, Double balance, Double loanLimit) {
        super(id, name, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance = balance + amount + 10.0;
        }
    }
}
