package OOPS;
abstract class Animal{
    abstract void moves();
    abstract void kills();
    void eats(){
        System.out.println("This eats its favourite meal");
    }
    Animal(){
        System.out.println("Not all animals are good");
    }

}
class Horse extends Animal{
    String food_type;
    void moves(){
        System.out.println("It moves with 4 legs");
    }
    Horse(){
        System.out.println("Its a very good runner");
    }
    void eats(){
        System.out.println("They are usually" + this.food_type );
    }
    void kills(){
        System.out.println(1);
        return;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.eats();
        horse1.food_type="Herbivores";
        horse1.eats();
    }
}
