import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        System.out.println("Is a Leap year ? : " + checkLeapYear(sc.nextInt()));
    }

    static boolean checkLeapYear(int year){
        if( year % 4 == 0 ){
            if(year % 100 == 0){
                return year % 400 == 0;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
