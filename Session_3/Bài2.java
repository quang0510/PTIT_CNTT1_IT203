package Session_3;

import java.util.Scanner;

public class Bài2 {
    public static int searchBooks (String[] arr ,String search ){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"sách 1" , "sách 2" , "sách 3", "sách 4" , "sách 5" };

        System.out.println("mời bạn nập tên sách cần tìm : ");
        String search = scanner.nextLine();

        int index = searchBooks(arr, search);

        if (index == -1){
            System.out.println("sách k tồn tại");
        }else {
            System.out.printf("tìm thấy sách %s tại vị trí index %d", search ,index);
        }
    }
}
