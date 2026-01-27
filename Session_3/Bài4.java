package Session_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bài4 {
    public static void sortBooks(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr){
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d \t" , arr[i]);
//        }
    }

    public static void main(String[] args) {
        int[] arr ={105 , 102 , 109 , 101 ,103};

        System.out.print("mảng trước khi sắp xếp là : ");
        System.out.println(Arrays.toString(arr));


        sortBooks(arr);
        System.out.print("mảng sau khi sắp xếp là : ");
        displayBooks(arr);

    }
}
