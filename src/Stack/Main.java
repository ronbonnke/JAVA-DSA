package Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack(5);
        stack.push(200);
        stack.push(554);
        stack.push(455);
        stack.push(975);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
    }
}