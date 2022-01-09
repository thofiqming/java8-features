package dataStructureImpl;

import java.util.LinkedList;
import java.util.List;

public class StackImpl {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        System.out.println(stack);
    }
}

class Stack<T> {

    List<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T element) {
        this.list.add(element);
    }

    public T pop() {
        int top = this.list.size() - 1;
        if (top < 0) {
            throw new IllegalArgumentException("Invalid Stack Size");
        }
        T element = this.list.get(top);
        this.list.remove(top);
        return element;
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
