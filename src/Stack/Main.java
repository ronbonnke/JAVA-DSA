package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}