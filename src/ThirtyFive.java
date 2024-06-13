import java.util.Scanner;

public class ThirtyFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Data");
        System.out.print("Input Number : ");
        int inputNumber = sc.nextInt();
        checkThirtyFive(inputNumber);
    }

    static void checkThirtyFive(int inputNumber){
        if(inputNumber > 0){
            System.out.println("Number is Positive.");
        }else{
            System.out.println("Number is Negative.");
        }
    }
}
