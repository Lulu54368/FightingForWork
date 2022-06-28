import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min_value = new Stack<>();

    public int MinStack() {
        return min_value.peek();
        
    }
    
    public void push(int val) {
        if(min_value.isEmpty() || min_value.peek() >= val){
            min_value.push(val);
        }
        stack.push(val);
        System.out.println("push "+ val);
        
    }
    
    public void pop() {
        System.out.println("pop "+ stack.peek());
        if(stack.peek().equals(min_value.peek())){
            min_value.pop();
        }
        stack.pop();
       
        
    }
    
    public int top() {
        System.out.println("top "+ stack.peek());
        return stack.peek();
        
    }
    
    public int getMin() {
        System.out.println("min "+ min_value.peek());
        return min_value.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */ 