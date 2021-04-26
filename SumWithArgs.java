public class SumWithArgs {
    public static void main(String[] args) {
        // int first = Integer.parseInt(args[0]);
        // int second = Integer.parseInt(args[1]);
        // System.out.println("Entered two number: " + first + " " + second);
        // int sum = first + second;
        // System.out.println("The sum is " + sum);

        /* using loop */

        int sum = 0;
        int product = 1;
        for(int i=0; i<args.length;i++) {
			// System.out.println(args[i] );
            
            sum += Integer.parseInt(args[i]);
            product *= Integer.parseInt(args[i]);
		}
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
    }
}