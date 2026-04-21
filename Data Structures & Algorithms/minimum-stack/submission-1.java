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
            if(min > val)
            {
                min = val;
            }
            System.out.println("val = " + val +" & " + "min = " + min);
            stack.push(new int[]{val,min});
        }
        
    }
    
    public void pop() {
        System.out.println("Before POP val = " + val +" & " + "min = " + min);
        stack.pop();
        System.out.println("After POP val = " + val +" & " + "min = " + min);
        
    }
    
    public int top() {
        System.out.println("TOP val = " + val +" & " + "min = " + min);
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        System.out.println("GETMIN val = " + val +" & " + "min = " + min);
        return stack.peek()[1];
        
    }
}
