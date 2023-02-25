import java.util.HashSet;
public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        boolean isMazdaAvailable = cars.contains("Mazda");
        System.out.println(isMazdaAvailable);
        System.out.println(cars);
        cars.size();
        for (String i : cars) {
            System.out.println(i);
        }
    }
}