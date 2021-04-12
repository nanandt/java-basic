public class ForLoop {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("ga henti2");
//        }

//        var counter = 1;
//        for (; counter <= 10; ) {
//            System.out.println("perulangan ke - "+ counter);
//            counter++;
//        }

        for (var counter = 1; counter <= 10; ) {
            System.out.println("perulangan ke - " + counter);
            counter++;
        }
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("perulangan ke - " + counter);
        }
    }
}
