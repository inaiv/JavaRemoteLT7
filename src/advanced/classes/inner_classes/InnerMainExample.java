package advanced.classes.inner_classes;

public class InnerMainExample {
    public static void main(String[] ards) {
        Bicycle bicycle = new Bicycle(20);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();

        System.out.println(bicycle.getMaxSpeed());
    }
}
