import java.util.Arrays;
public class Stack<T> {
    T[] stackArray;
    int top;
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        stackArray = (T[]) new Object[size];
        top = -1;
    }
    public void push(T item) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = item;
    }
    public T pop() {
        return isEmpty() ? null : stackArray[top--];
    }
    public T peek() {
        return isEmpty() ? null : stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public String toString() {
        return "Stack: " + Arrays.toString(Arrays.copyOf(stackArray, top + 1));
    }
    public void display() {
        System.out.println(this);
    }
}