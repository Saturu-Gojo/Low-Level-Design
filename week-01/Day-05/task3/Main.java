public class Main {
    public static void feed(Bird b) {
        b.eat();
        b.chirp();
    }

    public static void fly(FlyingBird fb) {
        fb.fly();
        fb.chirp();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        System.out.println("--- Feeding All Birds (LSP in action) ---");

        feed(sparrow);
        feed(penguin);

        System.out.println("--FlyingAll Birds (LSP in action) ---");

        FlyingBird s = new Sparrow();
        fly(s);

    }
}
