public class OperasiAritmatika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // augmented assignment
        int c = 100;
        c += 10; // c = c + 10
        System.out.println(c);

        c -= 10; // c = c - 10
        System.out.println(c);

        c *= 10; // c = c * 10
        System.out.println(c);

        // Unary operator
        // ++, --, -, +, !, ~
        int d = 100;
        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        d = -d;
        System.out.println(d);
    }
}
