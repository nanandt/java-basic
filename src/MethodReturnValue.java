public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(200, 90);
        System.out.println(result);

        System.out.println(sum(500, 500));

        System.out.println(hitung(200, "-", 90));
        System.out.println(hitung(200, "+", 30));
        System.out.println(hitung(20, "*", 90));
        System.out.println(hitung(20, "salah", 90));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            default:
                return 0;
        }

    }
}
