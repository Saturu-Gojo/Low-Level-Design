public class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin can eat");
    }

    @Override
    public void chirp() {
        System.out.println("Penguin can chirp");
    }

    public void swim() {
        System.out.println("Penguin can swim");
    }
}
