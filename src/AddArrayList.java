import java.util.ArrayList;
import java.util.Arrays;

public class AddArrayList {

    public static void main(String[] args) {
        String[] array = {"Red","Green","Orange","White","Black"};
        addingArrayList(array);
    }

    static void addingArrayList(String[] array){
        System.out.println("Work");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList : " + arrayList);
    }


}

