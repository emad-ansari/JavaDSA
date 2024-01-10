package oops.interfaces;


public class Car implements InterfaceExample{

    @Override
    public void startMedia() {
        System.out.println("Start the media");
    }

    @Override
    public void stopMedia() {
        System.out.println("Stop the media");

    }

    @Override
    public void startEngine() {
        System.out.println("start the car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the car");
    }
}

