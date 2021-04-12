public class OperasiBoolean {

    public static void main(String[] args) {
        var nilaiAbsen = 60;
        var nilaiAkhir = 80;

        var lulusAbsen = nilaiAbsen >= 60;
        var lulusNilaiAkhir = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }

}
