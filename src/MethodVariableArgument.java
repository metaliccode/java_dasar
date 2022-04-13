public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = { 80, 50, 50, 50 };
        sayCongrats("Ihsan", values);

        // dengan argument jadi simple
        sayCongrats("Rine", 80, 80, 80, 80);
    }

    // static void sayCongrats(String name, int[] values) {
    // dengan variable argument -> int ...
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue > 75) {
            System.out.println("Selamat " + name + ", anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus!");
        }
    }

}
