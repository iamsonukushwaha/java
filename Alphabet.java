public class Alphabet {
    public void capital() {
        int i=65;
        while(i<=90) {
            System.out.print((char)i + " ");
            i++;
        }
    }

    public static void small() {  // by adding keyword 'static' this can be called without creating object
        int i=97;
        while(i<=122) {
            System.out.print((char)i + " ");
            i++;
        }
    }

    public static void main(String args[]) {
        Alphabet caps = new Alphabet();
        System.out.println("\n\t\tCapital Letters\t\n");
        caps.capital();

        System.out.println("\n\n\t\tSmall Letters\t\n");
        small();

    }
}