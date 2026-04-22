class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int num1 = stack.pop();
                if (!stack.isEmpty()) {
                    int num2 = stack.pop();
                    result += num1 + num2;
                } else {
                    result += num1;
                }
            } else if (tokens[i].equals("*")) {
                int num1 = stack.pop();
                if (!stack.isEmpty()) {
                    int num2 = stack.pop();
                    result += num1 * num2;
                } else {
                    result *= num1;
                }
            } else if (tokens[i].equals("-")) {
                int num1 = stack.pop();
                if (!stack.isEmpty()) {
                    int num2 = stack.pop();
                    result += num1 - num2;
                } else {
                    result -= num1;
                }
            } else if (tokens[i].equals("/")) {
                int num1 = stack.pop();
                if (!stack.isEmpty()) {
                    int num2 = stack.pop();
                    result += (int) num1 / num2;
                } else {
                    result += (int) result / num1;
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return result;
    }
}
