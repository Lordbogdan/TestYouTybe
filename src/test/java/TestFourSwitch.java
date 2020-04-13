import java.util.Scanner;

public class TestFourSwitch {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sr.nextInt();
        while (true) {
            switch (age) {
                case 0:
                    System.out.println("You born");
                    break;
                case 6:
                    System.out.println("You went to school");
                    break;
                case 18:
                    System.out.println("You went to university"); //как сделать повтор?
                    break;
                default:
                    System.out.println("Failure");
            }
        }
    }
}
