public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(factorialRecursive(5));

        loop(10);
        // tes error stackoverflow
        loop(10000);
    }

    // factorial dengan looping
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // tes looping recursive stack overflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop = " + value);
            loop(value - 1);
        }
    }
}
