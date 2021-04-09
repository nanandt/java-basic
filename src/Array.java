public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[4];
        stringArray[0] = "Bakul";
        stringArray[1] = "Sega";
        stringArray[2] = "Enak";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[5];

        String[] namaNama = {
          "Bakul", "Sega", "Enak"
        };

        int[] intArray = new int[]{
                1,3,5,7,8,9,10,20
        };

        long[] longArray = {
          20L, 30L, 40L
        };

        longArray[0] = 15L; // mengubah value array yg sudah ada

        System.out.println(longArray.length);
        System.out.println(longArray[0]);

        String[][] members = {
                {"wahyu", "save", "as"},
                {"slamet", "kang kayu"},
                {"aris"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][1]);

    }
}
