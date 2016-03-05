package ua.artcode.wekk3;

/**
 * Created by serhii on 05.03.16.
 */
public class _02TestFormatter {


    public static void main(String[] args) {
        String name = "Oleg";
        int age = 30;
        double salary = 4000;
        boolean isStrong = true;

        String message = "name = " + name + " age " + age + "salary " + salary;


        // %s - String
        // %d - byte, short, int, long
        // %.2f - float, double
        String formatted = String.format("name = %s, age %d, salary %.2f, strong %s",
                                                    name, age, salary, isStrong);
        System.out.println(formatted);

        System.out.printf("name = %s, age %d, salary %.2f, strong %s",
                name, age, salary, isStrong);

    }
}
