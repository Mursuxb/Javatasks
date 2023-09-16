A class to represent a calculator that can sum positive integers and return the sum of them. Negative values are not allowed.
```
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
```
Values are stored in the instance variable value. The reset method sets the value to zero. The add method adds the value to the instance variable value.
The calculator throws an exception if the value is negative. The exception is thrown in the add method. To get the value, the getValue method is used.
