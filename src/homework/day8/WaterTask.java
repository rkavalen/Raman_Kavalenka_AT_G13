package homework.day8;


import homework.day8.prep.Water;

import java.util.ArrayList;
import java.util.Arrays;

public class WaterTask {
    public static void main(String[] args) {
        Water[] waters = {new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")};

        ArrayList<Water> waterList = new ArrayList<>(Arrays.asList(waters));
        for (Water water : waterList) {
            System.out.println(water.getColor() + "-" + water.getSmell());
        }
    }
}
