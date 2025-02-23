import java.util.Arrays;
public class Stack<T> {
    private T[] stackArray; // Array to store stack elements
    private int top; // Index of the top element
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        stackArray = (T[]) new Object[size]; // Create a generic array
        top = -1; // Initialize stack as empty
    }
    // Push an element onto the stack, time complexity (O(1))
    public void push(T item) {
        if (top == stackArray.length - 1) { // Check to see if stack is full
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = item; // Increase top and insert item
    }
    // Pop the top element from the stack, time complexity(O(1))
    public T pop() {
        return isEmpty() ? null : stackArray[top--]; // Return top element and decrement top
    }
    // Peek at the top element without removing it, time complexity (O(1))
    public T peek() {
        return isEmpty() ? null : stackArray[top];
    }

    // Check to see if the stack is empty, time complexity (O(1))
    public boolean isEmpty() {
        return top == -1;
    }
    // Display the stack elements, time complexity (O(n))
    public void display() {
        System.out.println("Stack: " + Arrays.toString(Arrays.copyOf(stackArray, top + 1)));
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // output stack
        System.out.println("Popped: " + stack.pop()); // remove and display top element
        System.out.println("Top element: " + stack.peek()); // show top element
        stack.display(); // last output
    }
}