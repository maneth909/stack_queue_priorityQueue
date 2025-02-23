import java.util.Arrays;
class Queue<T> {
    private T[] arr;
    private int front, rear, size, capacity;
    @SuppressWarnings("unchecked")
    public Queue(int arraySize) { // Constructor - O(1)
        capacity = arraySize;
        arr = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty() { // O(1)
        return size == 0;
    }
    public boolean isFull() { // O(1)
        return size == capacity;
    }
    public void insert(T newItem) { // O(1)
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = newItem;
        size++;
    }
    public T remove() { // O(1)
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = arr[front];
        arr[front] = null;
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    public T peekFront() { // O(1)
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }
    public T peekRear() { // O(1)
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[rear];
    }
    @Override
    public String toString() { // O(n)
        return Arrays.toString(arr);
    }
    public void display() { // O(n)
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (Front -> Rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}