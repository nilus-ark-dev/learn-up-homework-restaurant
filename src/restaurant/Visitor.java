package restaurant;

public class Visitor extends Thread {

    private final Restaurant restaurant;

    public Visitor(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.makesOrder();
    }
}
