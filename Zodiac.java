import java.util.*;

public class Zodiac {
    public static void main(String[] args){
        Hashtable<Integer, String> zodiac_dict = new Hashtable<Integer, String>();
        zodiac_dict.put(0, "monkey");
        zodiac_dict.put(1, "rooster");
        zodiac_dict.put(2, "dog");
        zodiac_dict.put(3, "pig");
        zodiac_dict.put(4, "rat");
        zodiac_dict.put(5, "ox");
        zodiac_dict.put(6, "tiger");
        zodiac_dict.put(7, "rabbit");
        zodiac_dict.put(8, "dragon");
        zodiac_dict.put(9, "snake");
        zodiac_dict.put(10, "horse");
        zodiac_dict.put(11, "sheep");

        Scanner year_input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year_value = year_input.nextInt();
        year_input.close();

        int zodiac_num_value = year_value % 12;
        System.out.println(zodiac_dict.get(zodiac_num_value));

    }
}
