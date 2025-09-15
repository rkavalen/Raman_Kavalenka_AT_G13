//создать класс Bee и в нем,
//-- строковое поле gender
//-- длинное целочисленное поле weight
//-- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"

package Day1.basetask;

public class Bee {
    private String gender;
    private double weight;

    public Bee(String gender, double weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + (500 /weight) +" раз");
    }
}
