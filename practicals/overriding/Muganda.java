public class Muganda extends Person {

    // Overriding the greeting method in Person
    public void greeting() {
        // A call to the superclass method
        super.greeting();

        System.out.println("Hello from muganda");
    }

    public int greeting(String x) {
        System.out.println(x);
        return 0;
    }

    public static void main(String[] args) {
        Muganda a = new Muganda();
        a.greeting("Hello");
        // System.out.println("Calling an overloaded method");
        // a.greeting("It's overloaded, Anyways Hello!");
    }
}
