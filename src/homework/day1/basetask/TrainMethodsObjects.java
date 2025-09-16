package homework.day1.basetask;

public class TrainMethodsObjects {

    public void processMouse() {
        Mouse tom = new Mouse(5, "Jerry");
        System.out.println(tom.getName());
        System.out.println(tom.getAge());
        tom.printMouseDetails();
    }

    public void processSouce() {
        Souce demiglass = new Souce("demiglass", "brown");
        System.out.println(demiglass.getName());
        System.out.println(demiglass.getColor());
        demiglass.printSouceDetails();
    }

    public void processBee() {
        Bee maya = new Bee("beemale", 0.0002d);
        System.out.println(maya.getGender());
        System.out.println(maya.getWeight());
        maya.printBeeDetails();
    }

    public void processObstacle() {
        Obstacle earthShake = new Obstacle("землетрясение", "серьёзное");
        System.out.println(earthShake.getDescription());
        System.out.println(earthShake.getSeverity());
        earthShake.printObstacleDetails();
    }

    public void processPineapple() {
        Pineapple justPineapple = new Pineapple("A", 2140);
        System.out.println(justPineapple.getGrade());
        System.out.println(justPineapple.getHeatCapacity());
        justPineapple.printPineappleDetails();
    }
}
