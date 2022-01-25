import java.util.*;

public class Average {
    public static void main(String[] args){
        Scanner number_input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = number_input.nextFloat();
        double number2 = number_input.nextFloat();
        double number3 = number_input.nextFloat();
        number_input.close();
        double mean = (number1 + number2 + number3)/ 3;
        String result_string = String.format("The average of %.1f %.1f %.1f is %.1f", number1, number2, number3, mean);
        System.out.println(result_string);
    }
}
