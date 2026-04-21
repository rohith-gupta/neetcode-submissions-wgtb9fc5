class MinStack {

    Stack<int[]> stack;
    int min;

    public MinStack() {

        stack = new Stack<>();

         
    }
    
    public void push(int val) {
        
        if(stack.isEmpty())
        {
            min = val;
            System.out.println("val = " + val +" & " + "min = " + min);
            stack.push(new int[]{val,min});
        }
        else 
        {
            min = stack.peek()[1];
            if(min > val)
            {
                min = val;
            }
            System.out.println("val = " + val +" & " + "min = " + min);
            stack.push(new int[]{val,min});
        }
        
    }
    
    public void pop() {
        System.out.println("Before POP val = " + stack.peek()[0] +" & " + "min = " + min);
        stack.pop();
        
    }
    
    public int top() {
        System.out.println("TOP val = " + stack.peek()[0] +" & " + "min = " + min);
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        System.out.println("GETMIN val = " + stack.peek()[0] +" & " + "min = " + min);
        return stack.peek()[1];
        
    }
}
