class MinStack {
    Stack<int[]> stack;
    int min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            min = val;
            stack.push(new int[] {val, min});
        } else {
            min = stack.peek()[1];
            if (min > val) {
                min = val;
            }
            stack.push(new int[] {val, min});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
