package ex04;

public class Account {
    private Integer number;
    private String holder;
    private double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public  Account(Integer number, String holder){
        this.number = number;
        this.holder = holder;

    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account, " + number + " Holder: " + holder + " ,Balance: $ " + balance;

    }

    public void deposit(double amaunt){
        balance += amaunt;
    }

    public void withdraw (double amaunt){
        balance = balance - amaunt - 5;
    }
}
