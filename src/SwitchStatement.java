public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Nilai Anda Lumayan Baik");
                break;
            case "C":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda Lulus Dengan Baik");
        }

        // switch lamda
//        switch (nilai){
//            case "A" -> System.out.println("Anda Lulus Dengan Baik");
//            default -> System.out.println("kontol");
//        }
    }
}
