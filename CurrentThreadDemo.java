public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread " + t);
        
        // change the name of the thread
        t.setName("MyThread");
        System.out.println("after name change " + t);
        
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(2000);
                
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
            
        }
        
    }
}
