package Collection;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,8,9,10};
        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);

        int [] ar = {1,22,12,21,14,23,92,10};
        Arrays.sort(ar);

        Arrays.fill(arr, 18);
        for(int i:  ar){
        System.out.print(i+ " ");
        }

    }
}
