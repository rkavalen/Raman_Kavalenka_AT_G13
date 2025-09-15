//создать класс Mouse и в нем,
//-- строковое поле name
//-- целочисленное поле age
//-- конструктор, принимающий имя и возраст и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printMouseDetails, который печатает в консоль информацию о мыши в виде "Я мышь, меня зовут <имя мыши> и мне <возраст мыши> лет"

package Day1.basetask;

public class Mouse {
    private String name;
    private int age;

    public Mouse(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }
}
