public class Turtle extends Animal{
    public static Turtle []turtles;
    public static void swim(){
        System.out.println("Turtle swimming");
    }

    @Override
    public void eat() {
        System.out.println("Turtle is eating");

    }
}