import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("Initial HashMap : " + students);

        // put() method to add elements
        students.put(1, "Sonu");
        students.put(5, "Ankit");
        students.put(3, "Sumit");

        System.out.println("Updated HashMap : " + students);

        // getting value of key 5
        String value = students.get(5);
        System.out.println("student ( key 5 ) : " + value);

        // change value associated with key 3
        students.replace(3, "Nihal");
        System.out.println("Updated HashMap : " + students);


        // remove element associated with key 3
        String value1 = students.remove(3);
        System.out.println("Removed value : " + value1);
        System.out.println("Updated HashMap : " + students);

        // iterate through keys only
        System.out.println("Elements : ");
        for(Integer key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }
    }
}