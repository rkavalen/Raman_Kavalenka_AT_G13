//-- создать класс Runner, содержащий main
//-- в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
//-- открыть поочередно все бутылки и выпустить из них газ


package Day1.bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(0.5);
//        Bottle bottle2 = new Bottle(1);
//        Bottle bottle3 = new Bottle(1.5);

        bottle1.open();
//        bottle2.open();
//        bottle3.open();
    }
}
