import bank.Balance;

public class Bank {

    
    public static void main(String args[]) {
        Balance current[]  = new Balance[3];
        current[0] = new Balance("Anish", -10.0);
        current[1] = new Balance("Sonu", 120.0);
        current[2] = new Balance("Anish", 100.0);

        for(int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}