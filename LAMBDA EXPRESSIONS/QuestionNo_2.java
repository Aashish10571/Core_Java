// Write a Java program to implement a lambda expression to check if a given string is empty.

@FunctionalInterface
interface CheckEmpty {
    boolean isEmptyString(String str);
}

public class QuestionNo_2 {
    public static void main(String[] args) {
        CheckEmpty checkEmpty = (str) -> str.isEmpty();

        System.out.println(checkEmpty.isEmptyString(""));
    }
}
