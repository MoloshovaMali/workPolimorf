public class Main {
    public static void main(String[] args) {

        Shark shark=new Shark();
        Eagle eagle=new Eagle();
        Turtle turtle=new Turtle();
        Animal[]animals={shark,eagle,turtle};
        for(Animal animal:animals){
            if(animal instanceof Shark){
                Shark.sharks = new Shark[]{(Shark) animal};
                shark.eat();
                Shark.attack();
            }else if(animal.getClass().getName().equals("Turtle")){
                Turtle.turtles = new Turtle[]{(Turtle) animal};
                turtle.eat();
                Turtle.swim();
            }else{
                Eagle.eagles = new Eagle[]{(Eagle) animal};
                eagle.eat();
                Eagle.fly();
            }
        }


    }

}
