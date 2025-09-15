//-- создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects, и вызвать всего его методы

package Day1.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects TrainMethods = new TrainMethodsObjects();
        TrainMethods.processMouse();
        TrainMethods.processSouce();
        TrainMethods.processBee();
        TrainMethods.processObstacle();
        TrainMethods.processPineapple();
    }
}
