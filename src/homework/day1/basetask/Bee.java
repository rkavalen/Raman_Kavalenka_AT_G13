package homework.day1.basetask;

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
        System.out.println("Я легче лося в " + (500 / weight) + " раз");
    }
}
