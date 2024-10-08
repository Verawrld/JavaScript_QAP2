public class Money {
    private long dollars;
    private long cents;

    // Constructor to initialize dollars and cents
    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    // Constructor to initialize from a double value
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - Math.floor(this.dollars)) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalDollars = this.dollars + otherAmount.dollars;
        long totalCents = this.cents + otherAmount.cents;
        if (totalCents >= 100) {
            totalDollars++;
            totalCents -= 100;
        }
        return new Money(totalDollars, totalCents);
    }

    public Money subtract(Money otherAmount){
        long totalDollars = this.dollars - otherAmount.dollars;
        long totalCents = this.cents - otherAmount.cents;
        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }
        return new Money(totalDollars, totalCents);

    }

    public int compareTo(Money otherAmount) {
        if (this.dollars < otherAmount.dollars) {
            return -1;
        } else if (this.dollars > otherAmount.dollars) {
            return 1;
        } else if (this.cents < otherAmount.cents) {
            return -1;
        } else if (this.cents > otherAmount.cents) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Money otherAmount) {
        return (this.dollars == otherAmount.dollars && this.cents == otherAmount.cents);
    }

    @Override
    public String toString() {
        return "$" + String.format("%d.%02d", dollars, cents);
    }

}
    