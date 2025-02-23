public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        // Test push operation
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        stack.display();

//        String input = "Hello, World!";
//        String reversed = StringReverser.reverser(input);
//
//        // Print the original and reversed strings
//        System.out.println("Original String: " + input);
//        System.out.println("Reversed String: " + reversed);

//        String input1 = "f{a[s(gd)]sd}asd";
//        boolean delimeter = DelimiterChecker.check(input1);
//
//        System.out.println("Original String: " + input1);
//        System.out.println("Delimiter Check: " + delimeter);

//        PriorityQueue<String> priorityQueue = new PriorityQueue<>(5);
//        priorityQueue.insert("Task A", 1);
//        priorityQueue.insert("Task B", 0);
//        priorityQueue.insert("Task D", 5);
//        priorityQueue.insert("Task C", 3);
//        priorityQueue.insert("Task E", 4);
//
//        priorityQueue.display();
//
//        priorityQueue.peekFront();
//        priorityQueue.peekRear();
//
//        priorityQueue.remove();
//
//        priorityQueue.display();
    }
}