//  Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

interface Convert {
    String converString(String str);
}

public class QuestionNo_3 {
    public static void main(String[] args) {
        Convert uppercase = (str) -> str.toUpperCase();
        Convert lowercase = (str) -> str.toLowerCase();

        System.out.println(uppercase.converString("hello"));
        System.out.println(lowercase.converString("HellO"));
    }
}
