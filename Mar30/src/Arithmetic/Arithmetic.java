package Arithmetic;

public class Arithmetic<N extends Number>{
    public N num1, num2;

    public Arithmetic(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display() {
        System.out.println(num1.getClass());
        System.out.println(num2.getClass());
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
