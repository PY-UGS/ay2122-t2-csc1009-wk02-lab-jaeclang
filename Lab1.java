public class Lab1{
    public static void main(String[] args){
        System.out.println("Hello, I am Jaden!");
        example3();
        example4();
    }
    public static void example3(){
        String module_code = "CSC1009";
        switch(module_code){
            case "CSC1006":
                System.out.println("Mathematics II");
                break;
            case "CSC1008":
                System.out.println("Data Structures & Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2902":
                System.out.println("Career & Professional Development");
                break;
            default:
                System.out.println("Invalid Module Code");
                break;
        }
        System.out.println("After switch");
    }
    public static void example4(){
        for(int x=101; x>66; x=x-2){
            System.out.print("value of x: " + x);
            System.out.print("\n");
        }
    }
}