package advanced.interfaces.example2;

public class Main {
    public static void main(String[] args) {
        Baloon baloon = new Baloon(50);
        System.out.println(baloon.calculateMaxSpeed());
        System.out.println(baloon.canFly("bad"));

        Plane plane = new Plane(600);
        System.out.println(plane.calculateMaxSpeed());
        System.out.println(plane.canFly("bad"));

        AirTransport airTransport = new Baloon(1);
    }

}
