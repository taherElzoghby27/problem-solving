package problem.solving.min_stack;

public class Node {

    private int value;
    private int minValue;

    public Node(int value, int minValue) {
        this.value = value;
        this.minValue = minValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

}
