package Session_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bài2 {
    public static void main(String[] args) {
        ArrayList<String> hospital = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng thuốc muốn thêm : ");
        int sum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sum ; i++) {
            System.out.printf("Nhập loại thuốc thứ %d : " , i+1);
            String str = sc.nextLine();
            hospital.add(str);
        }

        System.out.println(" danh sách loại thuốc : " +hospital);

        ArrayList<String> newHospital = new ArrayList<>();

        for (String e : hospital){
            if(!newHospital.contains(e)){
                newHospital.add(e);
            }
        }
        Collections.sort(newHospital);

        System.out.println("danh sách sau khi lọc trùng và sắp xếp : "+newHospital);
    }
}
