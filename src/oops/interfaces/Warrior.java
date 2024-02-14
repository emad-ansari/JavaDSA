package oops.interfaces;

public class Warrior implements Weapon, Characters {
    public void use(){
        System.out.println("Warrior use a sword");
    }

    public void attack() {
        System.out.println("Warrior attack with a sword");

    }    
}



class Mage implements Weapon, Characters{
    public void use(){
        System.out.println("Mage use a Wand");
    }

    public void attack() {
        System.out.println("Mage attack with a Wand");
    }
   
}