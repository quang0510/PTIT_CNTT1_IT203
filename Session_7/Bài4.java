package Session_7;

public class Bài4 {
    public static class ClassRoom{
        public static double classFund;
        public String name;

        public ClassRoom(String name) {
            this.name = name;
        }

        public void payFund(double amount){
            classFund += amount;
        }
        public static void showFund(){
            System.out.println("tổng tiền quỹ lớp : " +classFund);
        }

    }

    public static void main(String[] args) {
        ClassRoom std1 = new ClassRoom("Nguyen van a");
        std1.payFund(50);

        ClassRoom std2 = new ClassRoom("nguyễn văn b");
        std2.payFund(100);

        ClassRoom std3 = new ClassRoom("Nguyễn văn c");
        std3.payFund(200);

        ClassRoom.showFund();


    }
}
