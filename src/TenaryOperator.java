public class TenaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;
        String ucapan2 = nilai >= 80 ? "Lulus" : "Tidak Lulus";

        // if (nilai >= 75) {
        // ucapan = "Lulus";
        // } else {
        // ucapan = "Tidak Lulus";
        // }

        // ternary operator
        ucapan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(ucapan);
        System.out.println(ucapan2);

    }
}
