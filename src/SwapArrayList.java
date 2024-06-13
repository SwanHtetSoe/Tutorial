import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Pink");
        System.out.println("Array List : " + arrayList);
        swap(arrayList);
    }

    static void swap(ArrayList<String> arrayList){
        int red = 0;
        int black =0;
        for (int i = 0; i < arrayList.size(); i++) {
           switch (arrayList.get(i)){
               case "Red" -> red =i;
               case "Black" -> black=i;
           }
        }
        Collections.swap(arrayList,red,black);
        System.out.println("Swap : " + arrayList);
    }
}
