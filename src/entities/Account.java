package entities;


import java.util.Date;

public class Account {
    private Integer id;
    private String name;
    protected Double balance;

    public Account() {}
    public Account(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount) {
        balance = balance - amount;
    }

    public void deposit(Double amount) {
        balance = balance + amount;
    }
}
