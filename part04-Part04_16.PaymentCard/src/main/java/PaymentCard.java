public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return String.format("The card has a balance of %s euros", balance);
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }

    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (balance + amount <= 150) {
                balance += amount;
            } else {
                balance = 150;
            }
        }
    }
}
