public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = limit;
        balance = new Money(0);
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (amount.compareTo(creditLimit.subtract(balance)) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge of " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment of " + amount );
    }

    @Override
    public String toString() {
        return "Credit Card: balance=" + balance + ", creditLimit=" + creditLimit + ", owner=" + owner;
    }
}