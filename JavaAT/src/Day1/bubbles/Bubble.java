//BubbleTask (для него создаем отдельный пакет bubbles),
//-- создать класс Bubble
//-- у пузырька должен быть обьем, газовый состав
//-- он должен уметь лопаться с выводом в консоль «Cramp!»
//-- обьем пузырька постоянный и равен 0.3 мм2,
//  а газовый состав переменный в зависимости от образующего газа
//  и задается в конструкторе класса

package Day1.bubbles;

public class Bubble {
    private double VOLUME = 0.3;  // обьем пузырька постоянный и равен 0.3 мм2
    private double gasComposition;  //газовый состав

    public Bubble(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public Bubble() {}

    public double getVOLUME() {
        return VOLUME;
    }

    public double getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void makeCramp() {
        System.out.println("Cramp!");
    }
}
