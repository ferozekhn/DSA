import java.util.ArrayList;
class BasicArrayList{
    public static void main(String[] args) {
       ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Display the elements
        System.out.println("Dynamic Array: " + dynamicArray);

        // Access an element
        System.out.println("Element at index 1: " + dynamicArray.get(1));

        // Update an element
        dynamicArray.set(1, 25);
        System.out.println("Updated Dynamic Array: " + dynamicArray);

        // Remove an element
        dynamicArray.remove(2);
        System.out.println("After Removal: " + dynamicArray);

        // Check size
        System.out.println("Size of Dynamic Array: " + dynamicArray.size());
    }
}
