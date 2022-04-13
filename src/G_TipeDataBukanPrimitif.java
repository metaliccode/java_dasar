public class G_TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 100L;

        Byte iniByte = null;
        // byte iniByte2 = 0;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // konversi primitif ke non-primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}
