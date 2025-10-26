package classwork.day2;

public class Test {

    public static int count;
    public static final double PI = 3.14;

    private int id;

    public Test(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void main(String[] args) {
        Test test1 = new Test(2);
        Test test2 = new Test(2);

        test1.setId(3);
        test2.setId(4);
        test1.count = 5;
        test2.count = 6;
//        test1.PI = 7;
//        test2.PI = 8;

        System.out.println(test1.getId());
        System.out.println(test2.getId());
        System.out.println(test1.count);
        System.out.println(test2.count);
        System.out.println(test1.PI);
        System.out.println(test2.PI);
    }
}
