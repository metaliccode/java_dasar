public class Foreach {
    public static void main(String[] args) {
        var names = new String[] { "Budi", "Andi", "Caca" };

        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }

        // foreach
        for (var name : names) {
            System.out.println(name);
        }
    }
}
