package homework.day8;

import java.util.ArrayList;

public class CitiesTask {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();

        int counter = 0;
        for (String city : cities) {
            counter += city.length();
        }
        System.out.println(counter + "\n");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
    }
}
