package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AppTest {

    @Test
    public void TestLaske() {
        int fahrenheit = 5;
        double celsius = App.Laske(fahrenheit);
        double delta = 0.01;
        assertEquals(-15.0, celsius, delta);
    }

}
