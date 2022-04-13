public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100, 100);
        System.out.println(result);

        System.out.println(sum(100, 300));

        System.out.println(hitung(10, "+", 100));
        System.out.println(hitung(100, "-", 30));
        System.out.println(hitung(100, "*", 30));
    }

    static int sum(int a, int b) {
        var total = a + b;
        return total;
    }

    static int hitung(int a, String operasi, int b) {
        switch (operasi) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}
