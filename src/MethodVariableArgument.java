public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {90, 80, 70, 90, 69};

        sayCongrats("rizky", values);
        sayCongrats("Nami", 90,60,80,100,50);

    }

    // tanpa variable argument
//    static void sayCongrats(String name, int[] values) {
//        var total = 0;
//        for (var value : values) {
//            total += value;
//        }
//
//        var finalValue = total / values.length;
//
//        if (finalValue >= 75) {
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        } else {
//            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
//
//        }
//    }

    // dengan variable argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");

        }
    }
}
