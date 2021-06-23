package bank;

public class Balance {
    String name;
    double bal;
    public Balance(String n, double b) {  // made public to access outside the package otherwise it can be used inside the package
        name = n;
        bal = b;
    }

    public void show() {  // made public to access outside the package otherwise it can be used inside the package
        if(bal<0) {
            System.out.println(name + "'s Account is dead");
        } else {
            System.out.println(name + " : $ " + bal);
        }
    }
}