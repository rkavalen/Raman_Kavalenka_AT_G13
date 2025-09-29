package homework.day6;

import java.util.Objects;

public class GenericMethodsInGenericClassT<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericMethodsInGenericClassT<?> that = (GenericMethodsInGenericClassT<?>) o;
        return Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(object);
    }

    @Override
    public String toString() {
        return "GenericMethodsInGenericClassT{" +
                "object=" + object +
                '}';
    }

    public <X> void genericMethodOneGenArg(X object) {
        System.out.println("I am an object of " + object.getClass().getSimpleName() + " class");
    }

    public <X, Y> void genericMethodTwoGenArgs(X object1, Y object2) {
        System.out.println("We are objects of " + object1.getClass().getSimpleName() + " class and " + object2.getClass().getSimpleName() + " class");
    }

    public <X> void genericMethodHalfGenArgs(X object1, String object2) {
        System.out.println("I got an object of " + object1.getClass().getSimpleName() + " and string with " + object2.length()+ " character");
    }
}