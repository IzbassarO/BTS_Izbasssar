public class Main {
    public static void main(String[] args) {
        BTS<Integer, String> bst = new BTS<>();

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

        System.out.println("Size of BST: " + bst.size());
        System.out.println("Keys in BST:");

        for (Integer key : bst) {
            System.out.println(key);
        }

        System.out.println("Value of key 4: " + bst.get(4));
        bst.delete(4);
        System.out.println("Size of BST after deleting key 4: " + bst.size());

        System.out.println("Keys in BST after deleting key 4:");

        for (Integer key : bst) {
            System.out.println(key);
        }
    }
}