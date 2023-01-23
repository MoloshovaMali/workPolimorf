public class Shark extends Animal{
    public static   Shark[]sharks;
    public static void attack(){
        System.out.println("Shark is attack");
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
}
