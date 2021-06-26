import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add() method without the index parameter

        languages.add("Java");
        languages.add("C");
        languages.add("Python");

        System.out.println("ArrayList : " + languages);
        
        // add element at the 3nd position
        languages.add(3,"JavaScript");

        System.out.println("Updated ArrayList : " + languages);

        // access ArrayList element
        String element = languages.get(2);
        System.out.println("Accessed element : " + element);

        // change element at index 1
        languages.set(1, "Kotlin");

        System.out.println("Updated ArrayList : " + languages);

        // remove element at index 2
        String element1 = languages.remove(2);
        System.out.println("Removed element : " + element1);
        System.out.println("Updated ArrayList : " + languages);



        // create an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(5);
        numbers.add(15);
        numbers.add(50);

        System.out.println("Integer ArrayList elements : " + numbers);
        System.out.println("Size of Integer ArrayList  : " + numbers.size());


        // access elements one by one

        for(int number : numbers) {
            System.out.println(number);
        }
        

    }
}