package advanced.interfaces.example2;

import java.util.Random;

public class Baloon extends AirTransport implements Fly {

    public Baloon(int speed) {
        super(speed);
    }

    @Override
    public int calculateMaxSpeed() {
        Random random = new Random();
        return 100 / speed * random.nextInt();
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equalsIgnoreCase("good");
    }
}
