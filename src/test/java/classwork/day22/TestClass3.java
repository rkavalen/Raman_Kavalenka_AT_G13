package classwork.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass3 {
    @Test
    public void test1() {
        System.out.printf("TestClass3 test1 thread %s", Thread.currentThread().getName()).println();
        Assertions.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.printf("TestClass3 test2 thread %s", Thread.currentThread().getName()).println();
        Assertions.assertTrue(true);
    }

    @Test
    public void test3() {
        System.out.printf("TestClass3 test3 thread %s", Thread.currentThread().getName()).println();
        Assertions.assertTrue(true);
    }

    @Test
    public void test4() {
        System.out.printf("TestClass3 test4 thread %s", Thread.currentThread().getName()).println();
        Assertions.assertTrue(true);
    }

    @Test
    public void test5() {
        System.out.printf("TestClass3 test5 thread %s", Thread.currentThread().getName()).println();
        Assertions.assertTrue(true);
    }
}
