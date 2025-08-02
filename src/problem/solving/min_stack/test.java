package problem.solving.min_stack;
public class test {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        System.out.println(obj.top()+" "+obj.getMin());
        obj.push(0);
        System.out.println(obj.top()+" "+obj.getMin());
        obj.push(-3);
        System.out.println(obj.top()+" "+obj.getMin());
        obj.pop();
        System.out.println(obj.top()+" "+obj.getMin());
        obj.pop();
        System.out.println(obj.top()+" "+obj.getMin());
    }
}
