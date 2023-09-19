import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hans", 25, 1.91, 89);
        System.out.println("BMI: " + person.BMI());

        //angivelse af delta
        if(24.39626106 > person.BMI()-0.0001 || 24.39626106 < person.BMI()+0.0001)
            System.out.println("BMI metode ok");
        else
            System.out.println("BMI metode fejl");
    }
}

