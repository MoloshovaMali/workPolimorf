public class Eagle extends Animal {
    public  static Eagle[] eagles;

    public static void fly(){
        System.out.println("eagle flying");
    }

    @Override
    public void eat() {
        System.out.println("eagle is eating");
    }
}