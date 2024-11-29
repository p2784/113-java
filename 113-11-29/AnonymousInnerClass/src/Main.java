public class Main {
    public static void main(String[] args) {
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, Anonymous Inner Class!");
            }
        };
        greeting2.sayHello();
        greeting2.sayHello();
    }
}
