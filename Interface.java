interface Callback {
    void callback(int param);
    void callback1();
}

// A java file can only have one public class 

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    public void callback1(){}
}

public class Interface {
    public static void main(String args[]) {
        Client c = new Client();
        c.callback(42);
    }
}