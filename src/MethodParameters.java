public class MethodParameters {
    public static void main(String[] args) {
        sayHello("Ihsan Miftahul Huda", 26);
    }

    static void sayHello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
    }
}
