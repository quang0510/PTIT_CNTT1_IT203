package Session_4;

public class Bài2 {
    public static void main(String[] args) {
        String str = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        if (str.contains("Kệ:")) {
            int start = str.indexOf("Kệ:") + 4; // bỏ "Kệ:"
            int end = str.indexOf(",", start);

            String temp = str.substring(start, end).trim();
            System.out.println("Vị trí tìm thấy: " + temp);
        }
        str = str.replace("Kệ:", "Vị trí tìm thấy:");
        System.out.println(str);
    }
    }
