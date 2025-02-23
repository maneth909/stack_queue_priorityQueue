// Min-PriorityQueue
// This class is generic, allowing any type T that implements the Comparable interface. This ensures that items can be compared based on their natural ordering.
class PriorityQueue<T extends Comparable<T>> {
    private T[] array;
    private int[] priorities;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    // Constructor
    public PriorityQueue(int arraySize) {
        capacity = arraySize;
        array = (T[]) new Comparable[capacity];
        priorities = new int[capacity];
        size = 0;
    }

    // Insert method. Time complexity: O(n)
    public void insert(T newItem, int priorityValue) {
        if (size == capacity) {
            System.out.println("PriorityQueue is full. Cannot insert " + newItem + " with priority " + priorityValue);
            return;
        }
        // Find the correct position before insert new item
        int i;
        for (i = size-1; i >= 0 && priorities[i] > priorityValue; i--) {
            array[i+1] = array[i];
            priorities[i+1] = priorities[i];
        }
        // Insert new item
        array[i+1] = newItem;
        priorities[i+1] = priorityValue;
        size++;
        System.out.println("Inserted: " + newItem + " with priority " + priorityValue);
    }

    // Time complexity: O(1)
    public boolean isEmpty(){
        return size == 0;
    }

    // Remove method. Time complexity: O(n)
    public T remove(){
        if (isEmpty()) {
            System.out.println("PriorityQueue is empty. Cannot remove any item.");
            return null;
        }
        // Get the item to be removed(the front ite with the smallest priority)
        T removedItem = array[0];
        // Shift elements left to fill the gap
        for (int i=0; i < size-1; i++) {
            array[i] = array[i+1];
            priorities[i] = priorities[i+1];
        }
        // Decrease the size of the PriorityQueue
        size--;
        System.out.println("Removed: " + removedItem);
        return removedItem;
    }

    // PeekFront method. Time complexity: O(1)
    public T peekFront() {
        if (isEmpty()) {
            System.out.println("PriorityQueue is empty. No item to peekFront");
            return null;
        }
        System.out.println("peekFront: " + array[0]);
        return array[0];
    }

    // PeekRear method. Time complexity: O(1)
    public T peekRear() {
        if (isEmpty()) {
            System.out.println("PriorityQueue is empty. No item to peekRear");
            return null;
        }
        System.out.println("peekRear: " + array[size-1]);
        return array[size-1];
    }

    // ToString method. Time complexity: O(n)
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        for (int i=0; i<size; i++) {
            string.append(array[i]);     //add the item
            string.append("(").append(priorities[i]).append(")");   //add its priority in parentheses
            // check if this is not the last element to add a comma
            if (i < size - 1) {
                string.append(", ");    //add a comma and space for separation
            }
        }
        string.append("]");
        return string.toString();
    }

    // Display method. Time complexity: O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("PriorityQueue is empty. No item to display");
            return;
        }
        System.out.println("PriorityQueue: " + toString());
    }
}
