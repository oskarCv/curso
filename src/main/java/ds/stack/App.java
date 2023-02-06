package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int counter = 1;
        while(!stack.isFull()){
            stack.push(counter);
            System.out.println("-> "+counter);
            counter++;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
