
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard cardOfPaul = new PaymentCard(20);
        PaymentCard cardOfMatt = new PaymentCard(30);
        
        cardOfPaul.eatHeartily();
        cardOfMatt.eatAffordably();
        
        System.out.println("Paul: " + cardOfPaul);
        System.out.println("Matt: " + cardOfMatt);
        
        cardOfPaul.addMoney(20.0);
        cardOfMatt.eatHeartily();
        
        System.out.println("Paul: " + cardOfPaul);
        System.out.println("Matt: " + cardOfMatt);
        
        cardOfPaul.eatAffordably();
        cardOfPaul.eatAffordably();
        
        cardOfMatt.addMoney(50);
        
        System.out.println("Paul: " + cardOfPaul);
        System.out.println("Matt: " + cardOfMatt);
    }
}

