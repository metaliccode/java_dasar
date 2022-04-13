public class F_Variable {
    public static void main(String[] args) {
        String nama;
        nama = "Ihsan Miftahul Huda";

        System.out.println(nama);

        int umur = 26;
        String alamat = "Bandung";
        System.out.println(umur);
        System.out.println(alamat);

        nama = "Rine";
        System.out.println(nama);

        // sejak java versi 10 sudah bisa menggunakan VAR
        var namaLengkap = "Ihsan Miftahul Huda";
        // kata kunci Final / const
        final String namaDepan = "Ihsan";
        // namaDepan = "Rine"; // error

    }
}
