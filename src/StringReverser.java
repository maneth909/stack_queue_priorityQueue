public class StringReverser {
    public static String reverser(String input){
        // Create a stack with a size of input length
        Stack<Character> stack = new Stack<>(input.length());

        // Time Complexity: O(n)
        //push each character of input string to stack
        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }

        //construct reversed string
        StringBuilder reversed = new StringBuilder();

        // Time Complexity: O(n)
        //pop each character form stack and append to StringBuilder
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        // Time Complexity: O(n)
        //convert StringBuilder to a string and return it
        return reversed.toString();
    }
}
