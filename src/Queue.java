import java.util.Arrays;
class Queue<T> {
    private T[] arr; // Array to store queue elements
    private int front, rear, size, capacity; // Variables to track front, rear, size, and capacity
    @SuppressWarnings("unchecked")
    public Queue(int arraySize) {
        // Constructor: Initializes the queue with a fixed size
        // Time Complexity: O(1)
        capacity = arraySize;
        arr = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void insert(T newItem) {
        // Inserts an element at the rear of the queue
        // Time Complexity: O(1)
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = newItem;
        size++;
    }
    public T remove() {
        // Removes and returns the front element of the queue
        // Time Complexity: O(1)
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = arr[front]; // Retrieve front element
        arr[front] = null; // Clear reference to avoid memory leaks
        front = (front + 1) % capacity; // Move front pointer circularly
        size--;
        return item;
    }
    public T peekFront() {
        // Returns the front element without removing it
        // Time Complexity: O(1)
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }
    public T peekRear() {
        // Returns the rear element without removing it
        // Time Complexity: O(1)
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[rear];
    }
    @Override
    public String toString() {
        // Converts the queue to a string representation
        // Time Complexity: O(n), where n is the size of the queue
        return Arrays.toString(arr);
    }
    public void display() {
        // Prints all elements in the queue
        // Time Complexity: O(n), where n is the size of the queue
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
