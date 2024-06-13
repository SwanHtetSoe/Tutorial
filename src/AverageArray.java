public class AverageArray {

    public static void main(String[] args) {
        System.out.println("Average of [3,4,5,7,9] : " + findAverage());
    }

    static float findAverage(){
        int [] array = {3,4,5,7,9};
        int sum = 0;
        for( var a : array){
            sum +=a;
        }
        System.out.println(sum);
        System.out.println(array.length);
        return (float)sum/array.length;
    }
}
