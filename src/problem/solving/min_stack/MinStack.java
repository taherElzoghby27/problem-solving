package problem.solving.min_stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<Node> stack;
    int top = -1;

    public MinStack() {
        stack = new ArrayList();
    }

    public void push(int val) {
        int currentMin = stack.isEmpty() ? val : Math.min(val, stack.get(top).getMinValue());
        Node node = new Node(val, currentMin);
        this.stack.add(node);
        ++top;
    }

    public void pop() {
        if (!this.stack.isEmpty()) {
            this.stack.removeLast();
            --top;
        }
    }

    public int top() {
        return this.stack.get(top).getValue();
    }

    public int getMin() {
        return this.stack.get(top).getMinValue();
    }
}
