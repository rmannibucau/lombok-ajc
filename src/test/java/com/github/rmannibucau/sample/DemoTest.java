package com.github.rmannibucau.sample;

import org.junit.Test;

public class DemoTest {
    @Test
    public void run() {
        final Demo demo = new Demo("JUnit");
        demo.sayHi();
        demo.getName();
    }
}
