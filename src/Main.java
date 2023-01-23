public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(),
                new Turtle(),
                new Eagle()};
        for (Animal ani : animals) {
            if (ani instanceof Shark) {
                ((Shark) ani).attack();
            } else if (ani.getClass().getName().equals("Turtle")) {
                ((Turtle) ani).swim();
            } else if (ani.getClass().getName().equals("Eagle")) {
                ((Eagle) ani).fly();
                ani.eat();
            }
        }
    }
}
