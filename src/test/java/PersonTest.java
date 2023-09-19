import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void BMI() {
        Person person = new Person("Hans", 25, 1.91, 89);
        double expectedValue = 24.39626106;
        double actualValue = person.BMI();
        double delta = 0.0001;

        assertEquals(expectedValue,actualValue, delta);
    }
}