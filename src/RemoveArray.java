import java.util.Arrays;
import java.util.Scanner;

public class RemoveArray {

    static int[] array = {25,14,56,15,36};
    static int[] newArray={};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to remove : ");
        removeArray(sc.nextInt());
    }

    static void removeArray(int inputNumber) {
        for ( int i=0, j=0 ; i < array.length ; i++,j++ ) {
            newArray = Arrays.copyOf(newArray, newArray.length + 1);
            if (inputNumber == array[i]) {
                i+=1;
                if(i < array.length){
                    newArray[j] = array[i];
                }else{
                    newArray = Arrays.copyOf(newArray, newArray.length - 1);
                }
            }else{
                newArray[j] =array[i];
            }
        }
        System.out.println("New Array : " + Arrays.toString(newArray));
    }

}
