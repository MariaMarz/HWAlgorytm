package Algorithmus8;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.items);
        System.out.println(stack.getMax());
        System.out.println(stack.getMin());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.items);

    }
}
