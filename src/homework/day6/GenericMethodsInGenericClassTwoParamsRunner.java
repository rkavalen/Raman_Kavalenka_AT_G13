package homework.day6;

import playground.essence.craft.air.Copter;
import playground.essence.craft.field.Car;
import playground.essence.craft.field.Vehicle;
import playground.essence.craft.hand.Bottle;
import playground.essence.creatures.Raven;
import playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> one = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, String> oneone = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> two = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> three = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> four = new GenericMethodsInGenericClassTwoParams<>();

        one.setObject1("1");
        one.setObject2("11");
        two.setObject1("2");
        two.setObject2(22);
        three.setObject1("3");
        three.setObject2(33.0d);
        four.setObject1(4);
        four.setObject2(44);

        System.out.println(one.getObject1());
        System.out.println(one.getObject2());
        System.out.println(two.getObject1());
        System.out.println(two.getObject2());
        System.out.println(three.getObject1());
        System.out.println(three.getObject2());
        System.out.println(four.getObject1());
        System.out.println(four.getObject2());

        oneone.setObject1("11");
        oneone.setObject2("1");
        System.out.println(one.equals(oneone));

        System.out.println(oneone.toString());
        System.out.println(oneone.hashCode());
        oneone.genericMethodGenArgs("new String");
        oneone.genericMethodGenArgs("obj", "obj");
        oneone.genericMethodHalfGenArgs("obj", "obj");
        oneone.genericMethodHalfGenArgs("obj", "obj", "obj");

        Copter aCopter = new Copter(223, "Mi8 Flyable");
        Vehicle aVehicleCar = new Car(23, "Tesla X Vehicle");
        Bottle aCocaBottle = new Bottle(10, "Coca");
        Raven aRaven = new Raven(5, "SmartBoy");
        Water aWater = new Water();

        GenericMethodsInGenericClassTwoParams<Copter, Vehicle> machines = new GenericMethodsInGenericClassTwoParams<>();
        machines.setObject1(aCopter);
        machines.setObject2(aVehicleCar);
        System.out.println(machines.getObject1() + " " + machines.getObject2());
        System.out.println(machines.toString());

        machines.genericMethodGenArgs(aCocaBottle);
        machines.genericMethodGenArgs(aRaven,aWater);
        machines.genericMethodHalfGenArgs(aRaven, "mama");
        machines.genericMethodHalfGenArgs(aCopter, aVehicleCar, "1234556");
    }
}
