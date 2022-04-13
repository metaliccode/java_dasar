public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Ihsan";
        stringArray[1] = "Miftahul";
        stringArray[2] = "Huda ";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        // cara lain
        String[] stringArray2 = new String[3];

        // Array Initializer
        String[] nama = {
                "ihsan", "budi", "rine"
        };

        nama[0] = "Ihsan Miftahul";

        int[] arrayInt = new int[] { 1, 2, 3, 4, 5 };
        long[] arrayLong = new long[] { 10L, 20L, 30L };

        System.out.println(arrayLong.length);
        System.out.println(nama[0]);

        // array didalam array
        String[][] members = {
                { "Ihsan", "Miftahul", "Huda" },
                { "Budi", "Rine", "Rina" },
                { "Dine" }
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
