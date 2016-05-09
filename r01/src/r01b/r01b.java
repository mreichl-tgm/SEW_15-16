package r01b;

public class r01b {
    public static void main(String[] args) {
        halloR(5);
    }

    static void halloR(int count) {
        System.out.println("Hallo");
        count--;
        if (count > 0) halloR(count);
    }
}