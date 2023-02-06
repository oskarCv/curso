package ds.stack;

public class Stack {
    private int maxSize;
    private int stackArray[];
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int item){
        top++;
        stackArray[top] = item;
    }
    public int pop(){
        int auxTop = top;
        top--;
        return stackArray[auxTop];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (maxSize -1 == top);
    }
}
