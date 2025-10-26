package homework.day8;

import java.io.*;
import java.util.ArrayList;

public class CarsTask {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars) {
            try (BufferedWriter bf = new BufferedWriter(new FileWriter("cars.txt", true))) {
                bf.write("\"" + car + "\"" + "\n");
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("cars.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        System.out.println();

        ArrayList<String> newCars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("cars.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() <= 6) {
                    newCars.add(line);
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("cars.txt"))) {
                bw.write("");
            }
            for (String car : newCars) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("cars.txt", true))) {
                    bw.write(car+"\n");
                }
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("cars.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line + " ");
            }
        }
    }
}
