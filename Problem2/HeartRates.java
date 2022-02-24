package CS390Assignment2.Problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HeartRates {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double maxHeartRate;
    private double averageHeartRate;
    private final double REST_HEART_RATE = 70.0;
    private final double LOWER_BOUNDARY_TARGET = 0.5;
    private final double UPPER_BOUNDARY_TARGET = 0.85;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public HeartRates(){

    }
    public HeartRates(String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //calculate the current date with the given birthday
    public Period calculateAge(LocalDate givenBirthDate){
        LocalDate  today = LocalDate.now();
        return Period.between(givenBirthDate, today);
    }
    //converting the given String to date format and parse to int
    public LocalDate getBirthDay(String givenAgeInput){
        LocalDate dateOfBirth;
        while(true){
            try {
                dateOfBirth = LocalDate.parse(givenAgeInput, formatter);
                return dateOfBirth;
            }catch (DateTimeParseException e){
                System.out.println("Error! please try it again");
            }
        }
    }
    //calculating the max rate
    public double calculateMaxRates(int year){
        this.maxHeartRate = 220 - year;
        return maxHeartRate;
    }
    //calculating the average
    public double calculateAverageRates(){
        averageHeartRate = maxHeartRate - REST_HEART_RATE;
        return averageHeartRate;
    }
    //calculating lower boundary target
    public double calculateLowerBoundaryTarget(){
        return (averageHeartRate * LOWER_BOUNDARY_TARGET) + REST_HEART_RATE;
    }
    //calculating upper boundary target
    public double calculateUpperBoundaryTarget(){
        return (averageHeartRate * UPPER_BOUNDARY_TARGET) + REST_HEART_RATE;
    }
    @Override
    public String toString(){

        return "The Target Heart Rate Range is between "+ calculateLowerBoundaryTarget()+  " and " +calculateUpperBoundaryTarget()
                +"\nFirst Name: " + getFirstName()
                +"\nLast Name: " + getLastName()
                +"\nAge : "+ calculateAge(LocalDate.parse(dateOfBirth)).getYears()
                +"\nDate of birth : "+ this.getBirthDay(dateOfBirth)
                +"\nMaximum Heart Rate: "+ maxHeartRate;
    }
}
