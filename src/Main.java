import restaurant.Restaurant;
import restaurant.Visitor;
import restaurant.Waiter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Restaurant restaurant = new Restaurant();
        List<Visitor> visitors = new ArrayList<>(10);
        visitors.add(new Visitor("Олег", restaurant));
        visitors.add(new Visitor("Володя", restaurant));
        visitors.add(new Visitor("Генадий", restaurant));
        visitors.add(new Visitor("Глеб", restaurant));
        visitors.add(new Visitor("Валентина", restaurant));
        visitors.add(new Visitor("Борис", restaurant));
        visitors.add(new Visitor("Варвара", restaurant));
        visitors.add(new Visitor("Леонид", restaurant));
        visitors.add(new Visitor("Анжела", restaurant));
        visitors.add(new Visitor("Григорий", restaurant));

        List<Waiter> waiters = new ArrayList<>(2);
        waiters.add(new Waiter("Остап", restaurant));
        waiters.add(new Waiter("Роза", restaurant));

        for (Visitor visitor : visitors) {
            visitor.start();
        }

        for (Waiter waiter : waiters) {
            waiter.start();
        }
    }
}
