package homework.day6;

import java.util.Objects;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    private X object1;
    private Y object2;

    public X getObject1() {
        return object1;
    }

    public void setObject1(X object1) {
        this.object1 = object1;
    }

    public Y getObject2() {
        return object2;
    }

    public void setObject2(Y object2) {
        this.object2 = object2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericMethodsInGenericClassTwoParams<?, ?> that = (GenericMethodsInGenericClassTwoParams<?, ?>) o;
        return Objects.equals(object1, that.object1) && Objects.equals(object2, that.object2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object1, object2);
    }

    @Override
    public String toString() {
        return "GenericMethodsInGenericClassTwoParams{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }

    public <X> void genericMethodGenArgs(X object1) {
        System.out.println("I received 1 argument of type: " + object1.getClass().getSimpleName());
    }

    public <X, Y> void genericMethodGenArgs(X object1, Y object2) {
        System.out.println("I received 2 arguments of type: " + object1.getClass().getSimpleName() + ", " + object2.getClass().getSimpleName());
    }

    public <X> void genericMethodHalfGenArgs(X object1, String str) {
        System.out.println("I got an object of " + object1.getClass().getSimpleName() + " and string with " + str.length() + " characters");
    }

    public <X, Y> void genericMethodHalfGenArgs(X object1, Y object2, String str) {
        System.out.println("I got an object of " + object1.getClass().getSimpleName() + " and " + object2.getClass().getSimpleName() + " and string with " + str.length() + " characters");
    }
}
