public class Scope {
    public static void main(String[] args) {
        sayHello("Kintil");
        sayHello("");

    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "hi " + name;
            System.out.println(hi);
//            System.out.println(hello);
        }

        System.out.println(hello);
        //System.out.println(hi); // tdk bisa menggil variable yg berbeda scope / harus didalam block nya
    }

}
