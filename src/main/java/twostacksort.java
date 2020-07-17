import java.util.Stack;

public class twostacksort {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(3);
        stack1.push(1);
        stack1.push(6);
        stack1.push(5);
        stack1.push(4);
        while (!stack1.isEmpty()) {
            int number = stack1.pop();
            if (stack2.isEmpty()) stack2.push(number);
            else {
                int mark = stack2.peek();
                if (number > mark) stack2.push(number);
                else {
                    while (!stack2.isEmpty() && stack2.peek() > number) {
                        int temp = stack2.pop();
                        stack1.push(temp);
                    }
                    stack2.push(number);
                    while (!stack1.isEmpty() && stack1.peek() != mark) {
                        int temp = stack1.pop();
                        stack2.push(temp);
                    }
                    int temp = stack1.pop();
                    stack2.push(temp);
                }
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
