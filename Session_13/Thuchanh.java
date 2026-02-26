package Session_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Thuchanh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> countries = new ArrayList<>();

        while (true) {
            System.out.print("nhập tên quốc gia (nhập 0 để kết thúc): ");
            String name = sc.nextLine();

            if (name.equals("0")) {
                break;
            }

            countries.add(name);
        }

        System.out.println("\ndanh sách các quốc gia đã nhập:");

        for (String element : countries) {
            System.out.println(element);
        }
    }
}

