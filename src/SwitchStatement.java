public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;

            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }

        // Switch Case java 16 / switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow, anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Nilai Anda Cukup Baik");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        // menggunakan kata kunci yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Nilai Anda Cukup Baik";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);
    }
}
