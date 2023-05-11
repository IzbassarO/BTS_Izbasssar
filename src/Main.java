public class Main {
    public static void main(String[] args) {
        BTS<Integer, String> bst = new BTS<>();

        // Testing put method
        bst.put(5, "five");
        bst.put(2, "two");
        bst.put(8, "eight");
        bst.put(1, "one");
        bst.put(3, "three");
        bst.put(7, "seven");
        bst.put(4, "four");
        bst.put(6, "six");
        bst.put(9, "nine");
        bst.put(10, "ten");
        bst.put(10, "shantaram");

        // Testing size method
        System.out.println("Size of BST: " + bst.size()); // Output: Size of BST: 10

        // Testing get method
        System.out.println("Value of key 4: " + bst.get(4)); // Output: Value of key 4: four

        // Testing delete method
        bst.delete(4);
        System.out.println("Size of BST after deleting key 4: " + bst.size()); // Output: Size of BST after deleting key 4: 9

        // Testing iterator
        System.out.println("Keys in BST:");
        for (Integer key : bst) {
            System.out.println(key); // Output: 1, 2, 3, 5, 6, 7, 8, 9, 10
        }

        // Testing deleteMin method
        bst.deleteMin();
        System.out.println("Size of BST after deleting minimum key: " + bst.size()); // Output: Size of BST after deleting minimum key: 8

        // Testing iterator after deleting minimum key
        System.out.println("Keys in BST after deleting minimum key:");
        for (Integer key : bst) {
            System.out.println(key); // Output: 2, 3, 5, 6, 7, 8, 9, 10
        }
    }
}
