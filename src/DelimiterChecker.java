public class DelimiterChecker {
    public static boolean check(String input){
        // Create a stack with a size of input length
        Stack<Character> stack = new Stack<>(input.length());

        // Time Complexity: O(n)
        //loop n times throughout input string
        for (char x : input.toCharArray()){
            if(x == '[' || x == '{' || x == '('){ // push it onto the stack - O(1)
                stack.push(x);
            }

            if (x == ')') { //check for matching opening delimiter
                // Time Complexity: O(1) - Peek and pop operations are O(1)
                if (stack.peek() == null || stack.pop() != '(') {
                    return false;
                }
            }
            if (x == '}') {//check for matching opening delimiter
                // Time Complexity: O(1) - Peek and pop operations are O(1)
                if (stack.peek() == null || stack.pop() != '{') {
                    return false;
                }
            }
            if (x == ']') {//check for matching opening delimiter
                // Time Complexity: O(1) - Peek and pop operations are O(1)
                if (stack.peek() == null || stack.pop() != '[') {
                    return false;
                }
            }
        }

        // Time Complexity: O(1) - Checking if all delimiters were matched
        return stack.isEmpty();
    }
}
