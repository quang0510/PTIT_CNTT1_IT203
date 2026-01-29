package Session_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MiniProject {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getInt("Nhập lựa chọn: ");

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1. Two Sum");
        System.out.println("2. Move Zeroes");
        System.out.println("3. Valid Palindrome");
        System.out.println("4. Reverse Words");
        System.out.println("5. Happy Number");
        System.out.println("0. Thoát");
        System.out.println("========================");
    }
    // ================= UTILS =================
    static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Nhập số hợp lệ: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    static int[] inputArray() {
        int n = getInt("Nhập số phần tử: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getInt("arr[" + i + "] = ");
        }
        return arr;
    }
    // ================= FR1: TWO SUM =================
    // Logic: Tìm 2 phần tử trong mảng có tổng bằng target
    // Sử dụng vòng lặp lồng nhau để kiểm tra tất cả cặp phần tử
    // Time complexity: O(n²), Space complexity: O(1)
    static void twoSum() {
        int[] arr = inputArray();
        int target = getInt("Nhập target: ");
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("Tìm thấy cặp chỉ số: [%d, %d] (giá trị: %d + %d = %d)\n", i, j, arr[i], arr[j],
                            arr[i] + arr[j]);
                    found = true;
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cặp nào");
        }
    }
    // ================= FR2: MOVE ZEROES =================
    // Logic: Dồn tất cả các phần tử khác 0 về đầu mảng, số 0 về cuối
    // Bước 1: Duyệt mảng, đưa các phần tử khác 0 lên đầu
    // Bước 2: Fill các vị trí còn lại bằng 0
    // Time complexity: O(n), Space complexity: O(1)
    static void moveZeroes() {
        int[] arr = inputArray();
        int index = 0; // Con trỏ để đánh dấu vị trí ghi phần tử khác 0
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.println("Mảng sau khi dồn 0:");
        System.out.println(Arrays.toString(arr));
    }
    // ================= FR3: VALID PALINDROME =================
    // Logic: Kiểm tra chuỗi có phải palindrome hay không (đọc xuôi ngược như nhau)
    // Bước 1: Sử dụng regex để loại bỏ ký tự không phải chữ cái, chuyển về
    // lowercase
    // Bước 2: So sánh ký tự từ đầu và cuối về giữa
    // Time complexity: O(n), Space complexity: O(n)
    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        scanner.nextLine(); // Clear buffer
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải Palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int len = cleaned.length();
        for (int i = 0; i < len / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    // ================= FR4: REVERSE WORDS =================
    public static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        scanner.nextLine();
        String[] text = s.trim().split("\\s+");
        String result = "";
        for (int i = text.length - 1; i >= 0; i--) {
            result += text[i] + " ";
        }
        System.out.println("Kết quả: " + result.trim());
    }
    // ================= FR5: HAPPY NUMBER =================
    static void happyNumber() {
        int n = getInt("Nhập số n: ");
        if (atminHappy(n)) {
            System.out.println("Là số hạnh phúc");
        } else {
            System.out.println("Không phải số hạnh phúc");
        }
    }
    static boolean atminHappy(int n) {
        HashSet<Integer> temp = new HashSet<>();
        while (n != 1) {
            if (temp.contains(n))
                return false;
            temp.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }
    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
