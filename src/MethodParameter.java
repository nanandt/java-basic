public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Hasan", "Sadely", 20);
    }

    static void sayHello(String firstName, String lastName, Integer age) {
        System.out.println("Hello " + firstName + " " + lastName + " umur " + age);
    }
}
