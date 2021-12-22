import java.util.Scanner;

public class FindNumberOfDaysInMonth {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Month: ");
        int month = userInput.nextInt();

        System.out.println("Enter the year: ");
        int year = userInput.nextInt();


        int january = 31;
        int february = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 31;
        int october = 31;
        int november = 31;
        int december = 31;

        if (month == 1) {
            System.out.println("The month is January and has: " + january + " days");
        } else if (month == 2) {
            System.out.println("The month is February and has: " + february + " days");
        } else if (month == 3) {
            System.out.println("The month is March and has: " + march + " days");
        } else if (month == 4) {
            System.out.println("The month is April and has: " + april + " days");
        } else if (month == 5) {
            System.out.println("The month is May and has: " + may + " days" + " days");
        } else if (month == 6) {
            System.out.println("The month is June and has: " + june + " days");
        } else if (month == 7) {
            System.out.println("The month is July and has: " + july + " days");
        } else if (month == 8) {
            System.out.println("The month is August and has: " + august + " days");
        } else if (month == 9) {
            System.out.println("The month is September and has: " + september + " days");
        } else if (month == 10) {
            System.out.println("The month is October and has: " + october + " days");
        } else if (month == 11) {
            System.out.println("The month is November and has: " + november + " days");
        } else if (month == 12) {
            System.out.println("The month is December and has: " + december + " days");
        }


    }
}
