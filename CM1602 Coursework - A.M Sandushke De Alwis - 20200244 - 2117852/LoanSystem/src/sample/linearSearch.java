package sample;

public class linearSearch {
    public static int search(int array[], int a) {
        int x = array.length;
        for(int i = 0; i < x; i++){
            if(array[i] == a){
                return i;
            }
        }
        return -1;
    }
}
