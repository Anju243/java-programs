public class Example {

    public static void greet() {
        System.out.println("Welcome!");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Example.greet();

        Example example = new Example();
        example.sayHello();
    }
}

