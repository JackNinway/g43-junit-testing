package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void test_isAdult_true(){
        int age = 18;
        boolean isAdult = Main.isAdult(age);

        Assertions.assertTrue(isAdult);
    }
    @Test
    public void test_isAdult_false(){
        //Arrange - Prepare values in order to preform test.
        int age = 11;

        //Act - Calling the method we intend to test.
        boolean actualValue = Main.isAdult(age);

        //Assert - Making sure, verify the value as expected.
        Assertions.assertFalse(actualValue);
    }
}
