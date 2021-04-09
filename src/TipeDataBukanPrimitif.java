public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;
        //byte iniByte = 0; // defautl value data primitif adalh 0
        // tipe data bukan primitif makan value nya harus di inisialisasi
        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100; // primitif
        Integer iniObject = iniInt; //konversi ke bukan primitif

        short iniShort = iniObject.shortValue(); // jika konversi bukan primitif ke data primitif tp td kompatibel maka gunakan function value
        long iniLong2 = iniObject.longValue();
    }
}
