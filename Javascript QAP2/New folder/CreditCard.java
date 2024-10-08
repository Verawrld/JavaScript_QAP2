public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money   
 limit) {
        owner = newCardHolder;
        creditLimit = limit;   

        balance = Money.ZERO;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public Person getOwner() {
        return owner;
    }

    public void charge(Money amount) {
        if (amount.compareTo(creditLimit.subtract(balance)) <= 0) {
            balance = balance.add(amount);
        } else {
            throw new IllegalArgumentException("Charge exceeds credit limit.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return "Credit Card: balance=" + balance + ", creditLimit=" + creditLimit + ", owner=" + owner;
    }
}