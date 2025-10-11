package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        loop(3, "Hello, world!");
        loop(5, "Hello, world!");
        loop(7, "Hello, world!");
    }
    public static void loop(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
