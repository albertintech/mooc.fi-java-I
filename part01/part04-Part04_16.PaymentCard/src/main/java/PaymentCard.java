
/**
 *
 * @author albert
 */

public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void eatAffordably() {
        // code here
        if (this.balance < 2.6) {
            System.out.println("Cannot process charge. Insufficient balace.");
        } else {
            this.balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily() {
        // code here
        if (this.balance < 4.6) {
            System.out.println("Cannot process charge. Insufficient balace.");
        } else {
            this.balance = this.balance - 4.60;
        }
    }
    
    public void addMoney(double additionalFunds) {
        if (additionalFunds < 0) {
            System.out.println("Cannot add negative amount.");
        } else if (this.balance + additionalFunds > 150.0) {
            this.balance = 150.0;
        } else {
            this.balance = this.balance + additionalFunds;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
