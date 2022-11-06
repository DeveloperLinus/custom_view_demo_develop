package com.linus.threadlib;

import org.junit.Test;
class Father {
    public static String name = "老李";
    public void greeting() {
        System.out.println("Hello my name is ->" + name);
    }
}

class Daughter extends Father {
    public static String name = "老李";
    public void greeting() {
        super.greeting();
    }
}
public class FaceTest {
    @Test
    public void test01(){

    }
}
