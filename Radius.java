import java.util.*;

public class Radius{
    public static void main(String[] args){
        Scanner radius_input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius_value = radius_input.nextDouble();
        radius_input.close();

        final double PI = 3.14159;
        double area = radius_value * radius_value * PI;
        System.out.println("The area for the circle of radius " + radius_value + " is " + area);
    }
}
