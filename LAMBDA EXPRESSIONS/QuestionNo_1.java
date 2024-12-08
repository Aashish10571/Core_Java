// Write a Java program to implement a lambda expression to find the sum of two integers.

@FunctionalInterface
interface Sum {
    int sumOfNum(int a, int b);
}

public class QuestionNo_1 {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;

        System.out.println(sum.sumOfNum(1, 3));
    }
}
