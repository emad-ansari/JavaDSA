package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        car.startMedia();
        car.stopEngine();

        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        warrior.use();
        warrior.attack();

        mage.use();
        mage.attack();
    }
}
