//создать класс Souce и в нем,
//-- строковое поле name
//-- строковое поле color
//-- конструктор, принимающий имя и цвет и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printSouceDetails, который печатает в консоль информацию о соусе в виде "Это соус <имя соуса> <цвет соуса> цвета"

package Day1.basetask;

public class Souce {

    private String name;
    private String color;

    public Souce(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }
}
