public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        System.out.println(iniByte);
        System.out.println(iniShort);

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
        /*
        * jk konversi manual dan melebihi kapasitasnya maka datanya akan kembali ke awal
        * */

        System.out.println(iniInt2);
        System.out.println(iniByte2);

    }
}
