package collection;

import java.util.Stack;

public class SatckApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Rigan");
        stack.push("Nur");
        stack.push("Fauzi");

        for (var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }

    }
}
