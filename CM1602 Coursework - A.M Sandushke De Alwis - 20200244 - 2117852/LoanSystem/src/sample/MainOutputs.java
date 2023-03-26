package sample;

//Main programme to run linear Search algorithm
public class MainOutputs{
    public static void main(String[] args) {
        int[] array = {45,23,78,69,15,26,25,77,10};
        int value = 25;
        System.out.println(value + " is in index number: " + linearSearch.search(array, value));
    }
}

///////////////////////////////////////////////////////

//import java.util.Arrays;

//Main programme to run binary Search algorithm
//public class MainOutputs{
//    public static void main(String[] args) {
//        int[] array = {45, 23, 78, 69, 15, 26, 25, 77, 10};
//        Arrays.sort(array);
//        BinarySearch binary = new BinarySearch();
//        int value = array.length;
//        int a = 77;
//        System.out.println("The searched value is at index: " + binary. binarySearch(array, 0, value-1, 77));
//    }
//}

