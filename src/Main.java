import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double weight,length, bmi;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your weight in kg:");
        weight=input.nextDouble();

        System.out.print("Enter your length in m:");
        length=input.nextDouble();

        bmi=weight/(length*length);
        System.out.print("Your body mass index:" +bmi);
    }
}
