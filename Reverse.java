public class Reverse {
    public static void main(String[] args) {
        // number which is to be reversed
        int num = 1234;

        // initially set the reverse to be 0
        int reversed = 0;

        while(num != 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }

        System.out.println("Reversed Number : " + reversed);
        

    }
}
