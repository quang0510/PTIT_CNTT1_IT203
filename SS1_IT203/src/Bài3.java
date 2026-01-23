public class Bài3 {
    public static void main(String[] args) {

        String book1 = "java basic";
        String book2 = "Python Intro";

        System.out.printf("Trước khi hoán đổi : Book1 = %s , book2 = %s \n", book1 , book2);

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.printf("Sau khi hoán đổi : Book1 = %s , book2 = %s", book1 , book2);


    }
}

// book1, book2, temp là biến tham chiếu, nằm trên Stack
//
//Nội dung "Java Basic" và "Python Intro" là đối tượng String, nằm trên Heap
//
//Khi gán temp = book1, book1 = book2, book2 = temp:
//
//Chỉ thay đổi tham chiếu trên Stack
//
//Không tạo và không sửa nội dung String trong Heap