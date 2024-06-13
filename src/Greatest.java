import java.util.Scanner;

public class Greatest {

    static int first,second,third,d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Test Data");
        System.out.print("Input the 1st number : ");
        first = sc.nextInt();
        System.out.print("Input the 2nd number : ");
        second = sc.nextInt();
        System.out.print("Input the 3rd number : ");
        third = sc.nextInt();
        System.out.println();
        System.out.println("Excpected Output :");
        System.out.println("The greatest : " + compareGreatest(first,second,third));
    }

    static int compareGreatest(int a,int b, int c){
        d=Math.max(a,b);
        return Math.max(d,c);
    }
}
