class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].matches("-?\\d+")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                if (tokens[i].equals("+")) {
                    int num1 = stack.pop();
                    stack.push(stack.pop() + num1);
                }
                else if (tokens[i].equals("-")) {
                    int num1 = stack.pop();
                    stack.push(stack.pop() - num1);
                }
                else if (tokens[i].equals("*")) {
                    int num1 = stack.pop();
                    stack.push(stack.pop() * num1);
                }
                else if (tokens[i].equals("/")) {
                    int num1 = stack.pop();
                    stack.push((int) stack.pop() / num1);
                }
            }
        }
        return stack.pop();
    }
}
