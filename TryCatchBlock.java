public class TryCatchBlock {
    public static void main(String[] args) {
        // create an array with size 10
        int[] arr = new int[10];

        try {
            arr[10] = 11;
        } catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }
    }
}
