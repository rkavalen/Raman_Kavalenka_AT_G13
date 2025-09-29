package homework.day6;

import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.essence.craft.hand.*;
import playground.essence.creatures.*;
import playground.essence.material.*;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringClass = new GenericMethodsInGenericClassT<>();
        stringClass.setObject("Hey!");
        GenericMethodsInGenericClassT<Integer> integerClass = new GenericMethodsInGenericClassT<>();
        integerClass.setObject(1);
        GenericMethodsInGenericClassT<Double> doubleClass = new GenericMethodsInGenericClassT<>();
        doubleClass.setObject(1.12345);

        Copter aCopter = new Copter(223, "Mi8 Flyable");
        GenericMethodsInGenericClassT<Copter> copter = new GenericMethodsInGenericClassT<>();
        copter.setObject(aCopter);
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        GenericMethodsInGenericClassT<Plane> plane = new GenericMethodsInGenericClassT<>();
        plane.setObject(aPlane);
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        GenericMethodsInGenericClassT<Rocket> rocket = new GenericMethodsInGenericClassT<>();
        rocket.setObject(aRocket);

        Vehicle aVehicleCar = new Car(23, "Tesla X Vehicle");
        GenericMethodsInGenericClassT<Vehicle> vehicleCar = new GenericMethodsInGenericClassT<>();
        vehicleCar.setObject(aVehicleCar);
        Vehicle aVehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        GenericMethodsInGenericClassT<Vehicle> vehicleMoped = new GenericMethodsInGenericClassT<>();
        vehicleMoped.setObject(aVehicleMoped);
        Vehicle aVehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        GenericMethodsInGenericClassT<Vehicle> vehicleMotorbike = new GenericMethodsInGenericClassT<>();
        vehicleMotorbike.setObject(aVehicleMotorbike);

        Bottle aCocaBottle = new Bottle(10, "Coca");
        GenericMethodsInGenericClassT<Bottle> cocaBottle = new GenericMethodsInGenericClassT<>();
        cocaBottle.setObject(aCocaBottle);
        Can aCan = new Can(5, "Beans");
        GenericMethodsInGenericClassT<Can> can = new GenericMethodsInGenericClassT<>();
        can.setObject(aCan);
        Mug aMug = new Mug(5, "MyMug");
        GenericMethodsInGenericClassT<Mug> mug = new GenericMethodsInGenericClassT<>();
        mug.setObject(aMug);
        Beetle aBeetle = new Beetle(4, "Beetle");
        GenericMethodsInGenericClassT<Beetle> beetle = new GenericMethodsInGenericClassT<>();
        beetle.setObject(aBeetle);
        Carrot aCarrot = new Carrot(1, "Carrot");
        GenericMethodsInGenericClassT<Carrot> carrot = new GenericMethodsInGenericClassT<>();
        carrot.setObject(aCarrot);
        Chamomile aChamomile = new Chamomile(2, "Chamo");
        GenericMethodsInGenericClassT<Chamomile> chamomile = new GenericMethodsInGenericClassT<>();
        chamomile.setObject(aChamomile);
        Crocodile aCrocodile = new Crocodile(110, "Gena");
        GenericMethodsInGenericClassT<Crocodile> crocodile = new GenericMethodsInGenericClassT<>();
        crocodile.setObject(aCrocodile);
        Fly aFly = new Fly(23, "Domestica Fly");
        GenericMethodsInGenericClassT<Fly> fly = new GenericMethodsInGenericClassT<>();
        fly.setObject(aFly);
        Maylily aMaylily = new Maylily(1, "SimpleLily");
        GenericMethodsInGenericClassT<Maylily> maylily = new GenericMethodsInGenericClassT<>();
        maylily.setObject(aMaylily);
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");
        GenericMethodsInGenericClassT<Mosquito> mosquito = new GenericMethodsInGenericClassT<>();
        mosquito.setObject(aMosquito);
        Pigeon aPigeo = new Pigeon(1, "Pigeon");
        GenericMethodsInGenericClassT<Pigeon> pigeon = new GenericMethodsInGenericClassT<>();
        pigeon.setObject(aPigeo);
        Potato aPotato = new Potato(1, "Fries");
        GenericMethodsInGenericClassT<Potato> potato = new GenericMethodsInGenericClassT<>();
        potato.setObject(aPotato);
        Radish aRadish = new Radish(1, "Radish");
        GenericMethodsInGenericClassT<Radish> radish = new GenericMethodsInGenericClassT<>();
        radish.setObject(aRadish);
        Raven aRaven = new Raven(5, "SmartBoy");
        GenericMethodsInGenericClassT<Raven> raven = new GenericMethodsInGenericClassT<>();
        raven.setObject(aRaven);
        Rose aRose = new Rose(1, "Rose");
        GenericMethodsInGenericClassT<Rose> rose = new GenericMethodsInGenericClassT<>();
        rose.setObject(aRose);

        Diesel aDiesel = new Diesel();
        GenericMethodsInGenericClassT<Diesel> diesel = new GenericMethodsInGenericClassT<>();
        diesel.setObject(aDiesel);
        Petrol aPetrol = new Petrol();
        GenericMethodsInGenericClassT<Petrol> petrol = new GenericMethodsInGenericClassT<>();
        petrol.setObject(aPetrol);
        Water aWater = new Water();
        GenericMethodsInGenericClassT<Water> water = new GenericMethodsInGenericClassT<>();
        water.setObject(aWater);

        System.out.println(raven.getClass());
        System.out.println(raven.hashCode());

        System.out.println(stringClass.toString());
        System.out.println(integerClass.toString());
        System.out.println(doubleClass.toString());

        System.out.println(raven.equals(copter));

        stringClass.genericMethodOneGenArg("Ho!");
        integerClass.genericMethodOneGenArg(2);
        doubleClass.genericMethodOneGenArg(1.12345);

        copter.genericMethodOneGenArg(aCopter);
        copter.genericMethodOneGenArg(copter);
        copter.genericMethodOneGenArg(mug);
        water.genericMethodOneGenArg(aWater);
        water.genericMethodOneGenArg(water);
        water.genericMethodOneGenArg(mug);

        vehicleCar.genericMethodTwoGenArgs(aVehicleCar, vehicleCar);
        vehicleCar.genericMethodTwoGenArgs(vehicleMotorbike, vehicleMotorbike);
        vehicleCar.genericMethodTwoGenArgs(water, aWater);

        pigeon.genericMethodHalfGenArgs(aPigeo, "abcd");
        pigeon.genericMethodHalfGenArgs(pigeon, "12345");
        pigeon.genericMethodHalfGenArgs("1234", "123456");
        pigeon.genericMethodHalfGenArgs(1234, "123456");
    }
}
