package ca.nait.dmit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void bmi1() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(100);
        bmi1.setHeight(66);
        assertEquals(16.1, bmi1.bmi() ,0.05);
        assertEquals("underweight", bmi1.bmiCategory());
    }

    @Test
    void bmi2() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(140);
        bmi1.setHeight(66);
        assertEquals(22.6, bmi1.bmi() ,0.05);
        assertEquals("normal", bmi1.bmiCategory());
    }

    @Test
    void bmi3() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(175);
        bmi1.setHeight(66);
        assertEquals(28.2, bmi1.bmi() ,0.05);
        assertEquals("overweight", bmi1.bmiCategory());
    }
    @Test
    void bmi4() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(200);
        bmi1.setHeight(66);
        assertEquals(32.3, bmi1.bmi() ,0.05);
        assertEquals("obese", bmi1.bmiCategory());
    }
}