//создать класс TrainMethodsObjects и в нем,
//-- создать метод processMouse, который принимает на вход обьект мыши (Mouse) и печатает в консоль ее имя, возраст и вызывающий метод printMouseDetails
//-- создать метод processSouce, который принимает на вход обьект соуса (Souce) и печатает в консоль его имя, цвет и вызывающий метод printSouceDetails
//-- создать метод processBee, который принимает на вход обьект пчелы (Bee) и печатает в консоль ее пол, вес и вызывающий метод printBeeDetails
//-- создать метод processObstacle, который принимает на вход обьект препятствия (Obstacle) и печатает в консоль его описание, важность и вызывающий метод printObstacleDetails
//-- создать метод processPineapple, который принимает на вход обьект ананаса (Pineapple) и печатает в консоль его сорт, теплоемкость и вызывающий метод printPineappleDetails
//-- создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects, и вызвать всего его методы

package Day1.basetask;

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
