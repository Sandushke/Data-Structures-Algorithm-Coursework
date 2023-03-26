package sample;

public class BinarySearch {
    static int binarySearch(int array[], int a, int b, int c){
        if(b >= a){
            int midVal = (a + b) /2;
            if(array[midVal] ==  c){
                return midVal;
            }
            if(array[midVal] > c){
                return binarySearch(array, a, midVal -1, c);
            }
            return binarySearch(array, midVal + 1, b, c);
        }else{
            return -1;
        }
    }
}
