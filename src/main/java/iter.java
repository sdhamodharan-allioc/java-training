
import java.util.Iterator;
import java.util.ArrayList;
public class iter {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
         cars.add("crv");
         cars.add("Benz");
         cars.add("kia");
         cars.add("camry");
        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
