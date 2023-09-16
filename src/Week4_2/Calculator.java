package Week4_2;

public class Calculator {
    private int value;

    public void reset() {
        this.value = 0;
    }

    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
        this.value += value;
    }

    public int getValue() {
        return this.value;
    }

    public Calculator() {
        this.value = 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.reset();
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        System.out.println(calculator.getValue());
    }
}
