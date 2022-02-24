package CS390Assignment2.Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your firstname");
        String firstName = input.next();
        System.out.println("Please, enter your lastName");
        String lastName = input.next();
        System.out.println("Please, enter your birth date in the format(yyyy-mm-dd)-Example 1989-04-14");
        String givenInput = input.next();

        //crating heartRates object
        HeartRates hr = new HeartRates(firstName,lastName,givenInput);
        LocalDate birthDay = hr.getBirthDay(givenInput);
       // Period age = hr.calculateAge(birthDay);

        System.out.println(hr.toString());
    }
}
