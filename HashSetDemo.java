import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        // add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("numbers : " + numbers);

        // create another Hashset
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("primeNumbers : " + primeNumbers);

        // union of two sets
        numbers.addAll(primeNumbers);
        System.out.println("union " + numbers);

        // create another Hashset
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);

        // intersection of two sets
        oddNumbers.retainAll(primeNumbers);
        System.out.println("intersection " + oddNumbers);

        // difference between primeNumbers and oddNumbers

        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference " + primeNumbers);


        // check if primeNumbers is a subset of numbers

        boolean result = numbers.containsAll(primeNumbers);

        if(result) {
            System.out.println("Set2 is a subset of Set1");
        } else {
            System.out.println("Set2 is NOT a subset of Set1");

        }


        

    }
}