import java.util.ArrayList;
import java.util.Collections;

class Sort {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);

        System.out.println("Unsorted ArrayList : " + numbers);



        // using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);


        // sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList : " + numbers);

        // search for element 2
        int pos = Collections.binarySearch(numbers,2);
        System.out.println("Position of 2 is : " + pos);

        // find the minimum element
        int min = Collections.min(numbers);
        System.out.println("Minimun element : " + min);

        // find the miximum element
        int max = Collections.max(numbers);
        System.out.println("Miximum element : " + max);
    }
}