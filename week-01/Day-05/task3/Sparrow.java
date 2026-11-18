public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow can eat");
    }

    @Override
    public void chirp() {
        System.out.println("Sparrow can chirp");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
