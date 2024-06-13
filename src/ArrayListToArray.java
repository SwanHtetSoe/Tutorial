import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {



    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Python");
        arraylist.add("Java");
        arraylist.add("PHP");
        arraylist.add("Perl");
        arraylist.add("C#");
        System.out.println("Array : " +  arraylistToArray(arraylist));

    }

    static String arraylistToArray(ArrayList<String> arraylist){
        String[] array = new String[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++) {
            array[i] = arraylist.get(i);
        }
        return Arrays.toString(array);
    }
}
